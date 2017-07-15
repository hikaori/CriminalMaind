package com.derrick.park.criminalmind.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.derrick.park.criminalmind.Crime;

import java.util.Date;
import java.util.UUID;

/**
 * Created by kaorihirata on 2017-07-08.
 */

public class CrimeCursorWrapper extends CursorWrapper {

    public CrimeCursorWrapper(Cursor coursor) {
        super(coursor);
    }

    public Crime getCrime() {
        String uuidString = getString(getColumnIndexOrThrow(CrimeDbSchema.CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.TITLE));
        long data = getLong(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.DATE));
        int isSolved = getInt(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.SOLVED));
        String suspect = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.SUSPECT));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(data));
        crime.setSolved(isSolved != 0);
        crime.setSuspect(suspect);

        return crime;
    }
}

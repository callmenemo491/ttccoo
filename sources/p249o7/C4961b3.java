package p249o7;

/* renamed from: o7.b3 */
/* loaded from: classes.dex */
public final class C4961b3 extends p249o7.AbstractC5097s3 {

    /* renamed from: c */
    public final p249o7.C4952a3 f19601c;

    /* renamed from: d */
    public boolean f19602d;

    public C4961b3(com.google.android.gms.measurement.internal.C1113d r2) {
            r1 = this;
            r1.<init>(r2)
            o7.a3 r2 = new o7.a3
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            android.content.Context r0 = r0.f5710a
            r2.<init>(r1, r0)
            r1.f19601c = r2
            return
    }

    @Override // p249o7.AbstractC5097s3
    /* renamed from: l */
    public final boolean mo3130l() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: m */
    public final android.database.sqlite.SQLiteDatabase m11106m() {
            r2 = this;
            boolean r0 = r2.f19602d
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            o7.a3 r0 = r2.f19601c
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()
            if (r0 != 0) goto L12
            r0 = 1
            r2.f19602d = r0
            return r1
        L12:
            return r0
    }

    /* renamed from: n */
    public final void m11107n() {
            r3 = this;
            r3.mo3183i()
            android.database.sqlite.SQLiteDatabase r0 = r3.m11106m()     // Catch: android.database.sqlite.SQLiteException -> L24
            if (r0 == 0) goto L23
            java.lang.String r1 = "messages"
            r2 = 0
            int r0 = r0.delete(r1, r2, r2)     // Catch: android.database.sqlite.SQLiteException -> L24
            if (r0 <= 0) goto L23
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a     // Catch: android.database.sqlite.SQLiteException -> L24
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L24
            o7.f3 r1 = r1.f5680n     // Catch: android.database.sqlite.SQLiteException -> L24
            java.lang.String r2 = "Reset local analytics data. records"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: android.database.sqlite.SQLiteException -> L24
            r1.m11170d(r2, r0)     // Catch: android.database.sqlite.SQLiteException -> L24
        L23:
            return
        L24:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r2 = "Error resetting local analytics data. error"
            r1.m11170d(r2, r0)
            return
    }

    /* renamed from: o */
    public final boolean m11108o() {
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.mo3183i()
            boolean r1 = r10.f19602d
            r2 = 0
            if (r1 == 0) goto Lb
            return r2
        Lb:
            com.google.android.gms.measurement.internal.d r1 = r10.f5736a
            android.content.Context r1 = r1.f5710a
            java.lang.String r3 = "google_app_measurement_local.db"
            java.io.File r1 = r1.getDatabasePath(r3)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L98
            r1 = 5
            r3 = 0
            r4 = 5
        L1e:
            if (r3 >= r1) goto L8b
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.m11106m()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L6f
            if (r5 != 0) goto L2b
            r10.f19602d = r6     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L6f
            return r2
        L2b:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L6f
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L6f
            r8 = 3
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L6f
            r7[r2] = r8     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L6f
            java.lang.String r8 = "messages"
            java.lang.String r9 = "type == ?"
            r5.delete(r8, r9, r7)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L6f
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L6f
            r5.endTransaction()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L6f
            r5.close()
            return r6
        L48:
            r0 = move-exception
            goto L85
        L4a:
            r7 = move-exception
            if (r5 == 0) goto L56
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L48
            if (r8 == 0) goto L56
            r5.endTransaction()     // Catch: java.lang.Throwable -> L48
        L56:
            com.google.android.gms.measurement.internal.d r8 = r10.f5736a     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()     // Catch: java.lang.Throwable -> L48
            o7.f3 r8 = r8.f5672f     // Catch: java.lang.Throwable -> L48
            r8.m11170d(r0, r7)     // Catch: java.lang.Throwable -> L48
            r10.f19602d = r6     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L82
            goto L7f
        L66:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L48
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L48
            int r4 = r4 + 20
            if (r5 == 0) goto L82
            goto L7f
        L6f:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r8 = r10.f5736a     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()     // Catch: java.lang.Throwable -> L48
            o7.f3 r8 = r8.f5672f     // Catch: java.lang.Throwable -> L48
            r8.m11170d(r0, r7)     // Catch: java.lang.Throwable -> L48
            r10.f19602d = r6     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L82
        L7f:
            r5.close()
        L82:
            int r3 = r3 + 1
            goto L1e
        L85:
            if (r5 == 0) goto L8a
            r5.close()
        L8a:
            throw r0
        L8b:
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.m11169c(r1)
        L98:
            return r2
    }

    /* renamed from: p */
    public final boolean m11109p(int r17, byte[] r18) {
            r16 = this;
            r1 = r16
            r16.mo3183i()
            boolean r0 = r1.f19602d
            r2 = 0
            if (r0 == 0) goto Lb
            return r2
        Lb:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            java.util.Objects.requireNonNull(r0)
            r4 = 5
            r5 = 0
            r6 = 5
        L28:
            if (r5 >= r4) goto L12f
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.m11106m()     // Catch: java.lang.Throwable -> Lbf android.database.sqlite.SQLiteException -> Lc3 android.database.sqlite.SQLiteDatabaseLockedException -> Lea android.database.sqlite.SQLiteFullException -> Lfc
            if (r9 != 0) goto L35
            r1.f19602d = r8     // Catch: java.lang.Throwable -> Lb6 android.database.sqlite.SQLiteException -> Lb9 android.database.sqlite.SQLiteFullException -> Lbd android.database.sqlite.SQLiteDatabaseLockedException -> Leb
            return r2
        L35:
            r9.beginTransaction()     // Catch: java.lang.Throwable -> Lb6 android.database.sqlite.SQLiteException -> Lb9 android.database.sqlite.SQLiteFullException -> Lbd android.database.sqlite.SQLiteDatabaseLockedException -> Leb
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r7)     // Catch: java.lang.Throwable -> Lb6 android.database.sqlite.SQLiteException -> Lb9 android.database.sqlite.SQLiteFullException -> Lbd android.database.sqlite.SQLiteDatabaseLockedException -> Leb
            r11 = 0
            if (r10 == 0) goto L53
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            if (r0 == 0) goto L53
            long r11 = r10.getLong(r2)     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            goto L53
        L4d:
            r0 = move-exception
            goto Lad
        L4f:
            r0 = move-exception
            goto Lb0
        L51:
            r0 = move-exception
            goto Lb4
        L53:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L9a
            com.google.android.gms.measurement.internal.d r15 = r1.f5736a     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            com.google.android.gms.measurement.internal.b r15 = r15.mo3162d()     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            o7.f3 r15 = r15.f5672f     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            java.lang.String r4 = "Data loss, local db full"
            r15.m11169c(r4)     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            long r13 = r13 - r11
            r11 = 1
            long r13 = r13 + r11
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            r4[r2] = r11     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            java.lang.String r11 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r4 = r9.delete(r0, r11, r4)     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            long r11 = (long) r4     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 == 0) goto L9a
            com.google.android.gms.measurement.internal.d r4 = r1.f5736a     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            o7.f3 r4 = r4.f5672f     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            r4.m11172f(r15, r2, r8, r11)     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
        L9a:
            r9.insertOrThrow(r0, r7, r3)     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            r9.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            r9.endTransaction()     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f android.database.sqlite.SQLiteFullException -> L51 android.database.sqlite.SQLiteDatabaseLockedException -> Lb2
            if (r10 == 0) goto La8
            r10.close()
        La8:
            r9.close()
            r2 = 1
            return r2
        Lad:
            r7 = r10
            goto L124
        Lb0:
            r7 = r10
            goto Lba
        Lb2:
            r7 = r10
            goto Leb
        Lb4:
            r7 = r10
            goto Lfe
        Lb6:
            r0 = move-exception
            goto L124
        Lb9:
            r0 = move-exception
        Lba:
            r2 = r7
            r7 = r9
            goto Lc5
        Lbd:
            r0 = move-exception
            goto Lfe
        Lbf:
            r0 = move-exception
            r9 = r7
            goto L124
        Lc3:
            r0 = move-exception
            r2 = r7
        Lc5:
            if (r7 == 0) goto Ld0
            boolean r4 = r7.inTransaction()     // Catch: java.lang.Throwable -> Le8
            if (r4 == 0) goto Ld0
            r7.endTransaction()     // Catch: java.lang.Throwable -> Le8
        Ld0:
            com.google.android.gms.measurement.internal.d r4 = r1.f5736a     // Catch: java.lang.Throwable -> Le8
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()     // Catch: java.lang.Throwable -> Le8
            o7.f3 r4 = r4.f5672f     // Catch: java.lang.Throwable -> Le8
            java.lang.String r8 = "Error writing entry to local database"
            r4.m11170d(r8, r0)     // Catch: java.lang.Throwable -> Le8
            r4 = 1
            r1.f19602d = r4     // Catch: java.lang.Throwable -> Le8
            if (r2 == 0) goto Le5
            r2.close()
        Le5:
            if (r7 == 0) goto L119
            goto L116
        Le8:
            r0 = move-exception
            goto L122
        Lea:
            r9 = r7
        Leb:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch: java.lang.Throwable -> Lb6
            int r6 = r6 + 20
            if (r7 == 0) goto Lf6
            r7.close()
        Lf6:
            if (r9 == 0) goto L119
            r9.close()
            goto L119
        Lfc:
            r0 = move-exception
            r9 = r7
        Lfe:
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> L11f
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L11f
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L11f
            java.lang.String r4 = "Error writing entry; local database full"
            r2.m11170d(r4, r0)     // Catch: java.lang.Throwable -> L11f
            r2 = 1
            r1.f19602d = r2     // Catch: java.lang.Throwable -> L11f
            if (r7 == 0) goto L113
            r7.close()
        L113:
            if (r9 == 0) goto L119
            r7 = r9
        L116:
            r7.close()
        L119:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L28
        L11f:
            r0 = move-exception
            r2 = r7
            r7 = r9
        L122:
            r9 = r7
            r7 = r2
        L124:
            if (r7 == 0) goto L129
            r7.close()
        L129:
            if (r9 == 0) goto L12e
            r9.close()
        L12e:
            throw r0
        L12f:
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r2 = "Failed to write entry to local database"
            r0.m11169c(r2)
            r2 = 0
            return r2
    }
}

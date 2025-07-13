package p249o7;

/* renamed from: o7.a3 */
/* loaded from: classes.dex */
public final class C4952a3 extends android.database.sqlite.SQLiteOpenHelper {

    /* renamed from: Y */
    public final /* synthetic */ p249o7.C4961b3 f19564Y;

    public C4952a3(p249o7.C4961b3 r3, android.content.Context r4) {
            r2 = this;
            r2.f19564Y = r3
            java.lang.String r3 = "google_app_measurement_local.db"
            r0 = 0
            r1 = 1
            r2.<init>(r4, r3, r0, r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L5 android.database.sqlite.SQLiteDatabaseLockedException -> L53
            return r0
        L5:
            o7.b3 r0 = r3.f19564Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "Opening the local database failed, dropping and recreating it"
            r0.m11169c(r1)
            o7.b3 r0 = r3.f19564Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "google_app_measurement_local.db"
            o7.b3 r1 = r3.f19564Y
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            android.content.Context r1 = r1.f5710a
            java.io.File r1 = r1.getDatabasePath(r0)
            boolean r1 = r1.delete()
            if (r1 != 0) goto L3c
            o7.b3 r1 = r3.f19564Y
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r2 = "Failed to delete corrupted local db file"
            r1.m11170d(r2, r0)
        L3c:
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L41
            return r0
        L41:
            r0 = move-exception
            o7.b3 r1 = r3.f19564Y
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r2 = "Failed to open local database. Events will bypass local storage"
            r1.m11170d(r2, r0)
            r0 = 0
            return r0
        L53:
            r0 = move-exception
            throw r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            o7.b3 r0 = r1.f19564Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            p185k7.C4038x4.m9105r(r0, r2)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase r8) {
            r7 = this;
            o7.b3 r0 = r7.f19564Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String r3 = "messages"
            java.lang.String r4 = "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)"
            java.lang.String r5 = "type,entry"
            r6 = 0
            r2 = r8
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }
}

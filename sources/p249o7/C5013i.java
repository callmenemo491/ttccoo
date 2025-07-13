package p249o7;

/* renamed from: o7.i */
/* loaded from: classes.dex */
public final class C5013i extends android.database.sqlite.SQLiteOpenHelper {

    /* renamed from: Y */
    public final /* synthetic */ p249o7.C5021j f19757Y;

    public C5013i(p249o7.C5021j r3, android.content.Context r4) {
            r2 = this;
            r2.f19757Y = r3
            java.lang.String r3 = "google_app_measurement.db"
            r0 = 0
            r1 = 1
            r2.<init>(r4, r3, r0, r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
            r7 = this;
            o7.j r0 = r7.f19757Y
            e6.p r1 = r0.f19774e
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            java.util.Objects.requireNonNull(r0)
            long r2 = r1.f7464Z
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L12
            goto L29
        L12:
            java.lang.Object r0 = r1.f7463Y
            u6.c r0 = (p353u6.InterfaceC6340c) r0
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.f7464Z
            long r2 = r2 - r0
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 < 0) goto L2b
        L29:
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 == 0) goto L99
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L33
            return r0
        L33:
            o7.j r0 = r7.f19757Y
            e6.p r0 = r0.f19774e
            java.lang.Object r1 = r0.f7463Y
            u6.c r1 = (p353u6.InterfaceC6340c) r1
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.f7464Z = r1
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "Opening the database failed, dropping and recreating it"
            r0.m11169c(r1)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "google_app_measurement.db"
            o7.j r1 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            android.content.Context r1 = r1.f5710a
            java.io.File r1 = r1.getDatabasePath(r0)
            boolean r1 = r1.delete()
            if (r1 != 0) goto L7d
            o7.j r1 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r2 = "Failed to delete corrupted db file"
            r1.m11170d(r2, r0)
        L7d:
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L88
            o7.j r1 = r7.f19757Y     // Catch: android.database.sqlite.SQLiteException -> L88
            e6.p r1 = r1.f19774e     // Catch: android.database.sqlite.SQLiteException -> L88
            r1.f7464Z = r4     // Catch: android.database.sqlite.SQLiteException -> L88
            return r0
        L88:
            r0 = move-exception
            o7.j r1 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r2 = "Failed to open freshly created database"
            r1.m11170d(r2, r0)
            throw r0
        L99:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            java.lang.String r1 = "Database open failed"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            o7.j r0 = r1.f19757Y
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
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String[] r6 = p249o7.C5021j.f19765f
            java.lang.String r3 = "events"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;"
            java.lang.String r5 = "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp"
            r2 = r8
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String r3 = "conditional_properties"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;"
            java.lang.String r5 = "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event"
            r6 = 0
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String[] r6 = p249o7.C5021j.f19766g
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;"
            java.lang.String r5 = "app_id,name,set_timestamp,value"
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String[] r6 = p249o7.C5021j.f19767h
            java.lang.String r3 = "apps"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;"
            java.lang.String r5 = "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp"
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String[] r6 = p249o7.C5021j.f19769j
            java.lang.String r3 = "queue"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);"
            java.lang.String r5 = "app_id,bundle_end_timestamp,data"
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String r3 = "raw_events_metadata"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));"
            java.lang.String r5 = "app_id,metadata_fingerprint,metadata"
            r6 = 0
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String[] r6 = p249o7.C5021j.f19768i
            java.lang.String r3 = "raw_events"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);"
            java.lang.String r5 = "app_id,name,timestamp,metadata_fingerprint,data"
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String[] r6 = p249o7.C5021j.f19770k
            java.lang.String r3 = "event_filters"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));"
            java.lang.String r5 = "app_id,audience_id,filter_id,event_name,data"
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String[] r6 = p249o7.C5021j.f19771l
            java.lang.String r3 = "property_filters"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));"
            java.lang.String r5 = "app_id,audience_id,filter_id,property_name,data"
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String r3 = "audience_filter_values"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));"
            java.lang.String r5 = "app_id,audience_id,current_results"
            r6 = 0
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String[] r6 = p249o7.C5021j.f19772m
            java.lang.String r3 = "app2"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));"
            java.lang.String r5 = "app_id,first_open_count"
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String r3 = "main_event_params"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));"
            java.lang.String r5 = "app_id,event_id,children_to_process,main_event"
            r6 = 0
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String r3 = "default_event_params"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));"
            java.lang.String r5 = "app_id,parameters"
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            o7.j r0 = r7.f19757Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.mo3162d()
            java.lang.String r3 = "consent_settings"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));"
            java.lang.String r5 = "app_id,consent_state"
            p185k7.C4038x4.m9104q(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }
}

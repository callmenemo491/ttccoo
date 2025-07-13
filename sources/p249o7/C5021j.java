package p249o7;

/* renamed from: o7.j */
/* loaded from: classes.dex */
public final class C5021j extends p249o7.AbstractC5020i6 {

    /* renamed from: f */
    public static final java.lang.String[] f19765f = null;

    /* renamed from: g */
    public static final java.lang.String[] f19766g = null;

    /* renamed from: h */
    public static final java.lang.String[] f19767h = null;

    /* renamed from: i */
    public static final java.lang.String[] f19768i = null;

    /* renamed from: j */
    public static final java.lang.String[] f19769j = null;

    /* renamed from: k */
    public static final java.lang.String[] f19770k = null;

    /* renamed from: l */
    public static final java.lang.String[] f19771l = null;

    /* renamed from: m */
    public static final java.lang.String[] f19772m = null;

    /* renamed from: d */
    public final p249o7.C5013i f19773d;

    /* renamed from: e */
    public final p071e6.C1541p f19774e;

    static {
            java.lang.String r0 = "last_bundled_timestamp"
            java.lang.String r1 = "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;"
            java.lang.String r2 = "last_bundled_day"
            java.lang.String r3 = "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;"
            java.lang.String r4 = "last_sampled_complex_event_id"
            java.lang.String r5 = "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;"
            java.lang.String r6 = "last_sampling_rate"
            java.lang.String r7 = "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;"
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"
            java.lang.String r10 = "current_session_count"
            java.lang.String r11 = "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            p249o7.C5021j.f19765f = r0
            java.lang.String r0 = "origin"
            java.lang.String r1 = "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            p249o7.C5021j.f19766g = r0
            java.lang.String r1 = "app_version"
            java.lang.String r2 = "ALTER TABLE apps ADD COLUMN app_version TEXT;"
            java.lang.String r3 = "app_store"
            java.lang.String r4 = "ALTER TABLE apps ADD COLUMN app_store TEXT;"
            java.lang.String r5 = "gmp_version"
            java.lang.String r6 = "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;"
            java.lang.String r7 = "dev_cert_hash"
            java.lang.String r8 = "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;"
            java.lang.String r9 = "measurement_enabled"
            java.lang.String r10 = "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;"
            java.lang.String r11 = "last_bundle_start_timestamp"
            java.lang.String r12 = "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;"
            java.lang.String r13 = "day"
            java.lang.String r14 = "ALTER TABLE apps ADD COLUMN day INTEGER;"
            java.lang.String r15 = "daily_public_events_count"
            java.lang.String r16 = "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;"
            java.lang.String r17 = "daily_events_count"
            java.lang.String r18 = "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;"
            java.lang.String r21 = "remote_config"
            java.lang.String r22 = "ALTER TABLE apps ADD COLUMN remote_config BLOB;"
            java.lang.String r23 = "config_fetched_time"
            java.lang.String r24 = "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;"
            java.lang.String r25 = "failed_config_fetch_time"
            java.lang.String r26 = "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;"
            java.lang.String r27 = "app_version_int"
            java.lang.String r28 = "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;"
            java.lang.String r29 = "firebase_instance_id"
            java.lang.String r30 = "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;"
            java.lang.String r31 = "daily_error_events_count"
            java.lang.String r32 = "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;"
            java.lang.String r33 = "daily_realtime_events_count"
            java.lang.String r34 = "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;"
            java.lang.String r35 = "health_monitor_sample"
            java.lang.String r36 = "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;"
            java.lang.String r37 = "android_id"
            java.lang.String r38 = "ALTER TABLE apps ADD COLUMN android_id INTEGER;"
            java.lang.String r39 = "adid_reporting_enabled"
            java.lang.String r40 = "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;"
            java.lang.String r41 = "ssaid_reporting_enabled"
            java.lang.String r42 = "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;"
            java.lang.String r43 = "admob_app_id"
            java.lang.String r44 = "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;"
            java.lang.String r45 = "linked_admob_app_id"
            java.lang.String r46 = "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;"
            java.lang.String r47 = "dynamite_version"
            java.lang.String r48 = "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;"
            java.lang.String r49 = "safelisted_events"
            java.lang.String r50 = "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;"
            java.lang.String r51 = "ga_app_id"
            java.lang.String r52 = "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"
            java.lang.String r53 = "config_last_modified_time"
            java.lang.String r54 = "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54}
            p249o7.C5021j.f19767h = r0
            java.lang.String r0 = "realtime"
            java.lang.String r1 = "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            p249o7.C5021j.f19768i = r0
            java.lang.String r0 = "has_realtime"
            java.lang.String r1 = "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;"
            java.lang.String r2 = "retry_count"
            java.lang.String r3 = "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            p249o7.C5021j.f19769j = r0
            java.lang.String r0 = "session_scoped"
            java.lang.String r1 = "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1}
            p249o7.C5021j.f19770k = r1
            java.lang.String r1 = "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            p249o7.C5021j.f19771l = r0
            java.lang.String r0 = "previous_install_count"
            java.lang.String r1 = "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            p249o7.C5021j.f19772m = r0
            return
    }

    public C5021j(p249o7.C5052m6 r2) {
            r1 = this;
            r1.<init>(r2)
            e6.p r2 = new e6.p
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            u6.c r0 = r0.f5723n
            r2.<init>(r0)
            r1.f19774e = r2
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            java.util.Objects.requireNonNull(r2)
            o7.i r2 = new o7.i
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            android.content.Context r0 = r0.f5710a
            r2.<init>(r1, r0)
            r1.f19773d = r2
            return
    }

    /* renamed from: x */
    public static final void m11249x(android.content.ContentValues r1, java.lang.String r2, java.lang.Object r3) {
            java.lang.String r2 = "value"
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L14
            java.lang.String r3 = (java.lang.String) r3
            r1.put(r2, r3)
            return
        L14:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L1e
            java.lang.Long r3 = (java.lang.Long) r3
            r1.put(r2, r3)
            return
        L1e:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L28
            java.lang.Double r3 = (java.lang.Double) r3
            r1.put(r2, r3)
            return
        L28:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid value type"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: A */
    public final long m11250A(java.lang.String r3, java.lang.String[] r4, long r5) {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.m11253D()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L1c android.database.sqlite.SQLiteException -> L1e
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1c android.database.sqlite.SQLiteException -> L1e
            if (r4 == 0) goto L18
            r4 = 0
            long r3 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L1c android.database.sqlite.SQLiteException -> L1e
            r1.close()
            return r3
        L18:
            r1.close()
            return r5
        L1c:
            r3 = move-exception
            goto L2d
        L1e:
            r4 = move-exception
            com.google.android.gms.measurement.internal.d r5 = r2.f5736a     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> L1c
            o7.f3 r5 = r5.f5672f     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = "Database error"
            r5.m11171e(r6, r3, r4)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L2d:
            if (r1 == 0) goto L32
            r1.close()
        L32:
            throw r3
    }

    /* renamed from: B */
    public final long m11251B(java.lang.String r18, java.lang.String r19) {
            r17 = this;
            r1 = r17
            r2 = r18
            com.google.android.gms.common.internal.C1101a.m3100e(r18)
            java.lang.String r3 = "first_open_count"
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            r17.mo3183i()
            r17.m11247j()
            android.database.sqlite.SQLiteDatabase r4 = r17.m11253D()
            r4.beginTransaction()
            r5 = 0
            java.lang.String r0 = "select first_open_count from app2 where app_id=?"
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            r9 = 0
            r8[r9] = r2     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            r10 = -1
            long r12 = r1.m11250A(r0, r8, r10)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            java.lang.String r0 = "app2"
            java.lang.String r8 = "app_id"
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 != 0) goto L65
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            r12.<init>()     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            r12.put(r8, r2)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            r12.put(r3, r13)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            java.lang.String r14 = "previous_install_count"
            r12.put(r14, r13)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            r13 = 0
            r14 = 5
            long r12 = r4.insertWithOnConflict(r0, r13, r12, r14)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 != 0) goto L64
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            java.lang.String r7 = "Failed to insert column (got -1). appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1111b.m3134u(r18)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            r0.m11171e(r7, r8, r3)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteException -> La7
            r4.endTransaction()
            return r10
        L64:
            r12 = r5
        L65:
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            r14.<init>()     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            r14.put(r8, r2)     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            r15 = 1
            long r15 = r15 + r12
            java.lang.Long r8 = java.lang.Long.valueOf(r15)     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            r14.put(r3, r8)     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            r7[r9] = r2     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            java.lang.String r8 = "app_id = ?"
            int r0 = r4.update(r0, r14, r8, r7)     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            long r7 = (long) r0     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L9b
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            o7.f3 r0 = r0.f5672f     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            java.lang.String r5 = "Failed to update column (got 0). appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1111b.m3134u(r18)     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            r0.m11171e(r5, r6, r3)     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            r4.endTransaction()
            return r10
        L9b:
            r4.setTransactionSuccessful()     // Catch: android.database.sqlite.SQLiteException -> La2 java.lang.Throwable -> La5
            r4.endTransaction()
            goto Lbd
        La2:
            r0 = move-exception
            r5 = r12
            goto La8
        La5:
            r0 = move-exception
            goto Lbe
        La7:
            r0 = move-exception
        La8:
            com.google.android.gms.measurement.internal.d r7 = r1.f5736a     // Catch: java.lang.Throwable -> La5
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()     // Catch: java.lang.Throwable -> La5
            o7.f3 r7 = r7.f5672f     // Catch: java.lang.Throwable -> La5
            java.lang.String r8 = "Error inserting column. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1111b.m3134u(r18)     // Catch: java.lang.Throwable -> La5
            r7.m11172f(r8, r2, r3, r0)     // Catch: java.lang.Throwable -> La5
            r4.endTransaction()
            r12 = r5
        Lbd:
            return r12
        Lbe:
            r4.endTransaction()
            throw r0
    }

    /* renamed from: C */
    public final long m11252C(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.common.internal.C1101a.m3100e(r4)
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "select count(1) from events where app_id=? and name not like '!_%' escape '!'"
            r1 = 0
            long r0 = r3.m11250A(r4, r0, r1)
            return r0
    }

    /* renamed from: D */
    public final android.database.sqlite.SQLiteDatabase m11253D() {
            r3 = this;
            r3.mo3183i()
            o7.i r0 = r3.f19773d     // Catch: android.database.sqlite.SQLiteException -> La
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> La
            return r0
        La:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5675i
            java.lang.String r2 = "Error opening database"
            r1.m11170d(r2, r0)
            throw r0
    }

    /* renamed from: E */
    public final android.os.Bundle m11254E(java.lang.String r8) {
            r7 = this;
            r7.mo3183i()
            r7.m11247j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.m11253D()     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            r3 = 0
            r2[r3] = r8     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            if (r2 != 0) goto L31
            com.google.android.gms.measurement.internal.d r8 = r7.f5736a     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            o7.f3 r8 = r8.f5680n     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            java.lang.String r2 = "Default event parameters not found"
            r8.m11169c(r2)     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            r1.close()
            return r0
        L2e:
            r8 = move-exception
            goto Lbf
        L31:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            k7.t2 r3 = p185k7.C3997u2.m9040w()     // Catch: android.database.sqlite.SQLiteException -> L2e java.io.IOException -> La5 java.lang.Throwable -> Ld2
            k7.y4 r2 = p249o7.C5068o6.m11380D(r3, r2)     // Catch: android.database.sqlite.SQLiteException -> L2e java.io.IOException -> La5 java.lang.Throwable -> Ld2
            k7.t2 r2 = (p185k7.C3984t2) r2     // Catch: android.database.sqlite.SQLiteException -> L2e java.io.IOException -> La5 java.lang.Throwable -> Ld2
            k7.d6 r2 = r2.m8201f()     // Catch: android.database.sqlite.SQLiteException -> L2e java.io.IOException -> La5 java.lang.Throwable -> Ld2
            k7.u2 r2 = (p185k7.C3997u2) r2     // Catch: android.database.sqlite.SQLiteException -> L2e java.io.IOException -> La5 java.lang.Throwable -> Ld2
            o7.m6 r8 = r7.f19756b     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            o7.o6 r8 = r8.f19866g     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            p249o7.C5052m6.m11327I(r8)     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            java.util.List r8 = r2.m9042A()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
        L59:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            if (r3 == 0) goto La1
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            k7.y2 r3 = (p185k7.C4049y2) r3     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            java.lang.String r4 = r3.m9148y()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            boolean r5 = r3.m9139L()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            if (r5 == 0) goto L77
            double r5 = r3.m9144s()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            goto L59
        L77:
            boolean r5 = r3.m9140M()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            if (r5 == 0) goto L85
            float r3 = r3.m9145t()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            goto L59
        L85:
            boolean r5 = r3.m9143P()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            if (r5 == 0) goto L93
            java.lang.String r3 = r3.m9149z()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            goto L59
        L93:
            boolean r5 = r3.m9141N()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            if (r5 == 0) goto L59
            long r5 = r3.m9147v()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            goto L59
        La1:
            r1.close()
            return r2
        La5:
            r2 = move-exception
            com.google.android.gms.measurement.internal.d r3 = r7.f5736a     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            o7.f3 r3 = r3.f5672f     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1111b.m3134u(r8)     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            r3.m11171e(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> Ld2
            r1.close()
            return r0
        Lbb:
            r8 = move-exception
            goto Ld4
        Lbd:
            r8 = move-exception
            r1 = r0
        Lbf:
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a     // Catch: java.lang.Throwable -> Ld2
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> Ld2
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r3 = "Error selecting default event parameters"
            r2.m11170d(r3, r8)     // Catch: java.lang.Throwable -> Ld2
            if (r1 == 0) goto Ld1
            r1.close()
        Ld1:
            return r0
        Ld2:
            r8 = move-exception
            r0 = r1
        Ld4:
            if (r0 == 0) goto Ld9
            r0.close()
        Ld9:
            throw r8
    }

    /* renamed from: F */
    public final p249o7.C5010h4 m11255F(java.lang.String r34) {
            r33 = this;
            r1 = r33
            r2 = r34
            com.google.android.gms.common.internal.C1101a.m3100e(r34)
            r33.mo3183i()
            r33.m11247j()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r33.m11253D()     // Catch: java.lang.Throwable -> L26f android.database.sqlite.SQLiteException -> L271
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}     // Catch: java.lang.Throwable -> L26f android.database.sqlite.SQLiteException -> L271
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L26f android.database.sqlite.SQLiteException -> L271
            r12 = 0
            r8[r12] = r2     // Catch: java.lang.Throwable -> L26f android.database.sqlite.SQLiteException -> L271
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L26f android.database.sqlite.SQLiteException -> L271
            boolean r5 = r4.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            if (r5 != 0) goto L69
            r4.close()
            return r3
        L69:
            o7.h4 r5 = new o7.h4     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.m6 r6 = r1.f19756b     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            com.google.android.gms.measurement.internal.d r6 = r6.f19871l     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.<init>(r6, r2)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            java.lang.String r6 = r4.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11225f(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            java.lang.String r6 = r4.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11235p(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11243x(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11240u(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11241v(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11239t(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11227h(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11226g(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11236q(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11230k(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            if (r7 != 0) goto Ld3
            int r6 = r4.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            if (r6 == 0) goto Ld1
            goto Ld3
        Ld1:
            r6 = 0
            goto Ld4
        Ld3:
            r6 = 1
        Ld4:
            r5.m11242w(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            com.google.android.gms.measurement.internal.d r8 = r5.f19730a     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.f4 r8 = r8.mo3160b()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r8.mo3183i()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            boolean r8 = r5.f19727D     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            long r9 = r5.f19752w     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto Lf0
            r9 = 1
            goto Lf1
        Lf0:
            r9 = 0
        Lf1:
            r8 = r8 | r9
            r5.f19727D = r8     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.f19752w = r6     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            com.google.android.gms.measurement.internal.d r8 = r5.f19730a     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.f4 r8 = r8.mo3160b()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r8.mo3183i()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            boolean r8 = r5.f19727D     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            long r9 = r5.f19753x     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L10f
            r9 = 1
            goto L110
        L10f:
            r9 = 0
        L110:
            r8 = r8 | r9
            r5.f19727D = r8     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.f19753x = r6     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            com.google.android.gms.measurement.internal.d r8 = r5.f19730a     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.f4 r8 = r8.mo3160b()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r8.mo3183i()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            boolean r8 = r5.f19727D     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            long r9 = r5.f19754y     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L12e
            r9 = 1
            goto L12f
        L12e:
            r9 = 0
        L12f:
            r8 = r8 | r9
            r5.f19727D = r8     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.f19754y = r6     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            com.google.android.gms.measurement.internal.d r8 = r5.f19730a     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.f4 r8 = r8.mo3160b()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r8.mo3183i()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            boolean r8 = r5.f19727D     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            long r9 = r5.f19755z     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L14d
            r9 = 1
            goto L14e
        L14d:
            r9 = 0
        L14e:
            r8 = r8 | r9
            r5.f19727D = r8     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.f19755z = r6     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11229j(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11232m(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            if (r7 == 0) goto L171
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L176
        L171:
            int r6 = r4.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            long r6 = (long) r6     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
        L176:
            r5.m11228i(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11233n(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            com.google.android.gms.measurement.internal.d r8 = r5.f19730a     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.f4 r8 = r8.mo3160b()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r8.mo3183i()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            boolean r8 = r5.f19727D     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            long r9 = r5.f19724A     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L19b
            r9 = 1
            goto L19c
        L19b:
            r9 = 0
        L19c:
            r8 = r8 | r9
            r5.f19727D = r8     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.f19724A = r6     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            com.google.android.gms.measurement.internal.d r8 = r5.f19730a     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.f4 r8 = r8.mo3160b()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r8.mo3183i()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            boolean r8 = r5.f19727D     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            long r9 = r5.f19725B     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L1ba
            r9 = 1
            goto L1bb
        L1ba:
            r9 = 0
        L1bb:
            r8 = r8 | r9
            r5.f19727D = r8     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.f19725B = r6     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11238s(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            com.google.android.gms.measurement.internal.d r6 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.f r6 = r6.f5716g     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.u2<java.lang.Boolean> r7 = p249o7.C5120v2.f20107m0     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            boolean r6 = r6.m11162v(r3, r7)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r7 = 0
            if (r6 != 0) goto L1e8
            r6 = 22
            boolean r9 = r4.isNull(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            if (r9 == 0) goto L1e1
            r9 = r7
            goto L1e5
        L1e1:
            long r9 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
        L1e5:
            r5.m11224e(r9)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
        L1e8:
            r6 = 23
            boolean r9 = r4.isNull(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            if (r9 != 0) goto L1f8
            int r6 = r4.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            if (r6 == 0) goto L1f7
            goto L1f8
        L1f7:
            r0 = 0
        L1f8:
            r5.m11223d(r0)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11222c(r0)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            if (r6 == 0) goto L20d
            goto L211
        L20d:
            long r7 = r4.getLong(r0)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
        L211:
            r5.m11231l(r7)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            if (r6 != 0) goto L22e
            java.lang.String r0 = r4.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11244y(r0)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
        L22e:
            p185k7.C3847ia.m8706c()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.f r0 = r0.f5716g     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.u2<java.lang.Boolean> r6 = p249o7.C5120v2.f20089d0     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            boolean r0 = r0.m11162v(r2, r6)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            if (r0 == 0) goto L246
            r0 = 27
            java.lang.String r0 = r4.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.m11234o(r0)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
        L246:
            com.google.android.gms.measurement.internal.d r0 = r5.f19730a     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.f4 r0 = r0.mo3160b()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r0.mo3183i()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r5.f19727D = r12     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            boolean r0 = r4.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            if (r0 == 0) goto L26b
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            o7.f3 r0 = r0.f5672f     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1111b.m3134u(r34)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            r0.m11170d(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L269 java.lang.Throwable -> L28a
            goto L26b
        L269:
            r0 = move-exception
            goto L273
        L26b:
            r4.close()
            return r5
        L26f:
            r0 = move-exception
            goto L28c
        L271:
            r0 = move-exception
            r4 = r3
        L273:
            com.google.android.gms.measurement.internal.d r5 = r1.f5736a     // Catch: java.lang.Throwable -> L28a
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> L28a
            o7.f3 r5 = r5.f5672f     // Catch: java.lang.Throwable -> L28a
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1111b.m3134u(r34)     // Catch: java.lang.Throwable -> L28a
            r5.m11171e(r6, r2, r0)     // Catch: java.lang.Throwable -> L28a
            if (r4 == 0) goto L289
            r4.close()
        L289:
            return r3
        L28a:
            r0 = move-exception
            r3 = r4
        L28c:
            if (r3 == 0) goto L291
            r3.close()
        L291:
            throw r0
    }

    /* renamed from: G */
    public final p249o7.C4957b m11256G(java.lang.String r31, java.lang.String r32) {
            r30 = this;
            r1 = r30
            r8 = r32
            com.google.android.gms.common.internal.C1101a.m3100e(r31)
            com.google.android.gms.common.internal.C1101a.m3100e(r32)
            r30.mo3183i()
            r30.m11247j()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.m11253D()     // Catch: java.lang.Throwable -> Lf4 android.database.sqlite.SQLiteException -> Lf6
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch: java.lang.Throwable -> Lf4 android.database.sqlite.SQLiteException -> Lf6
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Lf4 android.database.sqlite.SQLiteException -> Lf6
            r2 = 0
            r14[r2] = r31     // Catch: java.lang.Throwable -> Lf4 android.database.sqlite.SQLiteException -> Lf6
            r3 = 1
            r14[r3] = r8     // Catch: java.lang.Throwable -> Lf4 android.database.sqlite.SQLiteException -> Lf6
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lf4 android.database.sqlite.SQLiteException -> Lf6
            boolean r4 = r10.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            if (r4 != 0) goto L4f
            r10.close()
            return r9
        L4f:
            java.lang.String r17 = r10.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            java.lang.Object r6 = r1.m11261L(r10, r3)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            int r0 = r10.getInt(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            if (r0 == 0) goto L60
            r21 = 1
            goto L62
        L60:
            r21 = 0
        L62:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            o7.m6 r0 = r1.f19756b     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            o7.o6 r0 = r0.f19866g     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            p249o7.C5052m6.m11327I(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            android.os.Parcelable$Creator<o7.q> r3 = p249o7.C5077q.CREATOR     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            android.os.Parcelable r0 = r0.m11395A(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r23 = r0
            o7.q r23 = (p249o7.C5077q) r23     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            o7.m6 r0 = r1.f19756b     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            o7.o6 r0 = r0.f19866g     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            p249o7.C5052m6.m11327I(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            android.os.Parcelable r0 = r0.m11395A(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r26 = r0
            o7.q r26 = (p249o7.C5077q) r26     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            o7.m6 r0 = r1.f19756b     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            o7.o6 r0 = r0.f19866g     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            p249o7.C5052m6.m11327I(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            android.os.Parcelable r0 = r0.m11395A(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r29 = r0
            o7.q r29 = (p249o7.C5077q) r29     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            o7.p6 r18 = new o7.p6     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            o7.b r0 = new o7.b     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            boolean r2 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            if (r2 == 0) goto Lee
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            o7.f3 r2 = r2.f5672f     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r31)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            com.google.android.gms.measurement.internal.d r5 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            o7.c3 r5 = r5.f5722m     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            java.lang.String r5 = r5.m11118f(r8)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
            r2.m11171e(r3, r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L117
        Lee:
            r10.close()
            return r0
        Lf2:
            r0 = move-exception
            goto Lf8
        Lf4:
            r0 = move-exception
            goto L119
        Lf6:
            r0 = move-exception
            r10 = r9
        Lf8:
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> L117
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L117
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L117
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r31)     // Catch: java.lang.Throwable -> L117
            com.google.android.gms.measurement.internal.d r5 = r1.f5736a     // Catch: java.lang.Throwable -> L117
            o7.c3 r5 = r5.f5722m     // Catch: java.lang.Throwable -> L117
            java.lang.String r5 = r5.m11118f(r8)     // Catch: java.lang.Throwable -> L117
            r2.m11172f(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L117
            if (r10 == 0) goto L116
            r10.close()
        L116:
            return r9
        L117:
            r0 = move-exception
            r9 = r10
        L119:
            if (r9 == 0) goto L11e
            r9.close()
        L11e:
            throw r0
    }

    /* renamed from: H */
    public final p249o7.C5005h m11257H(long r12, java.lang.String r14, boolean r15, boolean r16) {
            r11 = this;
            r4 = 1
            r6 = 0
            r7 = 0
            r9 = 0
            r0 = r11
            r1 = r12
            r3 = r14
            r8 = r15
            r10 = r16
            o7.h r0 = r0.m11258I(r1, r3, r4, r6, r7, r8, r9, r10)
            return r0
    }

    /* renamed from: I */
    public final p249o7.C5005h m11258I(long r16, java.lang.String r18, long r19, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25) {
            r15 = this;
            r1 = r15
            com.google.android.gms.common.internal.C1101a.m3100e(r18)
            r15.mo3183i()
            r15.m11247j()
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r3 = 0
            r2[r3] = r18
            o7.h r4 = new o7.h
            r4.<init>()
            r5 = 0
            android.database.sqlite.SQLiteDatabase r14 = r15.m11253D()     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.String r6 = "day"
            java.lang.String r7 = "daily_events_count"
            java.lang.String r8 = "daily_public_events_count"
            java.lang.String r9 = "daily_conversions_count"
            java.lang.String r10 = "daily_error_events_count"
            java.lang.String r11 = "daily_realtime_events_count"
            java.lang.String[] r8 = new java.lang.String[]{r6, r7, r8, r9, r10, r11}     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r10[r3] = r18     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.String r7 = "apps"
            java.lang.String r9 = "app_id=?"
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r14
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            boolean r6 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            if (r6 != 0) goto L5b
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            o7.f3 r0 = r0.f5675i     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.String r2 = "Not updating daily counts, app is not known. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r18)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r0.m11170d(r2, r3)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r5.close()
            return r4
        L55:
            r0 = move-exception
            goto L114
        L58:
            r0 = move-exception
            goto Lfd
        L5b:
            long r6 = r5.getLong(r3)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            int r3 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r3 != 0) goto L85
            long r6 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r4.f19712b = r6     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r0 = 2
            long r6 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r4.f19711a = r6     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r0 = 3
            long r6 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r4.f19713c = r6     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r0 = 4
            long r6 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r4.f19714d = r6     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r0 = 5
            long r6 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r4.f19715e = r6     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
        L85:
            if (r21 == 0) goto L8d
            long r6 = r4.f19712b     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            long r6 = r6 + r19
            r4.f19712b = r6     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
        L8d:
            if (r22 == 0) goto L95
            long r6 = r4.f19711a     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            long r6 = r6 + r19
            r4.f19711a = r6     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
        L95:
            if (r23 == 0) goto L9d
            long r6 = r4.f19713c     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            long r6 = r6 + r19
            r4.f19713c = r6     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
        L9d:
            if (r24 == 0) goto La5
            long r6 = r4.f19714d     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            long r6 = r6 + r19
            r4.f19714d = r6     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
        La5:
            if (r25 == 0) goto Lad
            long r6 = r4.f19715e     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            long r6 = r6 + r19
            r4.f19715e = r6     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
        Lad:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r0.<init>()     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.String r3 = "day"
            java.lang.Long r6 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.String r3 = "daily_public_events_count"
            long r6 = r4.f19711a     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.String r3 = "daily_events_count"
            long r6 = r4.f19712b     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.String r3 = "daily_conversions_count"
            long r6 = r4.f19713c     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.String r3 = "daily_error_events_count"
            long r6 = r4.f19714d     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.String r3 = "daily_realtime_events_count"
            long r6 = r4.f19715e     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            java.lang.String r3 = "apps"
            java.lang.String r6 = "app_id=?"
            r14.update(r3, r0, r6, r2)     // Catch: java.lang.Throwable -> L55 android.database.sqlite.SQLiteException -> L58
            r5.close()
            return r4
        Lfd:
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L55
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "Error updating daily counts. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1111b.m3134u(r18)     // Catch: java.lang.Throwable -> L55
            r2.m11171e(r3, r6, r0)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L113
            r5.close()
        L113:
            return r4
        L114:
            if (r5 == 0) goto L119
            r5.close()
        L119:
            throw r0
    }

    /* renamed from: J */
    public final p249o7.C5053n m11259J(java.lang.String r28, java.lang.String r29) {
            r27 = this;
            r1 = r27
            r15 = r29
            com.google.android.gms.common.internal.C1101a.m3100e(r28)
            com.google.android.gms.common.internal.C1101a.m3100e(r29)
            r27.mo3183i()
            r27.m11247j()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.m11253D()     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            r6[r10] = r28     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            r11 = 1
            r6[r11] = r15     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            boolean r2 = r13.moveToFirst()     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            if (r2 != 0) goto L5c
            r13.close()
            return r19
        L5c:
            long r5 = r13.getLong(r10)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            long r7 = r13.getLong(r11)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            long r16 = r13.getLong(r0)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r3 = 0
            if (r2 == 0) goto L74
            r20 = r3
            goto L78
        L74:
            long r20 = r13.getLong(r0)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
        L78:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            if (r2 == 0) goto L82
            r0 = r19
            goto L8a
        L82:
            long r22 = r13.getLong(r0)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
        L8a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            if (r9 == 0) goto L94
            r18 = r19
            goto L9e
        L94:
            long r22 = r13.getLong(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r18 = r2
        L9e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            if (r9 == 0) goto La8
            r22 = r19
            goto Lb2
        La8:
            long r22 = r13.getLong(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r22 = r2
        Lb2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            if (r9 != 0) goto Lcb
            long r23 = r13.getLong(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto Lc4
            r10 = 1
        Lc4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r23 = r2
            goto Lcd
        Lcb:
            r23 = r19
        Lcd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            if (r9 == 0) goto Ld7
            r9 = r3
            goto Ldc
        Ld7:
            long r2 = r13.getLong(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r9 = r2
        Ldc:
            o7.n r24 = new o7.n     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            boolean r0 = r25.moveToNext()     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            if (r0 == 0) goto L10b
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r28)     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            r0.m11170d(r2, r3)     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
        L10b:
            r25.close()
            return r24
        L10f:
            r0 = move-exception
            goto L116
        L111:
            r0 = move-exception
            goto L11c
        L113:
            r0 = move-exception
            r25 = r13
        L116:
            r19 = r25
            goto L148
        L119:
            r0 = move-exception
            r25 = r13
        L11c:
            r13 = r25
            goto L124
        L11f:
            r0 = move-exception
            goto L148
        L121:
            r0 = move-exception
            r13 = r19
        L124:
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> L145
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L145
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L145
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r28)     // Catch: java.lang.Throwable -> L145
            com.google.android.gms.measurement.internal.d r5 = r1.f5736a     // Catch: java.lang.Throwable -> L145
            o7.c3 r5 = r5.f5722m     // Catch: java.lang.Throwable -> L145
            r6 = r29
            java.lang.String r5 = r5.m11116d(r6)     // Catch: java.lang.Throwable -> L145
            r2.m11172f(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L145
            if (r13 == 0) goto L144
            r13.close()
        L144:
            return r19
        L145:
            r0 = move-exception
            r19 = r13
        L148:
            if (r19 == 0) goto L14d
            r19.close()
        L14d:
            throw r0
    }

    /* renamed from: K */
    public final p249o7.C5092r6 m11260K(java.lang.String r20, java.lang.String r21) {
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.C1101a.m3100e(r20)
            com.google.android.gms.common.internal.C1101a.m3100e(r21)
            r19.mo3183i()
            r19.m11247j()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.m11253D()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> L9d
            if (r4 != 0) goto L40
            r11.close()
            return r10
        L40:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> L9d
            java.lang.Object r8 = r1.m11261L(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> L9d
            if (r8 != 0) goto L4e
            r11.close()
            return r10
        L4e:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> L9d
            o7.r6 r0 = new o7.r6     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> L9d
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> L9d
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> L9d
            if (r2 == 0) goto L76
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> L9d
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> L9d
            o7.f3 r2 = r2.f5672f     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> L9d
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r20)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> L9d
            r2.m11170d(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> L9d
            goto L76
        L74:
            r0 = move-exception
            goto L7e
        L76:
            r11.close()
            return r0
        L7a:
            r0 = move-exception
            goto L9f
        L7c:
            r0 = move-exception
            r11 = r10
        L7e:
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> L9d
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L9d
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r20)     // Catch: java.lang.Throwable -> L9d
            com.google.android.gms.measurement.internal.d r5 = r1.f5736a     // Catch: java.lang.Throwable -> L9d
            o7.c3 r5 = r5.f5722m     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = r5.m11118f(r9)     // Catch: java.lang.Throwable -> L9d
            r2.m11172f(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L9d
            if (r11 == 0) goto L9c
            r11.close()
        L9c:
            return r10
        L9d:
            r0 = move-exception
            r10 = r11
        L9f:
            if (r10 == 0) goto La4
            r10.close()
        La4:
            throw r0
    }

    /* renamed from: L */
    public final java.lang.Object m11261L(android.database.Cursor r4, int r5) {
            r3 = this;
            int r0 = r4.getType(r5)
            r1 = 0
            if (r0 == 0) goto L4a
            r2 = 1
            if (r0 == r2) goto L41
            r2 = 2
            if (r0 == r2) goto L38
            r2 = 3
            if (r0 == r2) goto L33
            r4 = 4
            if (r0 == r4) goto L25
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5672f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "Loaded invalid unknown value type, ignoring it"
            r4.m11170d(r0, r5)
            return r1
        L25:
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5672f
            java.lang.String r5 = "Loaded invalid blob type value, ignoring it"
            r4.m11169c(r5)
            return r1
        L33:
            java.lang.String r4 = r4.getString(r5)
            return r4
        L38:
            double r4 = r4.getDouble(r5)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
        L41:
            long r4 = r4.getLong(r5)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L4a:
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5672f
            java.lang.String r5 = "Loaded invalid null value from database"
            r4.m11169c(r5)
            return r1
    }

    /* renamed from: M */
    public final java.lang.String m11262M() {
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m11253D()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L38
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L38
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3c
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            com.google.android.gms.measurement.internal.d r3 = r6.f5736a     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: java.lang.Throwable -> L38
            o7.f3 r3 = r3.f5672f     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m11170d(r4, r2)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L37
            r0.close()
        L37:
            return r1
        L38:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3c:
            if (r1 == 0) goto L41
            r1.close()
        L41:
            throw r0
    }

    /* renamed from: N */
    public final java.util.List<p249o7.C4957b> m11263N(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            r2.mo3183i()
            r2.m11247j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            r0.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "app_id=?"
            r3.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L27
            r0.add(r4)
            java.lang.String r4 = " and origin=?"
            r3.append(r4)
        L27:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L3f
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)
            r0.add(r4)
            java.lang.String r4 = " and name glob ?"
            r3.append(r4)
        L3f:
            int r4 = r0.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r4 = r0.toArray(r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.String r3 = r3.toString()
            java.util.List r3 = r2.m11264O(r3, r4)
            return r3
    }

    /* renamed from: O */
    public final java.util.List<p249o7.C4957b> m11264O(java.lang.String r28, java.lang.String[] r29) {
            r27 = this;
            r1 = r27
            r27.mo3183i()
            r27.m11247j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.m11253D()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            java.lang.String r3 = "conditional_properties"
            java.lang.String r12 = "app_id"
            java.lang.String r13 = "origin"
            java.lang.String r14 = "name"
            java.lang.String r15 = "value"
            java.lang.String r16 = "active"
            java.lang.String r17 = "trigger_event_name"
            java.lang.String r18 = "trigger_timeout"
            java.lang.String r19 = "timed_out_event"
            java.lang.String r20 = "creation_timestamp"
            java.lang.String r21 = "triggered_event"
            java.lang.String r22 = "triggered_timestamp"
            java.lang.String r23 = "time_to_live"
            java.lang.String r24 = "expired_event"
            java.lang.String[] r4 = new java.lang.String[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            java.lang.String r9 = "rowid"
            com.google.android.gms.measurement.internal.d r5 = r1.f5736a     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r7 = 0
            r8 = 0
            r5 = r28
            r6 = r29
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            if (r2 == 0) goto L10c
        L4b:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            com.google.android.gms.measurement.internal.d r3 = r1.f5736a     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r3) goto L76
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "Read more than the max allowed conditional properties, ignoring extra"
            com.google.android.gms.measurement.internal.d r5 = r1.f5736a     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r2.m11170d(r4, r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            goto L108
        L70:
            r0 = move-exception
            goto L127
        L73:
            r0 = move-exception
            goto L110
        L76:
            r2 = 0
            java.lang.String r13 = r11.getString(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r3 = 1
            java.lang.String r14 = r11.getString(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r4 = 2
            java.lang.String r5 = r11.getString(r4)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r4 = 3
            java.lang.Object r8 = r1.m11261L(r11, r4)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r4 = 4
            int r4 = r11.getInt(r4)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            if (r4 == 0) goto L94
            r18 = 1
            goto L96
        L94:
            r18 = 0
        L96:
            r2 = 5
            java.lang.String r19 = r11.getString(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r2 = 6
            long r21 = r11.getLong(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            o7.m6 r2 = r1.f19756b     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            o7.o6 r2 = r2.f19866g     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            p249o7.C5052m6.m11327I(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r3 = 7
            byte[] r3 = r11.getBlob(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            android.os.Parcelable$Creator<o7.q> r4 = p249o7.C5077q.CREATOR     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            android.os.Parcelable r2 = r2.m11395A(r3, r4)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r20 = r2
            o7.q r20 = (p249o7.C5077q) r20     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r2 = 8
            long r16 = r11.getLong(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            o7.m6 r2 = r1.f19756b     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            o7.o6 r2 = r2.f19866g     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            p249o7.C5052m6.m11327I(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r3 = 9
            byte[] r3 = r11.getBlob(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            android.os.Parcelable r2 = r2.m11395A(r3, r4)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r23 = r2
            o7.q r23 = (p249o7.C5077q) r23     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r2 = 10
            long r6 = r11.getLong(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r2 = 11
            long r24 = r11.getLong(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            o7.m6 r2 = r1.f19756b     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            o7.o6 r2 = r2.f19866g     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            p249o7.C5052m6.m11327I(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r3 = 12
            byte[] r3 = r11.getBlob(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            android.os.Parcelable r2 = r2.m11395A(r3, r4)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r26 = r2
            o7.q r26 = (p249o7.C5077q) r26     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            o7.p6 r15 = new o7.p6     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r4 = r15
            r9 = r14
            r4.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            o7.b r2 = new o7.b     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r26)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r0.add(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            boolean r2 = r11.moveToNext()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            if (r2 != 0) goto L4b
        L108:
            r11.close()
            return r0
        L10c:
            r11.close()
            return r0
        L110:
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L70
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "Error querying conditional user property value"
            r2.m11170d(r3, r0)     // Catch: java.lang.Throwable -> L70
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L70
            if (r11 == 0) goto L126
            r11.close()
        L126:
            return r0
        L127:
            if (r11 == 0) goto L12c
            r11.close()
        L12c:
            throw r0
    }

    /* renamed from: P */
    public final java.util.List<p249o7.C5092r6> m11265P(java.lang.String r14) {
            r13 = this;
            com.google.android.gms.common.internal.C1101a.m3100e(r14)
            r13.mo3183i()
            r13.m11247j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r9 = "1000"
            r10 = 0
            android.database.sqlite.SQLiteDatabase r1 = r13.m11253D()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "name"
            java.lang.String r4 = "origin"
            java.lang.String r5 = "set_timestamp"
            java.lang.String r6 = "value"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6}     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r4 = "app_id=?"
            r11 = 1
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            r12 = 0
            r5[r12] = r14     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r8 = "rowid"
            com.google.android.gms.measurement.internal.d r6 = r13.f5736a     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            if (r1 == 0) goto L81
        L3e:
            java.lang.String r5 = r10.getString(r12)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r1 = r10.getString(r11)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            if (r1 != 0) goto L4a
            java.lang.String r1 = ""
        L4a:
            r4 = r1
            r1 = 2
            long r6 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            r1 = 3
            java.lang.Object r8 = r13.m11261L(r10, r1)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            if (r8 != 0) goto L6d
            com.google.android.gms.measurement.internal.d r1 = r13.f5736a     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            o7.f3 r1 = r1.f5672f     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r2 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r14)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            r1.m11170d(r2, r3)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            goto L77
        L69:
            r14 = move-exception
            goto La0
        L6b:
            r0 = move-exception
            goto L85
        L6d:
            o7.r6 r1 = new o7.r6     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            r2 = r1
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            r0.add(r1)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
        L77:
            boolean r1 = r10.moveToNext()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            if (r1 != 0) goto L3e
            r10.close()
            return r0
        L81:
            r10.close()
            return r0
        L85:
            com.google.android.gms.measurement.internal.d r1 = r13.f5736a     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> L69
            o7.f3 r1 = r1.f5672f     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "Error querying user properties. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C1111b.m3134u(r14)     // Catch: java.lang.Throwable -> L69
            r1.m11171e(r2, r14, r0)     // Catch: java.lang.Throwable -> L69
            java.util.List r14 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L9f
            r10.close()
        L9f:
            return r14
        La0:
            if (r10 == 0) goto La5
            r10.close()
        La5:
            throw r14
    }

    /* renamed from: Q */
    public final java.util.List<p249o7.C5092r6> m11266Q(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
            r16 = this;
            r1 = r16
            com.google.android.gms.common.internal.C1101a.m3100e(r17)
            r16.mo3183i()
            r16.m11247j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            r11 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lfb
            r12 = 3
            r2.<init>(r12)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lfb
            r13 = r17
            r2.add(r13)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lf9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lf9
            java.lang.String r4 = "app_id=?"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lf9
            boolean r4 = android.text.TextUtils.isEmpty(r18)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lf9
            if (r4 != 0) goto L36
            r14 = r18
            r2.add(r14)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.lang.String r4 = " and origin=?"
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            goto L38
        L36:
            r14 = r18
        L38:
            boolean r4 = android.text.TextUtils.isEmpty(r19)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            if (r4 != 0) goto L50
            java.lang.String r4 = java.lang.String.valueOf(r19)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            r2.add(r4)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.lang.String r4 = " and name glob ?"
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
        L50:
            int r4 = r2.size()     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            r6 = r2
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            android.database.sqlite.SQLiteDatabase r2 = r16.m11253D()     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.lang.String r4 = "user_attributes"
            java.lang.String r5 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r5, r7, r8, r9}     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.lang.String r9 = "rowid"
            com.google.android.gms.measurement.internal.d r3 = r1.f5736a     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            r8 = 0
            r15 = 0
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r15
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            if (r2 != 0) goto L8f
            r11.close()
            return r0
        L8f:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            com.google.android.gms.measurement.internal.d r3 = r1.f5736a     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r3) goto Lb7
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            com.google.android.gms.measurement.internal.d r5 = r1.f5736a     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            r2.m11170d(r4, r3)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            goto Lf5
        Lb3:
            r0 = move-exception
            goto L11b
        Lb5:
            r0 = move-exception
            goto L100
        Lb7:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            r2 = 1
            long r7 = r11.getLong(r2)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            r2 = 2
            java.lang.Object r9 = r1.m11261L(r11, r2)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.lang.String r14 = r11.getString(r12)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            if (r9 != 0) goto Le0
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            java.lang.String r3 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r17)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            r10 = r19
            r2.m11172f(r3, r4, r14, r10)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            goto Lee
        Le0:
            r10 = r19
            o7.r6 r2 = new o7.r6     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            r3 = r2
            r4 = r17
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            r0.add(r2)     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
        Lee:
            boolean r2 = r11.moveToNext()     // Catch: java.lang.Throwable -> Lb3 android.database.sqlite.SQLiteException -> Lb5
            if (r2 == 0) goto Lf5
            goto L8f
        Lf5:
            r11.close()
            return r0
        Lf9:
            r0 = move-exception
            goto Lfe
        Lfb:
            r0 = move-exception
            r13 = r17
        Lfe:
            r14 = r18
        L100:
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> Lb3
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r17)     // Catch: java.lang.Throwable -> Lb3
            r2.m11172f(r3, r4, r14, r0)     // Catch: java.lang.Throwable -> Lb3
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lb3
            if (r11 == 0) goto L11a
            r11.close()
        L11a:
            return r0
        L11b:
            if (r11 == 0) goto L120
            r11.close()
        L120:
            throw r0
    }

    /* renamed from: R */
    public final void m11267R() {
            r1 = this;
            r1.m11247j()
            android.database.sqlite.SQLiteDatabase r0 = r1.m11253D()
            r0.beginTransaction()
            return
    }

    /* renamed from: S */
    public final void m11268S(java.util.List<java.lang.Long> r5) {
            r4 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r5, r0)
            r4.mo3183i()
            r4.m11247j()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "rowid in ("
            r0.<init>(r1)
            r1 = 0
        L13:
            int r2 = r5.size()
            if (r1 >= r2) goto L30
            if (r1 == 0) goto L20
            java.lang.String r2 = ","
            r0.append(r2)
        L20:
            java.lang.Object r2 = r5.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.append(r2)
            int r1 = r1 + 1
            goto L13
        L30:
            java.lang.String r1 = ")"
            r0.append(r1)
            android.database.sqlite.SQLiteDatabase r1 = r4.m11253D()
            java.lang.String r0 = r0.toString()
            r2 = 0
            java.lang.String r3 = "raw_events"
            int r0 = r1.delete(r3, r0, r2)
            int r1 = r5.size()
            if (r0 == r1) goto L63
            com.google.android.gms.measurement.internal.d r1 = r4.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = "Deleted fewer rows from raw events table than expected"
            r1.m11171e(r2, r0, r5)
        L63:
            return
    }

    /* renamed from: T */
    public final void m11269T() {
            r1 = this;
            r1.m11247j()
            android.database.sqlite.SQLiteDatabase r0 = r1.m11253D()
            r0.endTransaction()
            return
    }

    /* renamed from: U */
    public final void m11270U(java.util.List<java.lang.Long> r7) {
            r6 = this;
            r6.mo3183i()
            r6.m11247j()
            int r0 = r7.size()
            if (r0 == 0) goto L9f
            boolean r0 = r6.m11277s()
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.String r0 = ","
            java.lang.String r7 = android.text.TextUtils.join(r0, r7)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 2
            r1.<init>(r0)
            java.lang.String r0 = "("
            java.lang.String r2 = ")"
            java.lang.String r7 = p083f.C1932s.m4774a(r1, r0, r7, r2)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 80
            r1.<init>(r0)
            java.lang.String r0 = "SELECT COUNT(1) FROM queue WHERE rowid IN "
            java.lang.String r3 = " AND retry_count =  2147483647 LIMIT 1"
            java.lang.String r0 = p083f.C1932s.m4774a(r1, r0, r7, r3)
            r1 = 0
            long r0 = r6.m11283z(r0, r1)
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L5f
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.String r1 = "The number of upload retries exceeds the limit. Will remain unchanged."
            r0.m11169c(r1)
        L5f:
            android.database.sqlite.SQLiteDatabase r0 = r6.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L90
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch: android.database.sqlite.SQLiteException -> L90
            int r1 = r1.length()     // Catch: android.database.sqlite.SQLiteException -> L90
            int r1 = r1 + 127
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L90
            r3.<init>(r1)     // Catch: android.database.sqlite.SQLiteException -> L90
            java.lang.String r1 = "UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN "
            r3.append(r1)     // Catch: android.database.sqlite.SQLiteException -> L90
            r3.append(r7)     // Catch: android.database.sqlite.SQLiteException -> L90
            java.lang.String r7 = " AND (retry_count IS NULL OR retry_count < "
            r3.append(r7)     // Catch: android.database.sqlite.SQLiteException -> L90
            r7 = 2147483647(0x7fffffff, float:NaN)
            r3.append(r7)     // Catch: android.database.sqlite.SQLiteException -> L90
            r3.append(r2)     // Catch: android.database.sqlite.SQLiteException -> L90
            java.lang.String r7 = r3.toString()     // Catch: android.database.sqlite.SQLiteException -> L90
            r0.execSQL(r7)     // Catch: android.database.sqlite.SQLiteException -> L90
            return
        L90:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "Error incrementing retry count. error"
            r0.m11170d(r1, r7)
            return
        L9f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Given Integer is zero"
            r7.<init>(r0)
            throw r7
    }

    @Override // p249o7.AbstractC5020i6
    /* renamed from: l */
    public final boolean mo11089l() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: m */
    public final void m11271m() {
            r7 = this;
            r7.mo3183i()
            r7.m11247j()
            boolean r0 = r7.m11277s()
            if (r0 == 0) goto L9b
            o7.m6 r0 = r7.f19756b
            o7.w5 r0 = r0.f19868i
            o7.p3 r0 = r0.f20152g
            long r0 = r0.m11410a()
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a
            u6.c r2 = r2.f5723n
            u6.d r2 = (p353u6.C6341d) r2
            java.util.Objects.requireNonNull(r2)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r2 - r0
            long r0 = java.lang.Math.abs(r0)
            com.google.android.gms.measurement.internal.d r4 = r7.f5736a
            java.util.Objects.requireNonNull(r4)
            o7.u2<java.lang.Long> r4 = p249o7.C5120v2.f20129y
            r5 = 0
            java.lang.Object r4 = r4.m11421a(r5)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L9b
            o7.m6 r0 = r7.f19756b
            o7.w5 r0 = r0.f19868i
            o7.p3 r0 = r0.f20152g
            r0.m11411b(r2)
            r7.mo3183i()
            r7.m11247j()
            boolean r0 = r7.m11277s()
            if (r0 != 0) goto L55
            goto L9b
        L55:
            android.database.sqlite.SQLiteDatabase r0 = r7.m11253D()
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            com.google.android.gms.measurement.internal.d r3 = r7.f5736a
            u6.c r3 = r3.f5723n
            u6.d r3 = (p353u6.C6341d) r3
            java.util.Objects.requireNonNull(r3)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1[r2] = r3
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a
            java.util.Objects.requireNonNull(r2)
            r2 = 1
            long r3 = p249o7.C4989f.m11150j()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "queue"
            java.lang.String r3 = "abs(bundle_end_timestamp - ?) > cast(? as integer)"
            int r0 = r0.delete(r2, r3, r1)
            if (r0 <= 0) goto L9b
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5680n
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "Deleted stale rows. rowsDeleted"
            r1.m11170d(r2, r0)
        L9b:
            return
    }

    /* renamed from: n */
    public final void m11272n(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            com.google.android.gms.common.internal.C1101a.m3100e(r6)
            r4.mo3183i()
            r4.m11247j()
            android.database.sqlite.SQLiteDatabase r0 = r4.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L21
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: android.database.sqlite.SQLiteException -> L21
            r2 = 0
            r1[r2] = r5     // Catch: android.database.sqlite.SQLiteException -> L21
            r2 = 1
            r1[r2] = r6     // Catch: android.database.sqlite.SQLiteException -> L21
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "app_id=? and name=?"
            r0.delete(r2, r3, r1)     // Catch: android.database.sqlite.SQLiteException -> L21
            return
        L21:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r4.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r5)
            com.google.android.gms.measurement.internal.d r2 = r4.f5736a
            o7.c3 r2 = r2.f5722m
            java.lang.String r6 = r2.m11118f(r6)
            java.lang.String r2 = "Error deleting user property. appId"
            r1.m11172f(r2, r5, r6, r0)
            return
    }

    /* renamed from: o */
    public final void m11273o() {
            r1 = this;
            r1.m11247j()
            android.database.sqlite.SQLiteDatabase r0 = r1.m11253D()
            r0.setTransactionSuccessful()
            return
    }

    /* renamed from: p */
    public final void m11274p(p249o7.C5010h4 r9) {
            r8 = this;
            java.lang.String r0 = "apps"
            r8.mo3183i()
            r8.m11247j()
            java.lang.String r1 = r9.m11213M()
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r1, r2)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r3 = "app_id"
            r2.put(r3, r1)
            java.lang.String r3 = r9.m11214N()
            java.lang.String r4 = "app_instance_id"
            r2.put(r4, r3)
            java.lang.String r3 = r9.m11219S()
            java.lang.String r4 = "gmp_app_id"
            r2.put(r4, r3)
            com.google.android.gms.measurement.internal.d r3 = r9.f19730a
            o7.f4 r3 = r3.mo3160b()
            r3.mo3183i()
            java.lang.String r3 = r9.f19734e
            java.lang.String r4 = "resettable_device_id_hash"
            r2.put(r4, r3)
            long r3 = r9.m11209I()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "last_bundle_index"
            r2.put(r4, r3)
            long r3 = r9.m11210J()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "last_bundle_start_timestamp"
            r2.put(r4, r3)
            long r3 = r9.m11208H()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "last_bundle_end_timestamp"
            r2.put(r4, r3)
            java.lang.String r3 = r9.m11216P()
            java.lang.String r4 = "app_version"
            r2.put(r4, r3)
            java.lang.String r3 = r9.m11215O()
            java.lang.String r4 = "app_store"
            r2.put(r4, r3)
            long r3 = r9.m11207G()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "gmp_version"
            r2.put(r4, r3)
            long r3 = r9.m11204D()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "dev_cert_hash"
            r2.put(r4, r3)
            boolean r3 = r9.m11201A()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "measurement_enabled"
            r2.put(r4, r3)
            com.google.android.gms.measurement.internal.d r3 = r9.f19730a
            o7.f4 r3 = r3.mo3160b()
            r3.mo3183i()
            long r3 = r9.f19752w
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "day"
            r2.put(r4, r3)
            com.google.android.gms.measurement.internal.d r3 = r9.f19730a
            o7.f4 r3 = r3.mo3160b()
            r3.mo3183i()
            long r3 = r9.f19753x
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "daily_public_events_count"
            r2.put(r4, r3)
            com.google.android.gms.measurement.internal.d r3 = r9.f19730a
            o7.f4 r3 = r3.mo3160b()
            r3.mo3183i()
            long r3 = r9.f19754y
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "daily_events_count"
            r2.put(r4, r3)
            com.google.android.gms.measurement.internal.d r3 = r9.f19730a
            o7.f4 r3 = r3.mo3160b()
            r3.mo3183i()
            long r3 = r9.f19755z
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "daily_conversions_count"
            r2.put(r4, r3)
            com.google.android.gms.measurement.internal.d r3 = r9.f19730a
            o7.f4 r3 = r3.mo3160b()
            r3.mo3183i()
            long r3 = r9.f19728E
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "config_fetched_time"
            r2.put(r4, r3)
            com.google.android.gms.measurement.internal.d r3 = r9.f19730a
            o7.f4 r3 = r3.mo3160b()
            r3.mo3183i()
            long r3 = r9.f19729F
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "failed_config_fetch_time"
            r2.put(r4, r3)
            long r3 = r9.m11202B()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "app_version_int"
            r2.put(r4, r3)
            java.lang.String r3 = r9.m11217Q()
            java.lang.String r4 = "firebase_instance_id"
            r2.put(r4, r3)
            com.google.android.gms.measurement.internal.d r3 = r9.f19730a
            o7.f4 r3 = r3.mo3160b()
            r3.mo3183i()
            long r3 = r9.f19724A
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "daily_error_events_count"
            r2.put(r4, r3)
            com.google.android.gms.measurement.internal.d r3 = r9.f19730a
            o7.f4 r3 = r3.mo3160b()
            r3.mo3183i()
            long r3 = r9.f19725B
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "daily_realtime_events_count"
            r2.put(r4, r3)
            com.google.android.gms.measurement.internal.d r3 = r9.f19730a
            o7.f4 r3 = r3.mo3160b()
            r3.mo3183i()
            java.lang.String r3 = r9.f19726C
            java.lang.String r4 = "health_monitor_sample"
            r2.put(r4, r3)
            long r3 = r9.m11237r()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "android_id"
            r2.put(r4, r3)
            boolean r3 = r9.m11245z()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "adid_reporting_enabled"
            r2.put(r4, r3)
            java.lang.String r3 = r9.m11211K()
            java.lang.String r4 = "admob_app_id"
            r2.put(r4, r3)
            long r3 = r9.m11205E()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "dynamite_version"
            r2.put(r4, r3)
            java.util.List r3 = r9.m11220a()
            if (r3 == 0) goto L1b8
            int r4 = r3.size()
            if (r4 != 0) goto L1ad
            com.google.android.gms.measurement.internal.d r3 = r8.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5675i
            java.lang.String r4 = "Safelisted events should not be an empty list. appId"
            r3.m11170d(r4, r1)
            goto L1b8
        L1ad:
            java.lang.String r4 = ","
            java.lang.String r3 = android.text.TextUtils.join(r4, r3)
            java.lang.String r4 = "safelisted_events"
            r2.put(r4, r3)
        L1b8:
            p185k7.C3847ia.m8706c()
            com.google.android.gms.measurement.internal.d r3 = r8.f5736a
            o7.f r3 = r3.f5716g
            o7.u2<java.lang.Boolean> r4 = p249o7.C5120v2.f20089d0
            boolean r3 = r3.m11162v(r1, r4)
            if (r3 == 0) goto L1d0
            java.lang.String r9 = r9.m11218R()
            java.lang.String r3 = "ga_app_id"
            r2.put(r3, r9)
        L1d0:
            android.database.sqlite.SQLiteDatabase r9 = r8.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L205
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: android.database.sqlite.SQLiteException -> L205
            r4 = 0
            r3[r4] = r1     // Catch: android.database.sqlite.SQLiteException -> L205
            java.lang.String r4 = "app_id = ?"
            int r3 = r9.update(r0, r2, r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L205
            long r3 = (long) r3     // Catch: android.database.sqlite.SQLiteException -> L205
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L204
            r3 = 0
            r4 = 5
            long r2 = r9.insertWithOnConflict(r0, r3, r2, r4)     // Catch: android.database.sqlite.SQLiteException -> L205
            r4 = -1
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L204
            com.google.android.gms.measurement.internal.d r9 = r8.f5736a     // Catch: android.database.sqlite.SQLiteException -> L205
            com.google.android.gms.measurement.internal.b r9 = r9.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L205
            o7.f3 r9 = r9.f5672f     // Catch: android.database.sqlite.SQLiteException -> L205
            java.lang.String r0 = "Failed to insert/update app (got -1). appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1111b.m3134u(r1)     // Catch: android.database.sqlite.SQLiteException -> L205
            r9.m11170d(r0, r2)     // Catch: android.database.sqlite.SQLiteException -> L205
        L204:
            return
        L205:
            r9 = move-exception
            com.google.android.gms.measurement.internal.d r0 = r8.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C1111b.m3134u(r1)
            java.lang.String r2 = "Error storing app. appId"
            r0.m11171e(r2, r1, r9)
            return
    }

    /* renamed from: q */
    public final void m11275q(p249o7.C5053n r6) {
            r5 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            r5.mo3183i()
            r5.m11247j()
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = r6.f19886a
            java.lang.String r2 = "app_id"
            r0.put(r2, r1)
            java.lang.String r1 = r6.f19887b
            java.lang.String r2 = "name"
            r0.put(r2, r1)
            long r1 = r6.f19888c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "lifetime_count"
            r0.put(r2, r1)
            long r1 = r6.f19889d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "current_bundle_count"
            r0.put(r2, r1)
            long r1 = r6.f19891f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "last_fire_timestamp"
            r0.put(r2, r1)
            long r1 = r6.f19892g
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "last_bundled_timestamp"
            r0.put(r2, r1)
            java.lang.Long r1 = r6.f19893h
            java.lang.String r2 = "last_bundled_day"
            r0.put(r2, r1)
            java.lang.Long r1 = r6.f19894i
            java.lang.String r2 = "last_sampled_complex_event_id"
            r0.put(r2, r1)
            java.lang.Long r1 = r6.f19895j
            java.lang.String r2 = "last_sampling_rate"
            r0.put(r2, r1)
            long r1 = r6.f19890e
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "current_session_count"
            r0.put(r2, r1)
            java.lang.Boolean r1 = r6.f19896k
            r2 = 0
            if (r1 == 0) goto L7c
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L7c
            r3 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L7d
        L7c:
            r1 = r2
        L7d:
            java.lang.String r3 = "last_exempt_from_sampling"
            r0.put(r3, r1)
            android.database.sqlite.SQLiteDatabase r1 = r5.m11253D()     // Catch: android.database.sqlite.SQLiteException -> La7
            java.lang.String r3 = "events"
            r4 = 5
            long r0 = r1.insertWithOnConflict(r3, r2, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La7
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La6
            com.google.android.gms.measurement.internal.d r0 = r5.f5736a     // Catch: android.database.sqlite.SQLiteException -> La7
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> La7
            o7.f3 r0 = r0.f5672f     // Catch: android.database.sqlite.SQLiteException -> La7
            java.lang.String r1 = "Failed to insert/update event aggregates (got -1). appId"
            java.lang.String r2 = r6.f19886a     // Catch: android.database.sqlite.SQLiteException -> La7
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1111b.m3134u(r2)     // Catch: android.database.sqlite.SQLiteException -> La7
            r0.m11170d(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> La7
        La6:
            return
        La7:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r5.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r6 = r6.f19886a
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)
            java.lang.String r2 = "Error storing event aggregates. appId"
            r1.m11171e(r2, r6, r0)
            return
    }

    /* renamed from: r */
    public final void m11276r(java.lang.String r4, byte[] r5, java.lang.String r6) {
            r3 = this;
            com.google.android.gms.common.internal.C1101a.m3100e(r4)
            r3.mo3183i()
            r3.m11247j()
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "remote_config"
            r0.put(r1, r5)
            java.lang.String r5 = "config_last_modified_time"
            r0.put(r5, r6)
            android.database.sqlite.SQLiteDatabase r5 = r3.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L43
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: android.database.sqlite.SQLiteException -> L43
            r1 = 0
            r6[r1] = r4     // Catch: android.database.sqlite.SQLiteException -> L43
            java.lang.String r1 = "apps"
            java.lang.String r2 = "app_id = ?"
            int r5 = r5.update(r1, r0, r2, r6)     // Catch: android.database.sqlite.SQLiteException -> L43
            long r5 = (long) r5     // Catch: android.database.sqlite.SQLiteException -> L43
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L42
            com.google.android.gms.measurement.internal.d r5 = r3.f5736a     // Catch: android.database.sqlite.SQLiteException -> L43
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L43
            o7.f3 r5 = r5.f5672f     // Catch: android.database.sqlite.SQLiteException -> L43
            java.lang.String r6 = "Failed to update remote config (got 0). appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C1111b.m3134u(r4)     // Catch: android.database.sqlite.SQLiteException -> L43
            r5.m11170d(r6, r0)     // Catch: android.database.sqlite.SQLiteException -> L43
        L42:
            return
        L43:
            r5 = move-exception
            com.google.android.gms.measurement.internal.d r6 = r3.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5672f
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r4)
            java.lang.String r0 = "Error storing remote config. appId"
            r6.m11171e(r0, r4, r5)
            return
    }

    /* renamed from: s */
    public final boolean m11277s() {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            android.content.Context r1 = r0.f5710a
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "google_app_measurement.db"
            java.io.File r0 = r1.getDatabasePath(r0)
            boolean r0 = r0.exists()
            return r0
    }

    /* renamed from: t */
    public final boolean m11278t(java.lang.String r5, java.lang.Long r6, long r7, p185k7.C3997u2 r9) {
            r4 = this;
            r4.mo3183i()
            r4.m11247j()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r9, r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            byte[] r9 = r9.m9160i()
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            com.google.android.gms.measurement.internal.d r1 = r4.f5736a
            o7.c3 r1 = r1.f5722m
            java.lang.String r1 = r1.m11116d(r5)
            int r2 = r9.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Saving complex main event, appId, data size"
            r0.m11171e(r3, r1, r2)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "app_id"
            r0.put(r1, r5)
            java.lang.String r1 = "event_id"
            r0.put(r1, r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "children_to_process"
            r0.put(r7, r6)
            java.lang.String r6 = "main_event"
            r0.put(r6, r9)
            r6 = 0
            android.database.sqlite.SQLiteDatabase r7 = r4.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L70
            java.lang.String r8 = "main_event_params"
            r9 = 0
            r1 = 5
            long r7 = r7.insertWithOnConflict(r8, r9, r0, r1)     // Catch: android.database.sqlite.SQLiteException -> L70
            r0 = -1
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 != 0) goto L6e
            com.google.android.gms.measurement.internal.d r7 = r4.f5736a     // Catch: android.database.sqlite.SQLiteException -> L70
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L70
            o7.f3 r7 = r7.f5672f     // Catch: android.database.sqlite.SQLiteException -> L70
            java.lang.String r8 = "Failed to insert complex main event (got -1). appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1111b.m3134u(r5)     // Catch: android.database.sqlite.SQLiteException -> L70
            r7.m11170d(r8, r9)     // Catch: android.database.sqlite.SQLiteException -> L70
            return r6
        L6e:
            r5 = 1
            return r5
        L70:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r8 = r4.f5736a
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()
            o7.f3 r8 = r8.f5672f
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r5)
            java.lang.String r9 = "Error storing complex main event. appId"
            r8.m11171e(r9, r5, r7)
            return r6
    }

    /* renamed from: u */
    public final boolean m11279u(p249o7.C4957b r10) {
            r9 = this;
            r9.mo3183i()
            r9.m11247j()
            java.lang.String r0 = r10.f19587Y
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            o7.p6 r2 = r10.f19589a0
            java.lang.String r2 = r2.f19945Z
            o7.r6 r2 = r9.m11260K(r0, r2)
            r3 = 1
            if (r2 != 0) goto L30
            java.lang.String[] r2 = new java.lang.String[r3]
            r4 = 0
            r2[r4] = r0
            java.lang.String r5 = "SELECT COUNT(1) FROM conditional_properties WHERE app_id=?"
            long r5 = r9.m11283z(r5, r2)
            com.google.android.gms.measurement.internal.d r2 = r9.f5736a
            java.util.Objects.requireNonNull(r2)
            r7 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L2f
            goto L30
        L2f:
            return r4
        L30:
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r4 = "app_id"
            r2.put(r4, r0)
            java.lang.String r4 = r10.f19588Z
            java.lang.String r5 = "origin"
            r2.put(r5, r4)
            o7.p6 r4 = r10.f19589a0
            java.lang.String r4 = r4.f19945Z
            java.lang.String r5 = "name"
            r2.put(r5, r4)
            o7.p6 r4 = r10.f19589a0
            java.lang.Object r4 = r4.m11412X()
            java.util.Objects.requireNonNull(r4, r1)
            java.lang.String r1 = "value"
            m11249x(r2, r1, r4)
            boolean r1 = r10.f19591c0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r4 = "active"
            r2.put(r4, r1)
            java.lang.String r1 = r10.f19592d0
            java.lang.String r4 = "trigger_event_name"
            r2.put(r4, r1)
            long r4 = r10.f19594f0
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "trigger_timeout"
            r2.put(r4, r1)
            com.google.android.gms.measurement.internal.d r1 = r9.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            o7.q r4 = r10.f19593e0
            byte[] r1 = r1.m3218b0(r4)
            java.lang.String r4 = "timed_out_event"
            r2.put(r4, r1)
            long r4 = r10.f19590b0
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "creation_timestamp"
            r2.put(r4, r1)
            com.google.android.gms.measurement.internal.d r1 = r9.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            o7.q r4 = r10.f19595g0
            byte[] r1 = r1.m3218b0(r4)
            java.lang.String r4 = "triggered_event"
            r2.put(r4, r1)
            o7.p6 r1 = r10.f19589a0
            long r4 = r1.f19946a0
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "triggered_timestamp"
            r2.put(r4, r1)
            long r4 = r10.f19596h0
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "time_to_live"
            r2.put(r4, r1)
            com.google.android.gms.measurement.internal.d r1 = r9.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            o7.q r10 = r10.f19597i0
            byte[] r10 = r1.m3218b0(r10)
            java.lang.String r1 = "expired_event"
            r2.put(r1, r10)
            android.database.sqlite.SQLiteDatabase r10 = r9.m11253D()     // Catch: android.database.sqlite.SQLiteException -> Lef
            java.lang.String r1 = "conditional_properties"
            r4 = 0
            r5 = 5
            long r1 = r10.insertWithOnConflict(r1, r4, r2, r5)     // Catch: android.database.sqlite.SQLiteException -> Lef
            r4 = -1
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L101
            com.google.android.gms.measurement.internal.d r10 = r9.f5736a     // Catch: android.database.sqlite.SQLiteException -> Lef
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> Lef
            o7.f3 r10 = r10.f5672f     // Catch: android.database.sqlite.SQLiteException -> Lef
            java.lang.String r1 = "Failed to insert/update conditional user property (got -1)"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1111b.m3134u(r0)     // Catch: android.database.sqlite.SQLiteException -> Lef
            r10.m11170d(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> Lef
            goto L101
        Lef:
            r10 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r9.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C1111b.m3134u(r0)
            java.lang.String r2 = "Error storing conditional user property"
            r1.m11171e(r2, r0, r10)
        L101:
            return r3
    }

    /* renamed from: v */
    public final boolean m11280v(p249o7.C5092r6 r10) {
            r9 = this;
            r9.mo3183i()
            r9.m11247j()
            java.lang.String r0 = r10.f19980a
            java.lang.String r1 = r10.f19982c
            o7.r6 r0 = r9.m11260K(r0, r1)
            r1 = 1
            if (r0 != 0) goto L64
            java.lang.String r0 = r10.f19982c
            boolean r0 = com.google.android.gms.measurement.internal.C1115f.m3185W(r0)
            r2 = 0
            if (r0 == 0) goto L3d
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.String r3 = r10.f19980a
            r0[r2] = r3
            java.lang.String r3 = "select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'"
            long r3 = r9.m11283z(r3, r0)
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            o7.f r0 = r0.f5716g
            java.lang.String r5 = r10.f19980a
            o7.u2<java.lang.Integer> r6 = p249o7.C5120v2.f20062G
            r7 = 25
            r8 = 100
            int r0 = r0.m11156p(r5, r6, r7, r8)
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L3c
            goto L64
        L3c:
            return r2
        L3d:
            java.lang.String r0 = r10.f19982c
            java.lang.String r3 = "_npa"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L64
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r3 = r10.f19980a
            r0[r2] = r3
            java.lang.String r3 = r10.f19981b
            r0[r1] = r3
            java.lang.String r3 = "select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'"
            long r3 = r9.m11283z(r3, r0)
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            java.util.Objects.requireNonNull(r0)
            r5 = 25
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L64
            return r2
        L64:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r2 = r10.f19980a
            java.lang.String r3 = "app_id"
            r0.put(r3, r2)
            java.lang.String r2 = r10.f19981b
            java.lang.String r3 = "origin"
            r0.put(r3, r2)
            java.lang.String r2 = r10.f19982c
            java.lang.String r3 = "name"
            r0.put(r3, r2)
            long r2 = r10.f19983d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "set_timestamp"
            r0.put(r3, r2)
            java.lang.Object r2 = r10.f19984e
            java.lang.String r3 = "value"
            m11249x(r0, r3, r2)
            android.database.sqlite.SQLiteDatabase r2 = r9.m11253D()     // Catch: android.database.sqlite.SQLiteException -> Lb6
            java.lang.String r3 = "user_attributes"
            r4 = 0
            r5 = 5
            long r2 = r2.insertWithOnConflict(r3, r4, r0, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb6
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto Lca
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a     // Catch: android.database.sqlite.SQLiteException -> Lb6
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> Lb6
            o7.f3 r0 = r0.f5672f     // Catch: android.database.sqlite.SQLiteException -> Lb6
            java.lang.String r2 = "Failed to insert/update user property (got -1). appId"
            java.lang.String r3 = r10.f19980a     // Catch: android.database.sqlite.SQLiteException -> Lb6
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: android.database.sqlite.SQLiteException -> Lb6
            r0.m11170d(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb6
            goto Lca
        Lb6:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r9.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r10 = r10.f19980a
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C1111b.m3134u(r10)
            java.lang.String r3 = "Error storing user property. appId"
            r2.m11171e(r3, r10, r0)
        Lca:
            return r1
    }

    /* renamed from: w */
    public final void m11281w(java.lang.String r21, long r22, long r24, p249o7.C5044l6 r26) {
            r20 = this;
            r1 = r20
            r2 = r26
            r20.mo3183i()
            r20.m11247j()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.m11253D()     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            java.lang.String r5 = ""
            r13 = -1
            r15 = 0
            r12 = 1
            r11 = 2
            if (r4 == 0) goto L6e
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L2f
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            r6[r15] = r7     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            r6[r12] = r7     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            goto L37
        L2f:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            r6[r15] = r7     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
        L37:
            if (r4 == 0) goto L3b
            java.lang.String r5 = "rowid <= ? and "
        L3b:
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            int r4 = r4 + 148
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            java.lang.String r4 = "select app_id, metadata_fingerprint from raw_events where "
            r7.append(r4)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            r7.append(r5)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            java.lang.String r4 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r7.append(r4)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            boolean r5 = r4.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1f7 java.lang.Throwable -> L212
            if (r5 != 0) goto L65
            r4.close()
            return
        L65:
            java.lang.String r3 = r4.getString(r15)     // Catch: android.database.sqlite.SQLiteException -> L1f7 java.lang.Throwable -> L212
            java.lang.String r5 = r4.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L1f7 java.lang.Throwable -> L212
            goto Lb3
        L6e:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L7d
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            r6[r15] = r3     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            r6[r12] = r7     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            goto L81
        L7d:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
        L81:
            if (r4 == 0) goto L85
            java.lang.String r5 = " and rowid <= ?"
        L85:
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            int r4 = r4 + 84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            java.lang.String r4 = "select metadata_fingerprint from raw_events where app_id = ?"
            r7.append(r4)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            r7.append(r5)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            java.lang.String r4 = " order by rowid limit 1;"
            r7.append(r4)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch: java.lang.Throwable -> L1f1 android.database.sqlite.SQLiteException -> L1f9
            boolean r5 = r4.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1f7 java.lang.Throwable -> L212
            if (r5 != 0) goto Laf
            r4.close()
            return
        Laf:
            java.lang.String r5 = r4.getString(r15)     // Catch: android.database.sqlite.SQLiteException -> L1f7 java.lang.Throwable -> L212
        Lb3:
            r4.close()     // Catch: android.database.sqlite.SQLiteException -> L1f7 java.lang.Throwable -> L212
            r16 = r3
            r3 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r8[r15] = r16     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r8[r12] = r17     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r11 = r18
            r12 = r19
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            boolean r4 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            if (r4 != 0) goto Lf5
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            o7.f3 r0 = r0.f5672f     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r16)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r0.m11170d(r2, r4)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r3.close()
            return
        Lf5:
            byte[] r4 = r3.getBlob(r15)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            k7.c3 r5 = p185k7.C3770d3.m8424z1()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.io.IOException -> L1db java.lang.Throwable -> L1f1
            k7.y4 r4 = p249o7.C5068o6.m11380D(r5, r4)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.io.IOException -> L1db java.lang.Throwable -> L1f1
            k7.c3 r4 = (p185k7.C3756c3) r4     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.io.IOException -> L1db java.lang.Throwable -> L1f1
            k7.d6 r4 = r4.m8201f()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.io.IOException -> L1db java.lang.Throwable -> L1f1
            k7.d3 r4 = (p185k7.C3770d3) r4     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.io.IOException -> L1db java.lang.Throwable -> L1f1
            boolean r5 = r3.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            if (r5 == 0) goto L120
            com.google.android.gms.measurement.internal.d r5 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            o7.f3 r5 = r5.f5675i     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1111b.m3134u(r16)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r5.m11170d(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
        L120:
            r3.close()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r2.f19828a = r4     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r12 = 3
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L13b
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r5[r15] = r16     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r13 = 1
            r5[r13] = r17     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r14 = 2
            r5[r14] = r6     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            goto L145
        L13b:
            r13 = 1
            r14 = 2
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r5 = new java.lang.String[r14]     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r5[r15] = r16     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r5[r13] = r17     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
        L145:
            r7 = r4
            r8 = r5
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "rowid"
            r17 = 0
            r4 = r0
            r14 = 3
            r12 = r17
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            if (r0 == 0) goto L1c4
        L169:
            long r4 = r3.getLong(r15)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            byte[] r0 = r3.getBlob(r14)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            k7.t2 r6 = p185k7.C3997u2.m9040w()     // Catch: java.io.IOException -> L1a7 android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            k7.y4 r0 = p249o7.C5068o6.m11380D(r6, r0)     // Catch: java.io.IOException -> L1a7 android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            k7.t2 r0 = (p185k7.C3984t2) r0     // Catch: java.io.IOException -> L1a7 android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            java.lang.String r6 = r3.getString(r13)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r0.m9010u(r6)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r6 = 2
            long r7 = r3.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            boolean r9 = r0.f16454a0     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            if (r9 == 0) goto L190
            r0.m8203j()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r0.f16454a0 = r15     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
        L190:
            MessageType extends k7.d6<MessageType, BuilderType> r9 = r0.f16453Z     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            k7.u2 r9 = (p185k7.C3997u2) r9     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            p185k7.C3997u2.m9038H(r9, r7)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            k7.d6 r0 = r0.m8201f()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            k7.u2 r0 = (p185k7.C3997u2) r0     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            boolean r0 = r2.m11312a(r4, r0)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            if (r0 != 0) goto L1ba
            r3.close()
            return
        L1a7:
            r0 = move-exception
            r6 = 2
            com.google.android.gms.measurement.internal.d r4 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            o7.f3 r4 = r4.f5672f     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            java.lang.String r5 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1111b.m3134u(r16)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r4.m11171e(r5, r7, r0)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
        L1ba:
            boolean r0 = r3.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            if (r0 != 0) goto L169
            r3.close()
            return
        L1c4:
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            o7.f3 r0 = r0.f5675i     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r16)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r0.m11170d(r2, r4)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r3.close()
            return
        L1d9:
            r0 = move-exception
            goto L1f3
        L1db:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            o7.f3 r2 = r2.f5672f     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r16)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r2.m11171e(r4, r5, r0)     // Catch: android.database.sqlite.SQLiteException -> L1d9 java.lang.Throwable -> L1f1
            r3.close()
            return
        L1f1:
            r0 = move-exception
            goto L214
        L1f3:
            r4 = r3
            r3 = r16
            goto L1fb
        L1f7:
            r0 = move-exception
            goto L1fb
        L1f9:
            r0 = move-exception
            r4 = r3
        L1fb:
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> L212
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L212
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L212
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: java.lang.Throwable -> L212
            r2.m11171e(r5, r3, r0)     // Catch: java.lang.Throwable -> L212
            if (r4 == 0) goto L211
            r4.close()
        L211:
            return
        L212:
            r0 = move-exception
            r3 = r4
        L214:
            if (r3 == 0) goto L219
            r3.close()
        L219:
            throw r0
    }

    /* renamed from: y */
    public final int m11282y(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            com.google.android.gms.common.internal.C1101a.m3100e(r6)
            com.google.android.gms.common.internal.C1101a.m3100e(r7)
            r5.mo3183i()
            r5.m11247j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L22
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: android.database.sqlite.SQLiteException -> L22
            r2[r0] = r6     // Catch: android.database.sqlite.SQLiteException -> L22
            r3 = 1
            r2[r3] = r7     // Catch: android.database.sqlite.SQLiteException -> L22
            java.lang.String r3 = "conditional_properties"
            java.lang.String r4 = "app_id=? and name=?"
            int r6 = r1.delete(r3, r4, r2)     // Catch: android.database.sqlite.SQLiteException -> L22
            return r6
        L22:
            r1 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r5.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)
            com.google.android.gms.measurement.internal.d r3 = r5.f5736a
            o7.c3 r3 = r3.f5722m
            java.lang.String r7 = r3.m11118f(r7)
            java.lang.String r3 = "Error deleting conditional property"
            r2.m11172f(r3, r6, r7, r1)
            return r0
    }

    /* renamed from: z */
    public final long m11283z(java.lang.String r4, java.lang.String[] r5) {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.m11253D()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r4, r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r5 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            if (r5 == 0) goto L18
            r5 = 0
            long r4 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            r1.close()
            return r4
        L18:
            android.database.sqlite.SQLiteException r5 = new android.database.sqlite.SQLiteException     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            java.lang.String r0 = "Database returned empty set"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            throw r5     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
        L20:
            r4 = move-exception
            goto L31
        L22:
            r5 = move-exception
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L20
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "Database error"
            r0.m11171e(r2, r4, r5)     // Catch: java.lang.Throwable -> L20
            throw r5     // Catch: java.lang.Throwable -> L20
        L31:
            if (r1 == 0) goto L36
            r1.close()
        L36:
            throw r4
    }
}

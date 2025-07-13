package p249o7;

/* renamed from: o7.a7 */
/* loaded from: classes.dex */
public final class C4956a7 extends p249o7.AbstractC5020i6 {

    /* renamed from: d */
    public java.lang.String f19582d;

    /* renamed from: e */
    public java.util.Set<java.lang.Integer> f19583e;

    /* renamed from: f */
    public java.util.Map<java.lang.Integer, p249o7.C5140x6> f19584f;

    /* renamed from: g */
    public java.lang.Long f19585g;

    /* renamed from: h */
    public java.lang.Long f19586h;

    public C4956a7(p249o7.C5052m6 r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p249o7.AbstractC5020i6
    /* renamed from: l */
    public final boolean mo11089l() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: m */
    public final java.util.List<p185k7.C3945q2> m11103m(java.lang.String r64, java.util.List<p185k7.C3997u2> r65, java.util.List<p185k7.C3894m3> r66, java.lang.Long r67, java.lang.Long r68) {
            r63 = this;
            r9 = r63
            java.lang.String r10 = "current_results"
            com.google.android.gms.common.internal.C1101a.m3100e(r64)
            com.google.android.gms.common.internal.C1101a.m3103h(r65)
            com.google.android.gms.common.internal.C1101a.m3103h(r66)
            r0 = r64
            r9.f19582d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r9.f19583e = r0
            s.a r0 = new s.a
            r0.<init>()
            r9.f19584f = r0
            r0 = r67
            r9.f19585g = r0
            r0 = r68
            r9.f19586h = r0
            java.util.Iterator r0 = r65.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            k7.u2 r1 = (p185k7.C3997u2) r1
            java.lang.String r1 = r1.m9052z()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2b
            r1 = 1
            goto L48
        L47:
            r1 = 0
        L48:
            p185k7.C4030w9.m9080c()
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            o7.f r0 = r0.m3170o()
            java.lang.String r2 = r9.f19582d
            o7.u2<java.lang.Boolean> r3 = p249o7.C5120v2.f20080Y
            boolean r13 = r0.m11162v(r2, r3)
            p185k7.C4030w9.m9080c()
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            o7.f r0 = r0.m3170o()
            java.lang.String r2 = r9.f19582d
            o7.u2<java.lang.Boolean> r3 = p249o7.C5120v2.f20079X
            boolean r14 = r0.m11162v(r2, r3)
            if (r1 == 0) goto Laf
            o7.m6 r0 = r9.f19756b
            o7.j r2 = r0.m11342M()
            java.lang.String r3 = r9.f19582d
            r2.m11247j()
            r2.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L9b
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch: android.database.sqlite.SQLiteException -> L9b
            r5[r11] = r3     // Catch: android.database.sqlite.SQLiteException -> L9b
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch: android.database.sqlite.SQLiteException -> L9b
            goto Laf
        L9b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.m3140q()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.m11171e(r4, r3, r0)
        Laf:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r15 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r7 = "data"
            java.lang.String r6 = "audience_id"
            if (r14 == 0) goto L179
            if (r13 == 0) goto L179
            o7.m6 r0 = r9.f19756b
            o7.j r2 = r0.m11342M()
            java.lang.String r3 = r9.f19582d
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            s.a r4 = new s.a
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r2.m11253D()
            java.lang.String[] r18 = new java.lang.String[]{r6, r7}     // Catch: java.lang.Throwable -> L152 android.database.sqlite.SQLiteException -> L155
            java.lang.String[] r0 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L152 android.database.sqlite.SQLiteException -> L155
            r0[r11] = r3     // Catch: java.lang.Throwable -> L152 android.database.sqlite.SQLiteException -> L155
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L152 android.database.sqlite.SQLiteException -> L155
            boolean r0 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            if (r0 == 0) goto L14b
        Lf1:
            byte[] r0 = r5.getBlob(r12)     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            k7.r1 r12 = p185k7.C3970s1.m8928u()     // Catch: java.io.IOException -> L12b android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            k7.y4 r0 = p249o7.C5068o6.m11380D(r12, r0)     // Catch: java.io.IOException -> L12b android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            k7.r1 r0 = (p185k7.C3957r1) r0     // Catch: java.io.IOException -> L12b android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            k7.d6 r0 = r0.m8201f()     // Catch: java.io.IOException -> L12b android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            k7.s1 r0 = (p185k7.C3970s1) r0     // Catch: java.io.IOException -> L12b android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            boolean r12 = r0.m8933F()     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            if (r12 != 0) goto L10c
            goto L13d
        L10c:
            int r12 = r5.getInt(r11)     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            java.lang.Object r16 = r4.get(r12)     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            java.util.List r16 = (java.util.List) r16     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            if (r16 != 0) goto L125
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            r11.<init>()     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            r4.put(r12, r11)     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            goto L127
        L125:
            r11 = r16
        L127:
            r11.add(r0)     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            goto L13d
        L12b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r11 = r2.f5736a     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            com.google.android.gms.measurement.internal.b r11 = r11.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            o7.f3 r11 = r11.m3140q()     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            r11.m11171e(r15, r12, r0)     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
        L13d:
            boolean r0 = r5.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            if (r0 != 0) goto L148
            r5.close()
            r11 = r4
            goto L17a
        L148:
            r11 = 0
            r12 = 1
            goto Lf1
        L14b:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L150 java.lang.Throwable -> L172
            goto L16e
        L150:
            r0 = move-exception
            goto L157
        L152:
            r0 = move-exception
            r5 = 0
            goto L173
        L155:
            r0 = move-exception
            r5 = 0
        L157:
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> L172
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L172
            o7.f3 r2 = r2.m3140q()     // Catch: java.lang.Throwable -> L172
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: java.lang.Throwable -> L172
            r2.m11171e(r8, r3, r0)     // Catch: java.lang.Throwable -> L172
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L172
            if (r5 == 0) goto L179
        L16e:
            r5.close()
            goto L179
        L172:
            r0 = move-exception
        L173:
            if (r5 == 0) goto L178
            r5.close()
        L178:
            throw r0
        L179:
            r11 = r0
        L17a:
            o7.m6 r0 = r9.f19756b
            o7.j r2 = r0.m11342M()
            java.lang.String r3 = r9.f19582d
            r2.m11247j()
            r2.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            android.database.sqlite.SQLiteDatabase r16 = r2.m11253D()
            java.lang.String[] r18 = new java.lang.String[]{r6, r10}     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L229
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L229
            r4 = 0
            r0[r4] = r3     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L229
            java.lang.String r17 = "audience_filter_values"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L229
            boolean r0 = r4.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            if (r0 != 0) goto L1bd
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            r4.close()
            r12 = r0
            r18 = r6
            r19 = r7
            goto L24c
        L1bd:
            s.a r5 = new s.a     // Catch: android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            r5.<init>()     // Catch: android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
        L1c2:
            r12 = 0
            int r16 = r4.getInt(r12)     // Catch: android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            r12 = 1
            byte[] r0 = r4.getBlob(r12)     // Catch: android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            k7.h3 r12 = p185k7.C3840i3.m8647x()     // Catch: java.io.IOException -> L1ea android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            k7.y4 r0 = p249o7.C5068o6.m11380D(r12, r0)     // Catch: java.io.IOException -> L1ea android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            k7.h3 r0 = (p185k7.C3826h3) r0     // Catch: java.io.IOException -> L1ea android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            k7.d6 r0 = r0.m8201f()     // Catch: java.io.IOException -> L1ea android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            k7.i3 r0 = (p185k7.C3840i3) r0     // Catch: java.io.IOException -> L1ea android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)     // Catch: android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            r5.put(r12, r0)     // Catch: android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            r17 = r5
            r18 = r6
            r19 = r7
            goto L208
        L1ea:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r12 = r2.f5736a     // Catch: android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            com.google.android.gms.measurement.internal.b r12 = r12.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            o7.f3 r12 = r12.m3140q()     // Catch: android.database.sqlite.SQLiteException -> L221 java.lang.Throwable -> Lad6
            r17 = r5
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            r18 = r6
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: android.database.sqlite.SQLiteException -> L21d java.lang.Throwable -> Lad6
            r19 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch: android.database.sqlite.SQLiteException -> L21b java.lang.Throwable -> Lad6
            r12.m11172f(r5, r6, r7, r0)     // Catch: android.database.sqlite.SQLiteException -> L21b java.lang.Throwable -> Lad6
        L208:
            boolean r0 = r4.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L21b java.lang.Throwable -> Lad6
            if (r0 != 0) goto L214
            r4.close()
            r12 = r17
            goto L24c
        L214:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L1c2
        L21b:
            r0 = move-exception
            goto L22f
        L21d:
            r0 = move-exception
        L21e:
            r19 = r7
            goto L22f
        L221:
            r0 = move-exception
            r18 = r6
            goto L21e
        L225:
            r0 = move-exception
            r5 = 0
            goto Lad8
        L229:
            r0 = move-exception
            r18 = r6
            r19 = r7
            r4 = 0
        L22f:
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> Lad6
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> Lad6
            o7.f3 r2 = r2.m3140q()     // Catch: java.lang.Throwable -> Lad6
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: java.lang.Throwable -> Lad6
            r2.m11171e(r5, r3, r0)     // Catch: java.lang.Throwable -> Lad6
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Lad6
            if (r4 == 0) goto L24b
            r4.close()
        L24b:
            r12 = r0
        L24c:
            boolean r0 = r12.isEmpty()
            r7 = 2
            if (r0 == 0) goto L25e
        L253:
            r28 = r8
            r23 = r10
            r11 = r18
            r12 = r19
            r13 = 2
            goto L584
        L25e:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r12.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L3d1
            java.lang.String r1 = r9.f19582d
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            com.google.android.gms.common.internal.C1101a.m3103h(r12)
            s.a r3 = new s.a
            r3.<init>()
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L27e
            goto L3c8
        L27e:
            o7.m6 r0 = r9.f19756b
            o7.j r4 = r0.m11342M()
            r4.m11247j()
            r4.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            s.a r0 = new s.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r4.m11253D()
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L2df android.database.sqlite.SQLiteException -> L2e3
            r16 = 0
            r6[r16] = r1     // Catch: java.lang.Throwable -> L2df android.database.sqlite.SQLiteException -> L2e3
            r16 = 1
            r6[r16] = r1     // Catch: java.lang.Throwable -> L2df android.database.sqlite.SQLiteException -> L2e3
            java.lang.String r7 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r7, r6)     // Catch: java.lang.Throwable -> L2df android.database.sqlite.SQLiteException -> L2e3
            boolean r6 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
            if (r6 == 0) goto L2d8
        L2ac:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
            java.lang.Object r7 = r0.get(r6)     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
            java.util.List r7 = (java.util.List) r7     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
            if (r7 != 0) goto L2c5
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
            r7.<init>()     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
            r0.put(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
        L2c5:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
            r7.add(r6)     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
            boolean r6 = r5.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
            if (r6 != 0) goto L2ac
            goto L2fe
        L2d8:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L2dd java.lang.Throwable -> L3ca
            goto L2fe
        L2dd:
            r0 = move-exception
            goto L2e5
        L2df:
            r0 = move-exception
            r5 = 0
            goto L3cb
        L2e3:
            r0 = move-exception
            r5 = 0
        L2e5:
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a     // Catch: java.lang.Throwable -> L3ca
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()     // Catch: java.lang.Throwable -> L3ca
            o7.f3 r4 = r4.m3140q()     // Catch: java.lang.Throwable -> L3ca
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C1111b.m3134u(r1)     // Catch: java.lang.Throwable -> L3ca
            r4.m11171e(r6, r1, r0)     // Catch: java.lang.Throwable -> L3ca
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L3ca
            if (r5 == 0) goto L301
        L2fe:
            r5.close()
        L301:
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r1 = r1.iterator()
        L309:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3c8
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r12.get(r5)
            k7.i3 r6 = (p185k7.C3840i3) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L3bb
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L333
            goto L3bb
        L333:
            o7.m6 r5 = r9.f19756b
            o7.o6 r5 = r5.m11344P()
            r17 = r0
            java.util.List r0 = r6.m8652C()
            java.util.List r0 = r5.m11400H(r0, r7)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L3b7
            k7.a6 r5 = r6.m8501o()
            k7.h3 r5 = (p185k7.C3826h3) r5
            r5.m8564r()
            r5.m8562p(r0)
            o7.m6 r0 = r9.f19756b
            o7.o6 r0 = r0.m11344P()
            r20 = r1
            java.util.List r1 = r6.m8654E()
            java.util.List r0 = r0.m11400H(r1, r7)
            r5.m8565s()
            r5.m8563q(r0)
            r0 = 0
        L36c:
            int r1 = r6.m8655s()
            if (r0 >= r1) goto L38a
            k7.s2 r1 = r6.m8659w(r0)
            int r1 = r1.m8946s()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L387
            r5.m8566t(r0)
        L387:
            int r0 = r0 + 1
            goto L36c
        L38a:
            r0 = 0
        L38b:
            int r1 = r6.m8657u()
            if (r0 >= r1) goto L3a9
            k7.k3 r1 = r6.m8650A(r0)
            int r1 = r1.m8760t()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L3a6
            r5.m8567u(r0)
        L3a6:
            int r0 = r0 + 1
            goto L38b
        L3a9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            k7.d6 r1 = r5.m8201f()
            k7.i3 r1 = (p185k7.C3840i3) r1
            r3.put(r0, r1)
            goto L3c2
        L3b7:
            r0 = r17
            goto L309
        L3bb:
            r17 = r0
            r20 = r1
            r3.put(r5, r6)
        L3c2:
            r0 = r17
            r1 = r20
            goto L309
        L3c8:
            r0 = r3
            goto L3d2
        L3ca:
            r0 = move-exception
        L3cb:
            if (r5 == 0) goto L3d0
            r5.close()
        L3d0:
            throw r0
        L3d1:
            r0 = r12
        L3d2:
            java.util.Iterator r17 = r2.iterator()
        L3d6:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L253
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r20 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r0.get(r1)
            k7.i3 r1 = (p185k7.C3840i3) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            s.a r7 = new s.a
            r7.<init>()
            if (r1 == 0) goto L43e
            int r2 = r1.m8655s()
            if (r2 != 0) goto L408
            goto L43e
        L408:
            java.util.List r2 = r1.m8651B()
            java.util.Iterator r2 = r2.iterator()
        L410:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L43e
            java.lang.Object r3 = r2.next()
            k7.s2 r3 = (p185k7.C3971s2) r3
            boolean r4 = r3.m8949z()
            if (r4 == 0) goto L410
            int r4 = r3.m8946s()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r21 = r3.m8948y()
            if (r21 == 0) goto L439
            long r21 = r3.m8947t()
            java.lang.Long r3 = java.lang.Long.valueOf(r21)
            goto L43a
        L439:
            r3 = 0
        L43a:
            r7.put(r4, r3)
            goto L410
        L43e:
            s.a r4 = new s.a
            r4.<init>()
            if (r1 == 0) goto L48e
            int r2 = r1.m8657u()
            if (r2 != 0) goto L44c
            goto L48e
        L44c:
            java.util.List r2 = r1.m8653D()
            java.util.Iterator r2 = r2.iterator()
        L454:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L48e
            java.lang.Object r3 = r2.next()
            k7.k3 r3 = (p185k7.C3868k3) r3
            boolean r21 = r3.m8758A()
            if (r21 == 0) goto L454
            int r21 = r3.m8759s()
            if (r21 <= 0) goto L454
            int r21 = r3.m8760t()
            r22 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            int r21 = r3.m8759s()
            r23 = r2
            int r2 = r21 + (-1)
            long r2 = r3.m8761u(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.put(r0, r2)
            r0 = r22
            r2 = r23
            goto L454
        L48e:
            r22 = r0
            if (r1 == 0) goto L4e3
            r0 = 0
        L493:
            int r2 = r1.m8658v()
            int r2 = r2 * 64
            if (r0 >= r2) goto L4e3
            java.util.List r2 = r1.m8654E()
            boolean r2 = p249o7.C5068o6.m11383M(r2, r0)
            if (r2 == 0) goto L4d1
            com.google.android.gms.measurement.internal.d r2 = r9.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.m3141r()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r21 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r23 = r10
            java.lang.String r10 = "Filter already evaluated. audience ID, filter ID"
            r2.m11171e(r10, r3, r8)
            r6.set(r0)
            java.util.List r2 = r1.m8652C()
            boolean r2 = p249o7.C5068o6.m11383M(r2, r0)
            if (r2 == 0) goto L4d5
            r5.set(r0)
            goto L4dc
        L4d1:
            r21 = r8
            r23 = r10
        L4d5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L4dc:
            int r0 = r0 + 1
            r8 = r21
            r10 = r23
            goto L493
        L4e3:
            r21 = r8
            r23 = r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r12.get(r0)
            r8 = r1
            k7.i3 r8 = (p185k7.C3840i3) r8
            if (r14 == 0) goto L552
            if (r13 == 0) goto L552
            java.lang.Object r0 = r11.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L552
            java.lang.Long r1 = r9.f19586h
            if (r1 == 0) goto L552
            java.lang.Long r1 = r9.f19585g
            if (r1 != 0) goto L507
            goto L552
        L507:
            java.util.Iterator r0 = r0.iterator()
        L50b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L552
            java.lang.Object r1 = r0.next()
            k7.s1 r1 = (p185k7.C3970s1) r1
            int r2 = r1.m8937t()
            java.lang.Long r3 = r9.f19586h
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.m8931D()
            if (r1 == 0) goto L533
            java.lang.Long r1 = r9.f19585g
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L533:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L544
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L544:
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L50b
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r4.put(r1, r2)
            goto L50b
        L552:
            o7.x6 r0 = new o7.x6
            java.lang.String r3 = r9.f19582d
            r1 = r0
            r2 = r63
            r10 = r4
            r4 = r8
            r8 = 0
            r24 = r11
            r11 = r18
            r64 = r12
            r16 = r13
            r12 = r19
            r13 = 2
            r28 = r21
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.Map<java.lang.Integer, o7.x6> r1 = r9.f19584f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1.put(r2, r0)
            r13 = r16
            r0 = r22
            r10 = r23
            r11 = r24
            r8 = r28
            r12 = r64
            goto L3d6
        L584:
            boolean r0 = r65.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L594
        L58c:
            r18 = r11
            r19 = r12
            r12 = r28
            goto L7f3
        L594:
            o7.h3 r2 = new o7.h3
            r2.<init>(r9)
            s.a r3 = new s.a
            r3.<init>()
            java.util.Iterator r4 = r65.iterator()
        L5a2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L58c
            java.lang.Object r0 = r4.next()
            k7.u2 r0 = (p185k7.C3997u2) r0
            java.lang.String r5 = r9.f19582d
            k7.u2 r5 = r2.m11199a(r5, r0)
            if (r5 == 0) goto L5a2
            o7.m6 r6 = r9.f19756b
            o7.j r6 = r6.m11342M()
            java.lang.String r7 = r9.f19582d
            java.lang.String r8 = r5.m9052z()
            java.lang.String r10 = r0.m9052z()
            o7.n r10 = r6.m11259J(r7, r10)
            if (r10 != 0) goto L60b
            com.google.android.gms.measurement.internal.d r10 = r6.f5736a
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()
            o7.f3 r10 = r10.m3142s()
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C1111b.m3134u(r7)
            com.google.android.gms.measurement.internal.d r6 = r6.f5736a
            o7.c3 r6 = r6.m3174s()
            java.lang.String r6 = r6.m11116d(r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r10.m11171e(r8, r14, r6)
            o7.n r6 = new o7.n
            r29 = r6
            java.lang.String r31 = r0.m9052z()
            r32 = 1
            r34 = 1
            r36 = 1
            long r38 = r0.m9050v()
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r30 = r7
            r29.<init>(r30, r31, r32, r34, r36, r38, r40, r42, r43, r44, r45)
            goto L640
        L60b:
            o7.n r6 = new o7.n
            r46 = r6
            java.lang.String r0 = r10.f19886a
            r47 = r0
            java.lang.String r0 = r10.f19887b
            r48 = r0
            long r7 = r10.f19888c
            r16 = 1
            long r49 = r7 + r16
            long r7 = r10.f19889d
            long r51 = r7 + r16
            long r7 = r10.f19890e
            long r53 = r7 + r16
            long r7 = r10.f19891f
            r55 = r7
            long r7 = r10.f19892g
            r57 = r7
            java.lang.Long r0 = r10.f19893h
            r59 = r0
            java.lang.Long r0 = r10.f19894i
            r60 = r0
            java.lang.Long r0 = r10.f19895j
            r61 = r0
            java.lang.Boolean r0 = r10.f19896k
            r62 = r0
            r46.<init>(r47, r48, r49, r51, r53, r55, r57, r59, r60, r61, r62)
        L640:
            o7.m6 r0 = r9.f19756b
            o7.j r0 = r0.m11342M()
            r0.m11275q(r6)
            long r7 = r6.f19888c
            java.lang.String r10 = r5.m9052z()
            java.lang.Object r0 = r3.get(r10)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L743
            o7.m6 r0 = r9.f19756b
            o7.j r14 = r0.m11342M()
            java.lang.String r13 = r9.f19582d
            r14.m11247j()
            r14.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r13)
            com.google.android.gms.common.internal.C1101a.m3100e(r10)
            r64 = r2
            s.a r2 = new s.a
            r2.<init>()
            android.database.sqlite.SQLiteDatabase r29 = r14.m11253D()
            java.lang.String[] r31 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L713 android.database.sqlite.SQLiteException -> L716
            r65 = r4
            r4 = 2
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: android.database.sqlite.SQLiteException -> L70d java.lang.Throwable -> L713
            r4 = 0
            r0[r4] = r13     // Catch: android.database.sqlite.SQLiteException -> L70d java.lang.Throwable -> L713
            r4 = 1
            r0[r4] = r10     // Catch: android.database.sqlite.SQLiteException -> L70d java.lang.Throwable -> L713
            java.lang.String r30 = "event_filters"
            java.lang.String r32 = "app_id=? AND event_name=?"
            r34 = 0
            r35 = 0
            r36 = 0
            r33 = r0
            android.database.Cursor r4 = r29.query(r30, r31, r32, r33, r34, r35, r36)     // Catch: android.database.sqlite.SQLiteException -> L70d java.lang.Throwable -> L713
            boolean r0 = r4.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L709 java.lang.Throwable -> L73b
            if (r0 == 0) goto L6f8
        L69b:
            r18 = r11
            r11 = 1
            byte[] r0 = r4.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L6f4 java.lang.Throwable -> L73b
            k7.r1 r11 = p185k7.C3970s1.m8928u()     // Catch: java.io.IOException -> L6d4 android.database.sqlite.SQLiteException -> L6f4 java.lang.Throwable -> L73b
            k7.y4 r0 = p249o7.C5068o6.m11380D(r11, r0)     // Catch: java.io.IOException -> L6d4 android.database.sqlite.SQLiteException -> L6f4 java.lang.Throwable -> L73b
            k7.r1 r0 = (p185k7.C3957r1) r0     // Catch: java.io.IOException -> L6d4 android.database.sqlite.SQLiteException -> L6f4 java.lang.Throwable -> L73b
            k7.d6 r0 = r0.m8201f()     // Catch: java.io.IOException -> L6d4 android.database.sqlite.SQLiteException -> L6f4 java.lang.Throwable -> L73b
            k7.s1 r0 = (p185k7.C3970s1) r0     // Catch: java.io.IOException -> L6d4 android.database.sqlite.SQLiteException -> L6f4 java.lang.Throwable -> L73b
            r11 = 0
            int r17 = r4.getInt(r11)     // Catch: android.database.sqlite.SQLiteException -> L6f4 java.lang.Throwable -> L73b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)     // Catch: android.database.sqlite.SQLiteException -> L6f4 java.lang.Throwable -> L73b
            java.lang.Object r17 = r2.get(r11)     // Catch: android.database.sqlite.SQLiteException -> L6f4 java.lang.Throwable -> L73b
            java.util.List r17 = (java.util.List) r17     // Catch: android.database.sqlite.SQLiteException -> L6f4 java.lang.Throwable -> L73b
            r19 = r12
            if (r17 != 0) goto L6ce
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L707 java.lang.Throwable -> L73b
            r12.<init>()     // Catch: android.database.sqlite.SQLiteException -> L707 java.lang.Throwable -> L73b
            r2.put(r11, r12)     // Catch: android.database.sqlite.SQLiteException -> L707 java.lang.Throwable -> L73b
            goto L6d0
        L6ce:
            r12 = r17
        L6d0:
            r12.add(r0)     // Catch: android.database.sqlite.SQLiteException -> L707 java.lang.Throwable -> L73b
            goto L6e8
        L6d4:
            r0 = move-exception
            r19 = r12
            com.google.android.gms.measurement.internal.d r11 = r14.f5736a     // Catch: android.database.sqlite.SQLiteException -> L707 java.lang.Throwable -> L73b
            com.google.android.gms.measurement.internal.b r11 = r11.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L707 java.lang.Throwable -> L73b
            o7.f3 r11 = r11.m3140q()     // Catch: android.database.sqlite.SQLiteException -> L707 java.lang.Throwable -> L73b
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C1111b.m3134u(r13)     // Catch: android.database.sqlite.SQLiteException -> L707 java.lang.Throwable -> L73b
            r11.m11171e(r15, r12, r0)     // Catch: android.database.sqlite.SQLiteException -> L707 java.lang.Throwable -> L73b
        L6e8:
            boolean r0 = r4.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L707 java.lang.Throwable -> L73b
            if (r0 != 0) goto L6ef
            goto L700
        L6ef:
            r11 = r18
            r12 = r19
            goto L69b
        L6f4:
            r0 = move-exception
        L6f5:
            r19 = r12
            goto L71b
        L6f8:
            r18 = r11
            r19 = r12
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L707 java.lang.Throwable -> L73b
        L700:
            r4.close()
            r0 = r2
            r12 = r28
            goto L737
        L707:
            r0 = move-exception
            goto L71b
        L709:
            r0 = move-exception
            r18 = r11
            goto L6f5
        L70d:
            r0 = move-exception
        L70e:
            r18 = r11
            r19 = r12
            goto L71a
        L713:
            r0 = move-exception
            r5 = 0
            goto L73d
        L716:
            r0 = move-exception
            r65 = r4
            goto L70e
        L71a:
            r4 = 0
        L71b:
            com.google.android.gms.measurement.internal.d r2 = r14.f5736a     // Catch: java.lang.Throwable -> L73b
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L73b
            o7.f3 r2 = r2.m3140q()     // Catch: java.lang.Throwable -> L73b
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C1111b.m3134u(r13)     // Catch: java.lang.Throwable -> L73b
            r12 = r28
            r2.m11171e(r12, r11, r0)     // Catch: java.lang.Throwable -> L73b
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L73b
            if (r4 == 0) goto L737
            r4.close()
        L737:
            r3.put(r10, r0)
            goto L74d
        L73b:
            r0 = move-exception
            r5 = r4
        L73d:
            if (r5 == 0) goto L742
            r5.close()
        L742:
            throw r0
        L743:
            r64 = r2
            r65 = r4
            r18 = r11
            r19 = r12
            r12 = r28
        L74d:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L755:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7e6
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Set<java.lang.Integer> r10 = r9.f19583e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L77f
            com.google.android.gms.measurement.internal.d r4 = r9.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.m3141r()
            r4.m11170d(r1, r11)
            goto L755
        L77f:
            java.lang.Object r10 = r0.get(r11)
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
            r11 = 1
        L78a:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L7d5
            java.lang.Object r11 = r10.next()
            k7.s1 r11 = (p185k7.C3970s1) r11
            o7.y6 r13 = new o7.y6
            java.lang.String r14 = r9.f19582d
            r13.<init>(r9, r14, r4, r11)
            java.lang.Long r14 = r9.f19585g
            r17 = r0
            java.lang.Long r0 = r9.f19586h
            int r11 = r11.m8937t()
            boolean r36 = r9.m11105o(r4, r11)
            r29 = r13
            r30 = r14
            r31 = r0
            r32 = r5
            r33 = r7
            r35 = r6
            boolean r11 = r29.m11454f(r30, r31, r32, r33, r35, r36)
            if (r11 == 0) goto L7cb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            o7.x6 r0 = r9.m11104n(r0)
            r0.m11446b(r13)
            r0 = r17
            goto L78a
        L7cb:
            java.util.Set<java.lang.Integer> r0 = r9.f19583e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r0.add(r10)
            goto L7d7
        L7d5:
            r17 = r0
        L7d7:
            if (r11 != 0) goto L7e2
            java.util.Set<java.lang.Integer> r0 = r9.f19583e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
        L7e2:
            r0 = r17
            goto L755
        L7e6:
            r2 = r64
            r4 = r65
            r28 = r12
            r11 = r18
            r12 = r19
            r13 = 2
            goto L5a2
        L7f3:
            boolean r0 = r66.isEmpty()
            if (r0 == 0) goto L7fd
        L7f9:
            r11 = r18
            goto La2c
        L7fd:
            s.a r2 = new s.a
            r2.<init>()
            java.util.Iterator r3 = r66.iterator()
        L806:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7f9
            java.lang.Object r0 = r3.next()
            r4 = r0
            k7.m3 r4 = (p185k7.C3894m3) r4
            java.lang.String r5 = r4.m8814x()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L8f8
            o7.m6 r0 = r9.f19756b
            o7.j r6 = r0.m11342M()
            java.lang.String r7 = r9.f19582d
            r6.m11247j()
            r6.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r7)
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            s.a r8 = new s.a
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r29 = r6.m11253D()
            r11 = r18
            r10 = r19
            java.lang.String[] r31 = new java.lang.String[]{r11, r10}     // Catch: java.lang.Throwable -> L8cb android.database.sqlite.SQLiteException -> L8ce
            r13 = 2
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch: java.lang.Throwable -> L8cb android.database.sqlite.SQLiteException -> L8ce
            r13 = 0
            r0[r13] = r7     // Catch: java.lang.Throwable -> L8cb android.database.sqlite.SQLiteException -> L8ce
            r13 = 1
            r0[r13] = r5     // Catch: java.lang.Throwable -> L8cb android.database.sqlite.SQLiteException -> L8ce
            java.lang.String r30 = "property_filters"
            java.lang.String r32 = "app_id=? AND property_name=?"
            r34 = 0
            r35 = 0
            r36 = 0
            r33 = r0
            android.database.Cursor r13 = r29.query(r30, r31, r32, r33, r34, r35, r36)     // Catch: java.lang.Throwable -> L8cb android.database.sqlite.SQLiteException -> L8ce
            boolean r0 = r13.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            if (r0 == 0) goto L8be
        L863:
            r14 = 1
            byte[] r0 = r13.getBlob(r14)     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            k7.z1 r15 = p185k7.C3727a2.m8183u()     // Catch: java.io.IOException -> L89a android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            k7.y4 r0 = p249o7.C5068o6.m11380D(r15, r0)     // Catch: java.io.IOException -> L89a android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            k7.z1 r0 = (p185k7.C4061z1) r0     // Catch: java.io.IOException -> L89a android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            k7.d6 r0 = r0.m8201f()     // Catch: java.io.IOException -> L89a android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            k7.a2 r0 = (p185k7.C3727a2) r0     // Catch: java.io.IOException -> L89a android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            r15 = 0
            int r17 = r13.getInt(r15)     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r17)     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            java.lang.Object r17 = r8.get(r14)     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            java.util.List r17 = (java.util.List) r17     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            if (r17 != 0) goto L892
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            r15.<init>()     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            r8.put(r14, r15)     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            goto L894
        L892:
            r15 = r17
        L894:
            r15.add(r0)     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            r64 = r3
            goto L8b0
        L89a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r14 = r6.f5736a     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            com.google.android.gms.measurement.internal.b r14 = r14.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            o7.f3 r14 = r14.m3140q()     // Catch: android.database.sqlite.SQLiteException -> L8c7 java.lang.Throwable -> L8f0
            java.lang.String r15 = "Failed to merge filter"
            r64 = r3
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r7)     // Catch: android.database.sqlite.SQLiteException -> L8c5 java.lang.Throwable -> L8f0
            r14.m11171e(r15, r3, r0)     // Catch: android.database.sqlite.SQLiteException -> L8c5 java.lang.Throwable -> L8f0
        L8b0:
            boolean r0 = r13.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L8c5 java.lang.Throwable -> L8f0
            if (r0 != 0) goto L8bb
            r13.close()
            r0 = r8
            goto L8ec
        L8bb:
            r3 = r64
            goto L863
        L8be:
            r64 = r3
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L8c5 java.lang.Throwable -> L8f0
            goto L8e9
        L8c5:
            r0 = move-exception
            goto L8d2
        L8c7:
            r0 = move-exception
            r64 = r3
            goto L8d2
        L8cb:
            r0 = move-exception
            r5 = 0
            goto L8f2
        L8ce:
            r0 = move-exception
            r64 = r3
            r13 = 0
        L8d2:
            com.google.android.gms.measurement.internal.d r3 = r6.f5736a     // Catch: java.lang.Throwable -> L8f0
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: java.lang.Throwable -> L8f0
            o7.f3 r3 = r3.m3140q()     // Catch: java.lang.Throwable -> L8f0
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1111b.m3134u(r7)     // Catch: java.lang.Throwable -> L8f0
            r3.m11171e(r12, r6, r0)     // Catch: java.lang.Throwable -> L8f0
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L8f0
            if (r13 == 0) goto L8ec
        L8e9:
            r13.close()
        L8ec:
            r2.put(r5, r0)
            goto L8fe
        L8f0:
            r0 = move-exception
            r5 = r13
        L8f2:
            if (r5 == 0) goto L8f7
            r5.close()
        L8f7:
            throw r0
        L8f8:
            r64 = r3
            r11 = r18
            r10 = r19
        L8fe:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L906:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto La24
            java.lang.Object r5 = r3.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Set<java.lang.Integer> r6 = r9.f19583e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L931
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.m3141r()
            r0.m11170d(r1, r7)
            goto La24
        L931:
            java.lang.Object r6 = r0.get(r7)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L93c:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto La13
            java.lang.Object r7 = r6.next()
            k7.a2 r7 = (p185k7.C3727a2) r7
            com.google.android.gms.measurement.internal.d r8 = r9.f5736a
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()
            java.lang.String r8 = r8.m3144x()
            r13 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r13)
            if (r8 == 0) goto L9a6
            com.google.android.gms.measurement.internal.d r8 = r9.f5736a
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()
            o7.f3 r8 = r8.m3141r()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r15 = r7.m8187B()
            if (r15 == 0) goto L976
            int r15 = r7.m8190s()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L977
        L976:
            r15 = 0
        L977:
            com.google.android.gms.measurement.internal.d r13 = r9.f5736a
            o7.c3 r13 = r13.m3174s()
            r65 = r0
            java.lang.String r0 = r7.m8192w()
            java.lang.String r0 = r13.m11118f(r0)
            java.lang.String r13 = "Evaluating filter. audience, filter, property"
            r8.m11172f(r13, r14, r15, r0)
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.m3141r()
            o7.m6 r8 = r9.f19756b
            o7.o6 r8 = r8.m11344P()
            java.lang.String r8 = r8.m11399F(r7)
            java.lang.String r13 = "Filter definition"
            r0.m11170d(r13, r8)
            goto L9a8
        L9a6:
            r65 = r0
        L9a8:
            boolean r0 = r7.m8187B()
            if (r0 == 0) goto L9e9
            int r0 = r7.m8190s()
            r8 = 256(0x100, float:3.59E-43)
            if (r0 <= r8) goto L9b7
            goto L9e9
        L9b7:
            o7.y6 r0 = new o7.y6
            java.lang.String r8 = r9.f19582d
            r0.<init>(r9, r8, r5, r7)
            java.lang.Long r8 = r9.f19585g
            java.lang.Long r13 = r9.f19586h
            int r7 = r7.m8190s()
            boolean r7 = r9.m11105o(r5, r7)
            boolean r7 = r0.m11455g(r8, r13, r4, r7)
            if (r7 == 0) goto L9df
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            o7.x6 r8 = r9.m11104n(r8)
            r8.m11446b(r0)
            r0 = r65
            goto L93c
        L9df:
            java.util.Set<java.lang.Integer> r0 = r9.f19583e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.add(r6)
            goto La15
        L9e9:
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.m3142s()
            java.lang.String r6 = r9.f19582d
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)
            boolean r8 = r7.m8187B()
            if (r8 == 0) goto La08
            int r7 = r7.m8190s()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto La09
        La08:
            r7 = 0
        La09:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r0.m11171e(r8, r6, r7)
            goto La17
        La13:
            r65 = r0
        La15:
            if (r7 != 0) goto La20
        La17:
            java.util.Set<java.lang.Integer> r0 = r9.f19583e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        La20:
            r0 = r65
            goto L906
        La24:
            r3 = r64
            r19 = r10
            r18 = r11
            goto L806
        La2c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, o7.x6> r0 = r9.f19584f
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r2 = r9.f19583e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        La40:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lad5
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, o7.x6> r3 = r9.f19584f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            o7.x6 r3 = (p249o7.C5140x6) r3
            com.google.android.gms.common.internal.C1101a.m3103h(r3)
            k7.q2 r0 = r3.m11445a(r0)
            r1.add(r0)
            o7.m6 r3 = r9.f19756b
            o7.j r3 = r3.m11342M()
            java.lang.String r5 = r9.f19582d
            k7.i3 r0 = r0.m8905v()
            r3.m11247j()
            r3.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            com.google.android.gms.common.internal.C1101a.m3103h(r0)
            byte[] r0 = r0.m9160i()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r6.put(r11, r4)
            r4 = r23
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.m11253D()     // Catch: android.database.sqlite.SQLiteException -> Labc
            java.lang.String r7 = "audience_filter_values"
            r8 = 5
            r10 = 0
            long r6 = r0.insertWithOnConflict(r7, r10, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> Laba
            r12 = -1
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto Lad1
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a     // Catch: android.database.sqlite.SQLiteException -> Laba
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> Laba
            o7.f3 r0 = r0.m3140q()     // Catch: android.database.sqlite.SQLiteException -> Laba
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1111b.m3134u(r5)     // Catch: android.database.sqlite.SQLiteException -> Laba
            r0.m11170d(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> Laba
            goto Lad1
        Laba:
            r0 = move-exception
            goto Labe
        Labc:
            r0 = move-exception
            r10 = 0
        Labe:
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.m3140q()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r5)
            java.lang.String r6 = "Error storing filter results. appId"
            r3.m11171e(r6, r5, r0)
        Lad1:
            r23 = r4
            goto La40
        Lad5:
            return r1
        Lad6:
            r0 = move-exception
            r5 = r4
        Lad8:
            if (r5 == 0) goto Ladd
            r5.close()
        Ladd:
            throw r0
    }

    /* renamed from: n */
    public final p249o7.C5140x6 m11104n(java.lang.Integer r3) {
            r2 = this;
            java.util.Map<java.lang.Integer, o7.x6> r0 = r2.f19584f
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L11
            java.util.Map<java.lang.Integer, o7.x6> r0 = r2.f19584f
            java.lang.Object r3 = r0.get(r3)
            o7.x6 r3 = (p249o7.C5140x6) r3
            return r3
        L11:
            o7.x6 r0 = new o7.x6
            java.lang.String r1 = r2.f19582d
            r0.<init>(r2, r1)
            java.util.Map<java.lang.Integer, o7.x6> r1 = r2.f19584f
            r1.put(r3, r0)
            return r0
    }

    /* renamed from: o */
    public final boolean m11105o(int r2, int r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, o7.x6> r0 = r1.f19584f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            o7.x6 r2 = (p249o7.C5140x6) r2
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            java.util.BitSet r2 = r2.f20176d
            boolean r2 = r2.get(r3)
            return r2
    }
}

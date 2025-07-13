package p249o7;

/* renamed from: o7.v5 */
/* loaded from: classes.dex */
public final class C5123v5 extends p249o7.AbstractC5097s3 {

    /* renamed from: c */
    public final p249o7.ServiceConnectionC5115u5 f20134c;

    /* renamed from: d */
    public p249o7.InterfaceC5152z2 f20135d;

    /* renamed from: e */
    public volatile java.lang.Boolean f20136e;

    /* renamed from: f */
    public final p249o7.AbstractC5029k f20137f;

    /* renamed from: g */
    public final p071e6.C1541p f20138g;

    /* renamed from: h */
    public final java.util.List<java.lang.Runnable> f20139h;

    /* renamed from: i */
    public final p249o7.AbstractC5029k f20140i;

    public C5123v5(com.google.android.gms.measurement.internal.C1113d r3) {
            r2 = this;
            r2.<init>(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f20139h = r0
            e6.p r0 = new e6.p
            u6.c r1 = r3.f5723n
            r0.<init>(r1)
            r2.f20138g = r0
            o7.u5 r0 = new o7.u5
            r0.<init>(r2)
            r2.f20134c = r0
            o7.q5 r0 = new o7.q5
            r1 = 0
            r0.<init>(r2, r3, r1)
            r2.f20137f = r0
            o7.q5 r0 = new o7.q5
            r1 = 1
            r0.<init>(r2, r3, r1)
            r2.f20140i = r0
            return
    }

    /* renamed from: w */
    public static void m11425w(p249o7.C5123v5 r2, android.content.ComponentName r3) {
            r2.mo3183i()
            o7.z2 r0 = r2.f20135d
            if (r0 == 0) goto L1d
            r0 = 0
            r2.f20135d = r0
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r1 = "Disconnected from device MeasurementService"
            r0.m11170d(r1, r3)
            r2.mo3183i()
            r2.m11436x()
        L1d:
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
    public final void m11426m(p249o7.InterfaceC5152z2 r28, p270p6.AbstractC5367a r29, p249o7.C5116u6 r30) {
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r27.mo3183i()
            r27.m11419j()
            r27.m11435v()
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            java.util.Objects.requireNonNull(r0)
            r5 = 100
            r6 = 0
            r0 = 100
            r7 = 0
        L1c:
            r8 = 1001(0x3e9, float:1.403E-42)
            if (r7 >= r8) goto L351
            if (r0 != r5) goto L351
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            o7.b3 r9 = r0.m3173r()
            java.lang.String r10 = "rowid"
            java.lang.String r11 = "Error reading entries from local database"
            r9.mo3183i()
            boolean r0 = r9.f19602d
            if (r0 == 0) goto L39
            goto L5c
        L39:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            android.content.Context r0 = r0.f5710a
            java.lang.String r14 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r14)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L2cf
            r14 = 5
            r12 = 5
            r15 = 0
        L51:
            if (r15 >= r14) goto L2be
            r14 = 1
            android.database.sqlite.SQLiteDatabase r5 = r9.m11106m()     // Catch: java.lang.Throwable -> L23f android.database.sqlite.SQLiteException -> L244 android.database.sqlite.SQLiteDatabaseLockedException -> L26e android.database.sqlite.SQLiteFullException -> L284
            if (r5 != 0) goto L60
            r9.f19602d = r14     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L227 android.database.sqlite.SQLiteDatabaseLockedException -> L22e android.database.sqlite.SQLiteFullException -> L236
        L5c:
            r17 = r7
            goto L2cd
        L60:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L227 android.database.sqlite.SQLiteDatabaseLockedException -> L22e android.database.sqlite.SQLiteFullException -> L236
            java.lang.String r0 = "3"
            java.lang.String r17 = "messages"
            java.lang.String[] r18 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L214
            java.lang.String r19 = "type=?"
            java.lang.String[] r20 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L214
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid desc"
            java.lang.String r24 = "1"
            r16 = r5
            android.database.Cursor r14 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L214
            boolean r0 = r14.moveToFirst()     // Catch: java.lang.Throwable -> L20d
            r25 = -1
            if (r0 == 0) goto L8f
            long r16 = r14.getLong(r6)     // Catch: java.lang.Throwable -> L20d
            r14.close()     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L227 android.database.sqlite.SQLiteDatabaseLockedException -> L22e android.database.sqlite.SQLiteFullException -> L236
            goto L94
        L8f:
            r14.close()     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L227 android.database.sqlite.SQLiteDatabaseLockedException -> L22e android.database.sqlite.SQLiteFullException -> L236
            r16 = r25
        L94:
            int r0 = (r16 > r25 ? 1 : (r16 == r25 ? 0 : -1))
            if (r0 == 0) goto Laa
            java.lang.String r0 = "rowid<?"
            r14 = 1
            java.lang.String[] r6 = new java.lang.String[r14]     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L227 android.database.sqlite.SQLiteDatabaseLockedException -> L22e android.database.sqlite.SQLiteFullException -> L236
            java.lang.String r14 = java.lang.String.valueOf(r16)     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L227 android.database.sqlite.SQLiteDatabaseLockedException -> L22e android.database.sqlite.SQLiteFullException -> L236
            r16 = 0
            r6[r16] = r14     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L227 android.database.sqlite.SQLiteDatabaseLockedException -> L22e android.database.sqlite.SQLiteFullException -> L236
            r19 = r0
            r20 = r6
            goto Lae
        Laa:
            r19 = 0
            r20 = 0
        Lae:
            java.lang.String r0 = "type"
            java.lang.String r6 = "entry"
            java.lang.String[] r18 = new java.lang.String[]{r10, r0, r6}     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L227 android.database.sqlite.SQLiteDatabaseLockedException -> L22e android.database.sqlite.SQLiteFullException -> L236
            java.lang.String r17 = "messages"
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid asc"
            r6 = 100
            java.lang.String r24 = java.lang.Integer.toString(r6)     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L227 android.database.sqlite.SQLiteDatabaseLockedException -> L22e android.database.sqlite.SQLiteFullException -> L236
            r16 = r5
            android.database.Cursor r6 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L225 android.database.sqlite.SQLiteException -> L227 android.database.sqlite.SQLiteDatabaseLockedException -> L22e android.database.sqlite.SQLiteFullException -> L236
        Lca:
            boolean r0 = r6.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L1fb android.database.sqlite.SQLiteDatabaseLockedException -> L201 android.database.sqlite.SQLiteFullException -> L207 java.lang.Throwable -> L2b1
            if (r0 == 0) goto L1b8
            r14 = 0
            long r25 = r6.getLong(r14)     // Catch: android.database.sqlite.SQLiteException -> L1fb android.database.sqlite.SQLiteDatabaseLockedException -> L201 android.database.sqlite.SQLiteFullException -> L207 java.lang.Throwable -> L2b1
            r14 = 1
            int r0 = r6.getInt(r14)     // Catch: android.database.sqlite.SQLiteException -> L1fb android.database.sqlite.SQLiteDatabaseLockedException -> L201 android.database.sqlite.SQLiteFullException -> L207 java.lang.Throwable -> L2b1
            r14 = 2
            r16 = r10
            byte[] r10 = r6.getBlob(r14)     // Catch: android.database.sqlite.SQLiteException -> L1ad android.database.sqlite.SQLiteDatabaseLockedException -> L1b1 android.database.sqlite.SQLiteFullException -> L1b4 java.lang.Throwable -> L2b1
            if (r0 != 0) goto L11e
            android.os.Parcel r14 = android.os.Parcel.obtain()     // Catch: android.database.sqlite.SQLiteException -> L1ad android.database.sqlite.SQLiteDatabaseLockedException -> L1b1 android.database.sqlite.SQLiteFullException -> L1b4 java.lang.Throwable -> L2b1
            int r0 = r10.length     // Catch: java.lang.Throwable -> L102 p270p6.C5368b.a -> L106
            r17 = r7
            r7 = 0
            r14.unmarshall(r10, r7, r0)     // Catch: java.lang.Throwable -> L100 p270p6.C5368b.a -> L108
            r14.setDataPosition(r7)     // Catch: java.lang.Throwable -> L100 p270p6.C5368b.a -> L108
            android.os.Parcelable$Creator<o7.q> r0 = p249o7.C5077q.CREATOR     // Catch: java.lang.Throwable -> L100 p270p6.C5368b.a -> L108
            java.lang.Object r0 = r0.createFromParcel(r14)     // Catch: java.lang.Throwable -> L100 p270p6.C5368b.a -> L108
            o7.q r0 = (p249o7.C5077q) r0     // Catch: java.lang.Throwable -> L100 p270p6.C5368b.a -> L108
            r14.recycle()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            if (r0 == 0) goto L1a7
            goto L184
        L100:
            r0 = move-exception
            goto L11a
        L102:
            r0 = move-exception
            r17 = r7
            goto L11a
        L106:
            r17 = r7
        L108:
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L100
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> L100
            java.lang.String r7 = "Failed to load event from local database"
            r0.m11169c(r7)     // Catch: java.lang.Throwable -> L100
            r14.recycle()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            goto L1a7
        L11a:
            r14.recycle()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            throw r0     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
        L11e:
            r17 = r7
            r7 = 1
            if (r0 != r7) goto L155
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            int r0 = r10.length     // Catch: java.lang.Throwable -> L13b p270p6.C5368b.a -> L13d
            r14 = 0
            r7.unmarshall(r10, r14, r0)     // Catch: java.lang.Throwable -> L13b p270p6.C5368b.a -> L13d
            r7.setDataPosition(r14)     // Catch: java.lang.Throwable -> L13b p270p6.C5368b.a -> L13d
            android.os.Parcelable$Creator<o7.p6> r0 = p249o7.C5076p6.CREATOR     // Catch: java.lang.Throwable -> L13b p270p6.C5368b.a -> L13d
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch: java.lang.Throwable -> L13b p270p6.C5368b.a -> L13d
            o7.p6 r0 = (p249o7.C5076p6) r0     // Catch: java.lang.Throwable -> L13b p270p6.C5368b.a -> L13d
            r7.recycle()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            goto L14e
        L13b:
            r0 = move-exception
            goto L151
        L13d:
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a     // Catch: java.lang.Throwable -> L13b
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L13b
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> L13b
            java.lang.String r10 = "Failed to load user property from local database"
            r0.m11169c(r10)     // Catch: java.lang.Throwable -> L13b
            r7.recycle()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            r0 = 0
        L14e:
            if (r0 == 0) goto L1a7
            goto L184
        L151:
            r7.recycle()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            throw r0     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
        L155:
            if (r0 != r14) goto L18c
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            int r0 = r10.length     // Catch: java.lang.Throwable -> L16f p270p6.C5368b.a -> L171
            r14 = 0
            r7.unmarshall(r10, r14, r0)     // Catch: java.lang.Throwable -> L16f p270p6.C5368b.a -> L171
            r7.setDataPosition(r14)     // Catch: java.lang.Throwable -> L16f p270p6.C5368b.a -> L171
            android.os.Parcelable$Creator<o7.b> r0 = p249o7.C4957b.CREATOR     // Catch: java.lang.Throwable -> L16f p270p6.C5368b.a -> L171
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch: java.lang.Throwable -> L16f p270p6.C5368b.a -> L171
            o7.b r0 = (p249o7.C4957b) r0     // Catch: java.lang.Throwable -> L16f p270p6.C5368b.a -> L171
            r7.recycle()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            goto L182
        L16f:
            r0 = move-exception
            goto L188
        L171:
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a     // Catch: java.lang.Throwable -> L16f
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L16f
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> L16f
            java.lang.String r10 = "Failed to load conditional user property from local database"
            r0.m11169c(r10)     // Catch: java.lang.Throwable -> L16f
            r7.recycle()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            r0 = 0
        L182:
            if (r0 == 0) goto L1a7
        L184:
            r13.add(r0)     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            goto L1a7
        L188:
            r7.recycle()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            throw r0     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
        L18c:
            r7 = 3
            if (r0 != r7) goto L19a
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            o7.f3 r0 = r0.f5675i     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            java.lang.String r7 = "Skipping app launch break"
            goto L1a4
        L19a:
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            o7.f3 r0 = r0.f5672f     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            java.lang.String r7 = "Unknown record type in local database"
        L1a4:
            r0.m11169c(r7)     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
        L1a7:
            r10 = r16
            r7 = r17
            goto Lca
        L1ad:
            r0 = move-exception
            r17 = r7
            goto L1f5
        L1b1:
            r17 = r7
            goto L205
        L1b4:
            r0 = move-exception
            r17 = r7
            goto L1f9
        L1b8:
            r17 = r7
            r16 = r10
            r7 = 1
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            java.lang.String r7 = java.lang.Long.toString(r25)     // Catch: android.database.sqlite.SQLiteException -> L1f4 android.database.sqlite.SQLiteFullException -> L1f8 android.database.sqlite.SQLiteDatabaseLockedException -> L205 java.lang.Throwable -> L2b1
            r10 = 0
            r0[r10] = r7     // Catch: android.database.sqlite.SQLiteException -> L1ef android.database.sqlite.SQLiteFullException -> L1f2 android.database.sqlite.SQLiteDatabaseLockedException -> L234 java.lang.Throwable -> L2b1
            java.lang.String r7 = "messages"
            java.lang.String r14 = "rowid <= ?"
            int r0 = r5.delete(r7, r14, r0)     // Catch: android.database.sqlite.SQLiteException -> L1ef android.database.sqlite.SQLiteFullException -> L1f2 android.database.sqlite.SQLiteDatabaseLockedException -> L234 java.lang.Throwable -> L2b1
            int r7 = r13.size()     // Catch: android.database.sqlite.SQLiteException -> L1ef android.database.sqlite.SQLiteFullException -> L1f2 android.database.sqlite.SQLiteDatabaseLockedException -> L234 java.lang.Throwable -> L2b1
            if (r0 >= r7) goto L1e1
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a     // Catch: android.database.sqlite.SQLiteException -> L1ef android.database.sqlite.SQLiteFullException -> L1f2 android.database.sqlite.SQLiteDatabaseLockedException -> L234 java.lang.Throwable -> L2b1
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L1ef android.database.sqlite.SQLiteFullException -> L1f2 android.database.sqlite.SQLiteDatabaseLockedException -> L234 java.lang.Throwable -> L2b1
            o7.f3 r0 = r0.f5672f     // Catch: android.database.sqlite.SQLiteException -> L1ef android.database.sqlite.SQLiteFullException -> L1f2 android.database.sqlite.SQLiteDatabaseLockedException -> L234 java.lang.Throwable -> L2b1
            java.lang.String r7 = "Fewer entries removed from local database than expected"
            r0.m11169c(r7)     // Catch: android.database.sqlite.SQLiteException -> L1ef android.database.sqlite.SQLiteFullException -> L1f2 android.database.sqlite.SQLiteDatabaseLockedException -> L234 java.lang.Throwable -> L2b1
        L1e1:
            r5.setTransactionSuccessful()     // Catch: android.database.sqlite.SQLiteException -> L1ef android.database.sqlite.SQLiteFullException -> L1f2 android.database.sqlite.SQLiteDatabaseLockedException -> L234 java.lang.Throwable -> L2b1
            r5.endTransaction()     // Catch: android.database.sqlite.SQLiteException -> L1ef android.database.sqlite.SQLiteFullException -> L1f2 android.database.sqlite.SQLiteDatabaseLockedException -> L234 java.lang.Throwable -> L2b1
            r6.close()
            r5.close()
            goto L2d1
        L1ef:
            r0 = move-exception
            goto L24c
        L1f2:
            r0 = move-exception
            goto L23d
        L1f4:
            r0 = move-exception
        L1f5:
            r10 = 0
            goto L24c
        L1f8:
            r0 = move-exception
        L1f9:
            r10 = 0
            goto L23d
        L1fb:
            r0 = move-exception
            r17 = r7
            r16 = r10
            goto L1f5
        L201:
            r17 = r7
            r16 = r10
        L205:
            r10 = 0
            goto L234
        L207:
            r0 = move-exception
            r17 = r7
            r16 = r10
            goto L1f9
        L20d:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = 0
            goto L21b
        L214:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = 0
            r14 = 0
        L21b:
            if (r14 == 0) goto L220
            r14.close()     // Catch: android.database.sqlite.SQLiteException -> L221 android.database.sqlite.SQLiteFullException -> L223 java.lang.Throwable -> L225 android.database.sqlite.SQLiteDatabaseLockedException -> L233
        L220:
            throw r0     // Catch: android.database.sqlite.SQLiteException -> L221 android.database.sqlite.SQLiteFullException -> L223 java.lang.Throwable -> L225 android.database.sqlite.SQLiteDatabaseLockedException -> L233
        L221:
            r0 = move-exception
            goto L24b
        L223:
            r0 = move-exception
            goto L23c
        L225:
            r0 = move-exception
            goto L241
        L227:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = 0
            goto L24b
        L22e:
            r17 = r7
            r16 = r10
            r10 = 0
        L233:
            r6 = 0
        L234:
            r7 = r11
            goto L276
        L236:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = 0
        L23c:
            r6 = 0
        L23d:
            r7 = r11
            goto L28c
        L23f:
            r0 = move-exception
            r5 = 0
        L241:
            r12 = 0
            goto L2b3
        L244:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = 0
            r5 = 0
        L24b:
            r6 = 0
        L24c:
            if (r5 == 0) goto L257
            boolean r7 = r5.inTransaction()     // Catch: java.lang.Throwable -> L2b1
            if (r7 == 0) goto L257
            r5.endTransaction()     // Catch: java.lang.Throwable -> L2b1
        L257:
            com.google.android.gms.measurement.internal.d r7 = r9.f5736a     // Catch: java.lang.Throwable -> L2b1
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()     // Catch: java.lang.Throwable -> L2b1
            o7.f3 r7 = r7.f5672f     // Catch: java.lang.Throwable -> L2b1
            r7.m11170d(r11, r0)     // Catch: java.lang.Throwable -> L2b1
            r7 = 1
            r9.f19602d = r7     // Catch: java.lang.Throwable -> L2b1
            if (r6 == 0) goto L26a
            r6.close()
        L26a:
            r7 = r11
            if (r5 == 0) goto L2a4
            goto L2a1
        L26e:
            r17 = r7
            r16 = r10
            r10 = 0
            r7 = r11
            r5 = 0
            r6 = 0
        L276:
            long r10 = (long) r12
            android.os.SystemClock.sleep(r10)     // Catch: java.lang.Throwable -> L2b1
            int r12 = r12 + 20
            if (r6 == 0) goto L281
            r6.close()
        L281:
            if (r5 == 0) goto L2a4
            goto L2a1
        L284:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r7 = r11
            r5 = 0
            r6 = 0
        L28c:
            com.google.android.gms.measurement.internal.d r10 = r9.f5736a     // Catch: java.lang.Throwable -> L2b1
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()     // Catch: java.lang.Throwable -> L2b1
            o7.f3 r10 = r10.f5672f     // Catch: java.lang.Throwable -> L2b1
            r10.m11170d(r7, r0)     // Catch: java.lang.Throwable -> L2b1
            r10 = 1
            r9.f19602d = r10     // Catch: java.lang.Throwable -> L2b1
            if (r6 == 0) goto L29f
            r6.close()
        L29f:
            if (r5 == 0) goto L2a4
        L2a1:
            r5.close()
        L2a4:
            int r15 = r15 + 1
            r11 = r7
            r10 = r16
            r7 = r17
            r5 = 100
            r6 = 0
            r14 = 5
            goto L51
        L2b1:
            r0 = move-exception
            r12 = r6
        L2b3:
            if (r12 == 0) goto L2b8
            r12.close()
        L2b8:
            if (r5 == 0) goto L2bd
            r5.close()
        L2bd:
            throw r0
        L2be:
            r17 = r7
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.String r5 = "Failed to read events from database in reasonable time"
            r0.m11169c(r5)
        L2cd:
            r12 = 0
            goto L2d2
        L2cf:
            r17 = r7
        L2d1:
            r12 = r13
        L2d2:
            if (r12 == 0) goto L2dd
            r8.addAll(r12)
            int r0 = r12.size()
            r5 = r0
            goto L2de
        L2dd:
            r5 = 0
        L2de:
            r6 = 100
            if (r3 == 0) goto L2e7
            if (r5 >= r6) goto L2e7
            r8.add(r3)
        L2e7:
            int r7 = r8.size()
            r9 = 0
        L2ec:
            if (r9 >= r7) goto L349
            java.lang.Object r0 = r8.get(r9)
            p6.a r0 = (p270p6.AbstractC5367a) r0
            boolean r10 = r0 instanceof p249o7.C5077q
            if (r10 == 0) goto L30a
            o7.q r0 = (p249o7.C5077q) r0     // Catch: android.os.RemoteException -> L2fe
            r2.mo11304g0(r0, r4)     // Catch: android.os.RemoteException -> L2fe
            goto L346
        L2fe:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r10 = r1.f5736a
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()
            o7.f3 r10 = r10.f5672f
            java.lang.String r11 = "Failed to send event to the service"
            goto L335
        L30a:
            boolean r10 = r0 instanceof p249o7.C5076p6
            if (r10 == 0) goto L320
            o7.p6 r0 = (p249o7.C5076p6) r0     // Catch: android.os.RemoteException -> L314
            r2.mo11300X0(r0, r4)     // Catch: android.os.RemoteException -> L314
            goto L346
        L314:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r10 = r1.f5736a
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()
            o7.f3 r10 = r10.f5672f
            java.lang.String r11 = "Failed to send user property to the service"
            goto L335
        L320:
            boolean r10 = r0 instanceof p249o7.C4957b
            if (r10 == 0) goto L339
            o7.b r0 = (p249o7.C4957b) r0     // Catch: android.os.RemoteException -> L32a
            r2.mo11301X1(r0, r4)     // Catch: android.os.RemoteException -> L32a
            goto L346
        L32a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r10 = r1.f5736a
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()
            o7.f3 r10 = r10.f5672f
            java.lang.String r11 = "Failed to send conditional user property to the service"
        L335:
            r10.m11170d(r11, r0)
            goto L346
        L339:
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r10 = "Discarding data. Unrecognized parcel type."
            r0.m11169c(r10)
        L346:
            int r9 = r9 + 1
            goto L2ec
        L349:
            int r7 = r17 + 1
            r0 = r5
            r5 = 100
            r6 = 0
            goto L1c
        L351:
            return
    }

    /* renamed from: n */
    public final void m11427n(p249o7.C4957b r8) {
            r7 = this;
            r7.mo3183i()
            r7.m11419j()
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            o7.b3 r0 = r0.m3173r()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            byte[] r1 = r1.m3218b0(r8)
            int r2 = r1.length
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r2 <= r3) goto L30
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5673g
            java.lang.String r1 = "Conditional user property too long for local database. Sending directly to service"
            r0.m11169c(r1)
            r0 = 0
            r4 = 0
            goto L36
        L30:
            r2 = 2
            boolean r0 = r0.m11109p(r2, r1)
            r4 = r0
        L36:
            o7.b r5 = new o7.b
            r5.<init>(r8)
            r0 = 1
            o7.u6 r3 = r7.m11431r(r0)
            j6.g r0 = new j6.g
            r1 = r0
            r2 = r7
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.m11434u(r0)
            return
    }

    /* renamed from: o */
    public final boolean m11428o() {
            r1 = this;
            r1.mo3183i()
            r1.m11419j()
            o7.z2 r0 = r1.f20135d
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* renamed from: p */
    public final boolean m11429p() {
            r4 = this;
            r4.mo3183i()
            r4.m11419j()
            boolean r0 = r4.m11430q()
            r1 = 1
            if (r0 == 0) goto L29
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            int r0 = r0.m3226m0()
            o7.u2<java.lang.Integer> r2 = p249o7.C5120v2.f20109n0
            r3 = 0
            java.lang.Object r2 = r2.m11421a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r0 < r2) goto L27
            return r1
        L27:
            r0 = 0
            return r0
        L29:
            return r1
    }

    /* renamed from: q */
    public final boolean m11430q() {
            r7 = this;
            r7.mo3183i()
            r7.m11419j()
            java.lang.Boolean r0 = r7.f20136e
            if (r0 != 0) goto L136
            r7.mo3183i()
            r7.m11419j()
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            r0.mo3183i()
            android.content.SharedPreferences r1 = r0.m3147p()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L28
            r0 = 0
            goto L34
        L28:
            android.content.SharedPreferences r0 = r0.m3147p()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L34:
            r1 = 1
            if (r0 == 0) goto L3f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L3f
            goto L130
        L3f:
            com.google.android.gms.measurement.internal.d r4 = r7.f5736a
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.measurement.internal.d r4 = r7.f5736a
            com.google.android.gms.measurement.internal.a r4 = r4.m3172q()
            r4.m11419j()
            int r4 = r4.f5665j
            if (r4 != r1) goto L53
            goto Lfb
        L53:
            com.google.android.gms.measurement.internal.d r4 = r7.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5680n
            java.lang.String r5 = "Checking service availability"
            r4.m11169c(r5)
            com.google.android.gms.measurement.internal.d r4 = r7.f5736a
            com.google.android.gms.measurement.internal.f r4 = r4.m3158A()
            java.util.Objects.requireNonNull(r4)
            k6.f r5 = p184k6.C3703f.f16409b
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            android.content.Context r4 = r4.f5710a
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r5.mo8164b(r4, r6)
            if (r4 == 0) goto Lee
            if (r4 == r1) goto Le0
            r5 = 2
            if (r4 == r5) goto Lbf
            r0 = 3
            if (r4 == r0) goto Lb0
            r0 = 9
            if (r4 == r0) goto La5
            r0 = 18
            if (r4 == r0) goto L9a
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.m11170d(r4, r1)
            goto Lbd
        L9a:
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.String r3 = "Service updating"
            goto Lf8
        La5:
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.String r1 = "Service invalid"
            goto Lba
        Lb0:
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.String r1 = "Service disabled"
        Lba:
            r0.m11169c(r1)
        Lbd:
            r1 = 0
            goto Ldd
        Lbf:
            com.google.android.gms.measurement.internal.d r4 = r7.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5679m
            java.lang.String r5 = "Service container out of date"
            r4.m11169c(r5)
            com.google.android.gms.measurement.internal.d r4 = r7.f5736a
            com.google.android.gms.measurement.internal.f r4 = r4.m3158A()
            int r4 = r4.m3226m0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto Ldb
            goto Lfc
        Ldb:
            if (r0 != 0) goto Lbd
        Ldd:
            r3 = r1
            r1 = 0
            goto Lfc
        Le0:
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r4 = "Service missing"
            r0.m11169c(r4)
            goto Lfc
        Lee:
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r3 = "Service available"
        Lf8:
            r0.m11169c(r3)
        Lfb:
            r3 = 1
        Lfc:
            if (r3 != 0) goto L116
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            o7.f r0 = r0.f5716g
            boolean r0 = r0.m11166z()
            if (r0 == 0) goto L116
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.m11169c(r1)
            goto L12f
        L116:
            if (r1 == 0) goto L12f
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            r0.mo3183i()
            android.content.SharedPreferences r0 = r0.m3147p()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L12f:
            r1 = r3
        L130:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.f20136e = r0
        L136:
            java.lang.Boolean r0 = r7.f20136e
            boolean r0 = r0.booleanValue()
            return r0
    }

    /* renamed from: r */
    public final p249o7.C5116u6 m11431r(boolean r37) {
            r36 = this;
            r1 = r36
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            com.google.android.gms.measurement.internal.a r2 = r0.m3172q()
            r3 = 0
            r5 = 1
            r0 = 0
            if (r37 == 0) goto Lc9
            com.google.android.gms.measurement.internal.d r6 = r1.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            com.google.android.gms.measurement.internal.d r7 = r6.f5736a
            com.google.android.gms.measurement.internal.c r7 = r7.m3175t()
            o7.q3 r7 = r7.f5683d
            if (r7 != 0) goto L25
            goto Lc9
        L25:
            com.google.android.gms.measurement.internal.d r6 = r6.f5736a
            com.google.android.gms.measurement.internal.c r6 = r6.m3175t()
            o7.q3 r6 = r6.f5683d
            com.google.android.gms.measurement.internal.c r7 = r6.f19962e
            r7.mo3183i()
            com.google.android.gms.measurement.internal.c r7 = r6.f19962e
            r7.mo3183i()
            com.google.android.gms.measurement.internal.c r7 = r6.f19962e
            android.content.SharedPreferences r7 = r7.m3147p()
            java.lang.String r8 = r6.f19958a
            long r7 = r7.getLong(r8, r3)
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L4c
            r6.m11413a()
            r7 = r3
            goto L60
        L4c:
            com.google.android.gms.measurement.internal.c r9 = r6.f19962e
            com.google.android.gms.measurement.internal.d r9 = r9.f5736a
            u6.c r9 = r9.f5723n
            u6.d r9 = (p353u6.C6341d) r9
            java.util.Objects.requireNonNull(r9)
            long r9 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r9
            long r7 = java.lang.Math.abs(r7)
        L60:
            long r9 = r6.f19961d
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L67
            goto L6f
        L67:
            long r9 = r9 + r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L71
            r6.m11413a()
        L6f:
            r6 = r0
            goto L9f
        L71:
            com.google.android.gms.measurement.internal.c r7 = r6.f19962e
            android.content.SharedPreferences r7 = r7.m3147p()
            java.lang.String r8 = r6.f19960c
            java.lang.String r7 = r7.getString(r8, r0)
            com.google.android.gms.measurement.internal.c r8 = r6.f19962e
            android.content.SharedPreferences r8 = r8.m3147p()
            java.lang.String r9 = r6.f19959b
            long r8 = r8.getLong(r9, r3)
            r6.m11413a()
            if (r7 == 0) goto L9d
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 > 0) goto L93
            goto L9d
        L93:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.<init>(r7, r8)
            goto L9f
        L9d:
            android.util.Pair<java.lang.String, java.lang.Long> r6 = com.google.android.gms.measurement.internal.C1112c.f5681w
        L9f:
            if (r6 == 0) goto Lc9
            android.util.Pair<java.lang.String, java.lang.Long> r7 = com.google.android.gms.measurement.internal.C1112c.f5681w
            if (r6 != r7) goto La6
            goto Lc9
        La6:
            java.lang.Object r0 = r6.second
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r6 = r6.first
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r0.length()
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + r5
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = ":"
            java.lang.String r0 = p083f.C1932s.m4774a(r9, r0, r7, r6)
        Lc9:
            r17 = r0
            r2.mo3183i()
            o7.u6 r35 = new o7.u6
            java.lang.String r7 = r2.m3132n()
            java.lang.String r8 = r2.m3133o()
            r2.m11419j()
            java.lang.String r9 = r2.f5659d
            r2.m11419j()
            int r0 = r2.f5660e
            long r10 = (long) r0
            r2.m11419j()
            java.lang.String r0 = r2.f5661f
            java.lang.String r6 = "null reference"
            java.util.Objects.requireNonNull(r0, r6)
            java.lang.String r12 = r2.f5661f
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            o7.f r0 = r0.f5716g
            r0.m11157q()
            r2.m11419j()
            r2.mo3183i()
            long r13 = r2.f5662g
            r0 = 0
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 != 0) goto L187
            com.google.android.gms.measurement.internal.d r3 = r2.f5736a
            com.google.android.gms.measurement.internal.f r3 = r3.m3158A()
            com.google.android.gms.measurement.internal.d r4 = r2.f5736a
            android.content.Context r4 = r4.f5710a
            java.lang.String r13 = r4.getPackageName()
            r3.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r13)
            android.content.pm.PackageManager r14 = r4.getPackageManager()
            java.lang.String r15 = "MD5"
            java.security.MessageDigest r15 = com.google.android.gms.measurement.internal.C1115f.m3193s(r15)
            r18 = -1
            if (r15 != 0) goto L133
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r3 = "Could not get MD5 instance"
            r0.m11169c(r3)
            goto L181
        L133:
            if (r14 == 0) goto L17f
            boolean r13 = r3.m3216U(r4, r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            if (r13 != 0) goto L17f
            w6.b r4 = p388w6.C6816c.m13887a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            com.google.android.gms.measurement.internal.d r13 = r3.f5736a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            android.content.Context r13 = r13.f5710a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            java.lang.String r13 = r13.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            r14 = 64
            android.content.pm.PackageInfo r4 = r4.m13885b(r13, r14)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            android.content.pm.Signature[] r4 = r4.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            if (r4 == 0) goto L163
            int r13 = r4.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            if (r13 <= 0) goto L163
            r0 = r4[r0]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            byte[] r0 = r0.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            byte[] r0 = r15.digest(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            long r18 = com.google.android.gms.measurement.internal.C1115f.m3192n0(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            goto L181
        L163:
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            o7.f3 r0 = r0.f5675i     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            java.lang.String r4 = "Could not get signatures"
            r0.m11169c(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L171
            goto L181
        L171:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5672f
            java.lang.String r4 = "Package name not found"
            r3.m11170d(r4, r0)
        L17f:
            r18 = 0
        L181:
            r3 = r18
            r2.f5662g = r3
            r15 = r3
            goto L188
        L187:
            r15 = r13
        L188:
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            boolean r18 = r0.m3165g()
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            boolean r0 = r0.f5694o
            r19 = r0 ^ 1
            r2.mo3183i()
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            boolean r0 = r0.m3165g()
            if (r0 != 0) goto L1a5
            goto L21f
        L1a5:
            k7.ub r0 = p185k7.C4006ub.f16899Z
            k7.vb r0 = r0.m9065b()
            r0.mo9075a()
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            o7.f r0 = r0.f5716g
            o7.u2<java.lang.Boolean> r3 = p249o7.C5120v2.f20093f0
            r4 = 0
            boolean r0 = r0.m11162v(r4, r3)
            if (r0 == 0) goto L1c9
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r3 = "Disabled IID for tests."
        L1c5:
            r0.m11169c(r3)
            goto L21f
        L1c9:
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a     // Catch: java.lang.ClassNotFoundException -> L21f
            android.content.Context r0 = r0.f5710a     // Catch: java.lang.ClassNotFoundException -> L21f
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L21f
            java.lang.String r3 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r3)     // Catch: java.lang.ClassNotFoundException -> L21f
            if (r0 != 0) goto L1da
            goto L21f
        L1da:
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L214
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r13 = 0
            r3[r13] = r4     // Catch: java.lang.Exception -> L214
            java.lang.String r4 = "getInstance"
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r4, r3)     // Catch: java.lang.Exception -> L214
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L214
            com.google.android.gms.measurement.internal.d r5 = r2.f5736a     // Catch: java.lang.Exception -> L214
            android.content.Context r5 = r5.f5710a     // Catch: java.lang.Exception -> L214
            r13 = 0
            r4[r13] = r5     // Catch: java.lang.Exception -> L214
            r5 = 0
            java.lang.Object r3 = r3.invoke(r5, r4)     // Catch: java.lang.Exception -> L214
            if (r3 != 0) goto L1f8
            goto L21f
        L1f8:
            java.lang.String r4 = "getFirebaseInstanceId"
            java.lang.Class[] r5 = new java.lang.Class[r13]     // Catch: java.lang.Exception -> L209
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L209
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch: java.lang.Exception -> L209
            java.lang.Object r0 = r0.invoke(r3, r4)     // Catch: java.lang.Exception -> L209
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L209
            goto L220
        L209:
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5677k
            java.lang.String r3 = "Failed to retrieve Firebase Instance Id"
            goto L1c5
        L214:
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5676j
            java.lang.String r3 = "Failed to obtain Firebase Analytics instance"
            goto L1c5
        L21f:
            r0 = 0
        L220:
            r20 = r0
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.c r3 = r0.m3175t()
            o7.p3 r3 = r3.f5684e
            long r3 = r3.m11410a()
            r13 = 0
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 != 0) goto L237
            long r3 = r0.f5709G
            goto L23d
        L237:
            long r13 = r0.f5709G
            long r3 = java.lang.Math.min(r13, r3)
        L23d:
            r23 = r3
            r2.m11419j()
            int r0 = r2.f5665j
            com.google.android.gms.measurement.internal.d r3 = r2.f5736a
            o7.f r3 = r3.f5716g
            boolean r26 = r3.m11161u()
            com.google.android.gms.measurement.internal.d r3 = r2.f5736a
            com.google.android.gms.measurement.internal.c r3 = r3.m3175t()
            r3.mo3183i()
            android.content.SharedPreferences r3 = r3.m3147p()
            java.lang.String r4 = "deferred_analytics_collection"
            r5 = 0
            boolean r27 = r3.getBoolean(r4, r5)
            r2.m11419j()
            java.lang.String r3 = r2.f5667l
            com.google.android.gms.measurement.internal.d r4 = r2.f5736a
            o7.f r4 = r4.f5716g
            java.lang.String r5 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r4 = r4.m11160t(r5)
            if (r4 != 0) goto L273
            r4 = 0
            goto L27d
        L273:
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L27d:
            r29 = r4
            long r4 = r2.f5663h
            java.util.List<java.lang.String> r13 = r2.f5664i
            p185k7.C3847ia.m8706c()
            com.google.android.gms.measurement.internal.d r14 = r2.f5736a
            o7.f r14 = r14.f5716g
            o7.u2<java.lang.Boolean> r1 = p249o7.C5120v2.f20089d0
            r21 = r13
            r13 = 0
            boolean r1 = r14.m11162v(r13, r1)
            if (r1 == 0) goto L2a2
            r2.m11419j()
            java.lang.String r1 = r2.f5668m
            java.util.Objects.requireNonNull(r1, r6)
            java.lang.String r1 = r2.f5668m
            r33 = r1
            goto L2a4
        L2a2:
            r33 = r13
        L2a4:
            r13 = 43042(0xa822, double:2.12656E-319)
            r1 = r21
            r21 = 0
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.c r2 = r2.m3175t()
            o7.g r2 = r2.m3148q()
            java.lang.String r34 = r2.m11188e()
            r6 = r35
            r25 = r0
            r28 = r3
            r30 = r4
            r32 = r1
            r6.<init>(r7, r8, r9, r10, r12, r13, r15, r17, r18, r19, r20, r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34)
            return r35
    }

    /* renamed from: s */
    public final void m11432s() {
            r4 = this;
            r4.mo3183i()
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.util.List<java.lang.Runnable> r1 = r4.f20139h
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Processing queued up service tasks"
            r0.m11170d(r2, r1)
            java.util.List<java.lang.Runnable> r0 = r4.f20139h
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()     // Catch: java.lang.RuntimeException -> L30
            goto L20
        L30:
            r1 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r4.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r3 = "Task exception while flushing queue"
            r2.m11170d(r3, r1)
            goto L20
        L3f:
            java.util.List<java.lang.Runnable> r0 = r4.f20139h
            r0.clear()
            o7.k r0 = r4.f20140i
            r0.m11284a()
            return
    }

    /* renamed from: t */
    public final void m11433t() {
            r3 = this;
            r3.mo3183i()
            e6.p r0 = r3.f20138g
            java.lang.Object r1 = r0.f7463Y
            u6.c r1 = (p353u6.InterfaceC6340c) r1
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.f7464Z = r1
            o7.k r0 = r3.f20137f
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a
            java.util.Objects.requireNonNull(r1)
            o7.u2<java.lang.Long> r1 = p249o7.C5120v2.f20065J
            r2 = 0
            java.lang.Object r1 = r1.m11421a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.m11285c(r1)
            return
    }

    /* renamed from: u */
    public final void m11434u(java.lang.Runnable r6) {
            r5 = this;
            r5.mo3183i()
            boolean r0 = r5.m11428o()
            if (r0 == 0) goto Ld
            r6.run()
            return
        Ld:
            java.util.List<java.lang.Runnable> r0 = r5.f20139h
            int r0 = r0.size()
            com.google.android.gms.measurement.internal.d r1 = r5.f5736a
            java.util.Objects.requireNonNull(r1)
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L2d
            com.google.android.gms.measurement.internal.d r6 = r5.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5672f
            java.lang.String r0 = "Discarding data. Max runnable queue size reached"
            r6.m11169c(r0)
            return
        L2d:
            java.util.List<java.lang.Runnable> r0 = r5.f20139h
            r0.add(r6)
            o7.k r6 = r5.f20140i
            r0 = 60000(0xea60, double:2.9644E-319)
            r6.m11285c(r0)
            r5.m11436x()
            return
    }

    /* renamed from: v */
    public final boolean m11435v() {
            r1 = this;
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            java.util.Objects.requireNonNull(r0)
            r0 = 1
            return r0
    }

    /* renamed from: x */
    public final void m11436x() {
            r7 = this;
            r7.mo3183i()
            r7.m11419j()
            boolean r0 = r7.m11428o()
            if (r0 == 0) goto Ld
            return
        Ld:
            boolean r0 = r7.m11430q()
            r1 = 1
            if (r0 != 0) goto Lb4
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            o7.f r0 = r0.f5716g
            boolean r0 = r0.m11166z()
            if (r0 != 0) goto Lb3
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            android.content.Context r0 = r0.f5710a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            com.google.android.gms.measurement.internal.d r3 = r7.f5736a
            android.content.Context r3 = r3.f5710a
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r2 = r2.setClassName(r3, r4)
            r3 = 65536(0x10000, float:9.1835E-41)
            java.util.List r0 = r0.queryIntentServices(r2, r3)
            if (r0 == 0) goto La6
            int r0 = r0.size()
            if (r0 <= 0) goto La6
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.android.gms.measurement.START"
            r0.<init>(r2)
            android.content.ComponentName r2 = new android.content.ComponentName
            com.google.android.gms.measurement.internal.d r3 = r7.f5736a
            android.content.Context r4 = r3.f5710a
            java.util.Objects.requireNonNull(r3)
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementService"
            r2.<init>(r4, r3)
            r0.setComponent(r2)
            o7.u5 r2 = r7.f20134c
            o7.v5 r3 = r2.f20030a0
            r3.mo3183i()
            o7.v5 r3 = r2.f20030a0
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            android.content.Context r3 = r3.f5710a
            t6.a r4 = p338t6.C6181a.m12748b()
            monitor-enter(r2)
            boolean r5 = r2.f20028Y     // Catch: java.lang.Throwable -> La3
            if (r5 == 0) goto L87
            o7.v5 r0 = r2.f20030a0     // Catch: java.lang.Throwable -> La3
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.Throwable -> La3
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> La3
            o7.f3 r0 = r0.f5680n     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = "Connection attempt already in progress"
            r0.m11169c(r1)     // Catch: java.lang.Throwable -> La3
        L85:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            goto La2
        L87:
            o7.v5 r5 = r2.f20030a0     // Catch: java.lang.Throwable -> La3
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a     // Catch: java.lang.Throwable -> La3
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> La3
            o7.f3 r5 = r5.f5680n     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "Using local app measurement service"
            r5.m11169c(r6)     // Catch: java.lang.Throwable -> La3
            r2.f20028Y = r1     // Catch: java.lang.Throwable -> La3
            o7.v5 r1 = r2.f20030a0     // Catch: java.lang.Throwable -> La3
            o7.u5 r1 = r1.f20134c     // Catch: java.lang.Throwable -> La3
            r5 = 129(0x81, float:1.81E-43)
            r4.m12749a(r3, r0, r1, r5)     // Catch: java.lang.Throwable -> La3
            goto L85
        La2:
            return
        La3:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            throw r0
        La6:
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.m11169c(r1)
        Lb3:
            return
        Lb4:
            o7.u5 r0 = r7.f20134c
            o7.v5 r2 = r0.f20030a0
            r2.mo3183i()
            o7.v5 r2 = r0.f20030a0
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            android.content.Context r2 = r2.f5710a
            monitor-enter(r0)
            boolean r3 = r0.f20028Y     // Catch: java.lang.Throwable -> L125
            if (r3 == 0) goto Ld7
            o7.v5 r1 = r0.f20030a0     // Catch: java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a     // Catch: java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> L125
            o7.f3 r1 = r1.f5680n     // Catch: java.lang.Throwable -> L125
            java.lang.String r2 = "Connection attempt already in progress"
            r1.m11169c(r2)     // Catch: java.lang.Throwable -> L125
        Ld5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L125
            goto L124
        Ld7:
            o7.d3 r3 = r0.f20029Z     // Catch: java.lang.Throwable -> L125
            if (r3 == 0) goto Lfb
            o7.d3 r3 = r0.f20029Z     // Catch: java.lang.Throwable -> L125
            boolean r3 = r3.m11044i()     // Catch: java.lang.Throwable -> L125
            if (r3 != 0) goto Leb
            o7.d3 r3 = r0.f20029Z     // Catch: java.lang.Throwable -> L125
            boolean r3 = r3.m11040a()     // Catch: java.lang.Throwable -> L125
            if (r3 == 0) goto Lfb
        Leb:
            o7.v5 r1 = r0.f20030a0     // Catch: java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a     // Catch: java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> L125
            o7.f3 r1 = r1.f5680n     // Catch: java.lang.Throwable -> L125
            java.lang.String r2 = "Already awaiting connection attempt"
            r1.m11169c(r2)     // Catch: java.lang.Throwable -> L125
            goto Ld5
        Lfb:
            o7.d3 r3 = new o7.d3     // Catch: java.lang.Throwable -> L125
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L125
            r3.<init>(r2, r4, r0, r0)     // Catch: java.lang.Throwable -> L125
            r0.f20029Z = r3     // Catch: java.lang.Throwable -> L125
            o7.v5 r2 = r0.f20030a0     // Catch: java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L125
            o7.f3 r2 = r2.f5680n     // Catch: java.lang.Throwable -> L125
            java.lang.String r3 = "Connecting to remote service"
            r2.m11169c(r3)     // Catch: java.lang.Throwable -> L125
            r0.f20028Y = r1     // Catch: java.lang.Throwable -> L125
            o7.d3 r1 = r0.f20029Z     // Catch: java.lang.Throwable -> L125
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L125
            o7.d3 r1 = r0.f20029Z     // Catch: java.lang.Throwable -> L125
            r1.m11050r()     // Catch: java.lang.Throwable -> L125
            goto Ld5
        L124:
            return
        L125:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L125
            throw r1
    }

    /* renamed from: y */
    public final void m11437y() {
            r4 = this;
            r4.mo3183i()
            r4.m11419j()
            o7.u5 r0 = r4.f20134c
            o7.d3 r1 = r0.f20029Z
            if (r1 == 0) goto L21
            o7.d3 r1 = r0.f20029Z
            boolean r1 = r1.m11040a()
            if (r1 != 0) goto L1c
            o7.d3 r1 = r0.f20029Z
            boolean r1 = r1.m11044i()
            if (r1 == 0) goto L21
        L1c:
            o7.d3 r1 = r0.f20029Z
            r1.mo6389n()
        L21:
            r1 = 0
            r0.f20029Z = r1
            t6.a r0 = p338t6.C6181a.m12748b()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.measurement.internal.d r2 = r4.f5736a     // Catch: java.lang.Throwable -> L31
            android.content.Context r2 = r2.f5710a     // Catch: java.lang.Throwable -> L31
            o7.u5 r3 = r4.f20134c     // Catch: java.lang.Throwable -> L31
            r0.m12750c(r2, r3)     // Catch: java.lang.Throwable -> L31
        L31:
            r4.f20135d = r1
            return
    }

    /* renamed from: z */
    public final void m11438z(java.util.concurrent.atomic.AtomicReference<java.lang.String> r3) {
            r2 = this;
            r2.mo3183i()
            r2.m11419j()
            r0 = 0
            o7.u6 r0 = r2.m11431r(r0)
            c6.h0 r1 = new c6.h0
            r1.<init>(r2, r3, r0)
            r2.m11434u(r1)
            return
    }
}

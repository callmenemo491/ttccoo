package p249o7;

/* renamed from: o7.h3 */
/* loaded from: classes.dex */
public final class C5009h3 {

    /* renamed from: a */
    public final /* synthetic */ int f19719a;

    /* renamed from: b */
    public java.lang.Object f19720b;

    /* renamed from: c */
    public java.lang.Object f19721c;

    /* renamed from: d */
    public long f19722d;

    /* renamed from: e */
    public final java.lang.Object f19723e;

    public C5009h3(java.lang.String r2, java.lang.String r3, android.os.Bundle r4, long r5) {
            r1 = this;
            r0 = 0
            r1.f19719a = r0
            r1.<init>()
            r1.f19720b = r2
            r1.f19721c = r3
            r1.f19723e = r4
            r1.f19722d = r5
            return
    }

    public /* synthetic */ C5009h3(p249o7.C4956a7 r2) {
            r1 = this;
            r0 = 1
            r1.f19719a = r0
            r1.f19723e = r2
            r1.<init>()
            return
    }

    /* renamed from: c */
    public static p249o7.C5009h3 m11198c(p249o7.C5077q r7) {
            o7.h3 r6 = new o7.h3
            java.lang.String r1 = r7.f19951Y
            java.lang.String r2 = r7.f19953a0
            o7.o r0 = r7.f19952Z
            android.os.Bundle r3 = r0.m11371X()
            long r4 = r7.f19954b0
            r0 = r6
            r0.<init>(r1, r2, r3, r4)
            return r6
    }

    /* renamed from: a */
    public p185k7.C3997u2 m11199a(java.lang.String r18, p185k7.C3997u2 r19) {
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.m9052z()
            java.util.List r9 = r19.m9042A()
            java.lang.Object r2 = r1.f19723e
            o7.a7 r2 = (p249o7.C4956a7) r2
            o7.m6 r2 = r2.f19756b
            o7.o6 r2 = r2.f19866g
            p249o7.C5052m6.m11327I(r2)
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = p249o7.C5068o6.m11388p(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            r10 = 0
            if (r4 == 0) goto L24d
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L1ff
            java.lang.Object r0 = r1.f19723e
            o7.a7 r0 = (p249o7.C4956a7) r0
            o7.m6 r0 = r0.f19756b
            o7.o6 r0 = r0.f19866g
            p249o7.C5052m6.m11327I(r0)
            java.lang.String r0 = "_en"
            java.lang.Object r0 = p249o7.C5068o6.m11388p(r8, r0)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r5 = 0
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r1.f19723e
            o7.a7 r0 = (p249o7.C4956a7) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5673g
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.m11170d(r2, r4)
            return r5
        L5b:
            java.lang.Object r0 = r1.f19720b
            k7.u2 r0 = (p185k7.C3997u2) r0
            r12 = 1
            if (r0 == 0) goto L78
            java.lang.Object r0 = r1.f19721c
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L78
            long r13 = r4.longValue()
            java.lang.Object r0 = r1.f19721c
            java.lang.Long r0 = (java.lang.Long) r0
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L135
        L78:
            java.lang.Object r0 = r1.f19723e
            o7.a7 r0 = (p249o7.C4956a7) r0
            o7.m6 r0 = r0.f19756b
            o7.j r13 = r0.f19862c
            p249o7.C5052m6.m11327I(r13)
            r13.mo3183i()
            r13.m11247j()
            android.database.sqlite.SQLiteDatabase r0 = r13.m11253D()     // Catch: java.lang.Throwable -> Lef android.database.sqlite.SQLiteException -> Lf3
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch: java.lang.Throwable -> Lef android.database.sqlite.SQLiteException -> Lf3
            r14[r10] = r3     // Catch: java.lang.Throwable -> Lef android.database.sqlite.SQLiteException -> Lf3
            java.lang.String r15 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Lef android.database.sqlite.SQLiteException -> Lf3
            r14[r12] = r15     // Catch: java.lang.Throwable -> Lef android.database.sqlite.SQLiteException -> Lf3
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch: java.lang.Throwable -> Lef android.database.sqlite.SQLiteException -> Lf3
            boolean r0 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            if (r0 != 0) goto Lb8
            com.google.android.gms.measurement.internal.d r0 = r13.f5736a     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            o7.f3 r0 = r0.f5680n     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            java.lang.String r15 = "Main event not found"
            r0.m11169c(r15)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            r14.close()
            r0 = r5
            goto L108
        Lb6:
            r0 = move-exception
            goto Lf5
        Lb8:
            byte[] r0 = r14.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            long r15 = r14.getLong(r12)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            k7.t2 r5 = p185k7.C3997u2.m9040w()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.io.IOException -> Ldc java.lang.Throwable -> L1f7
            k7.y4 r0 = p249o7.C5068o6.m11380D(r5, r0)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.io.IOException -> Ldc java.lang.Throwable -> L1f7
            k7.t2 r0 = (p185k7.C3984t2) r0     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.io.IOException -> Ldc java.lang.Throwable -> L1f7
            k7.d6 r0 = r0.m8201f()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.io.IOException -> Ldc java.lang.Throwable -> L1f7
            k7.u2 r0 = (p185k7.C3997u2) r0     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.io.IOException -> Ldc java.lang.Throwable -> L1f7
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            r14.close()
            goto L108
        Ldc:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r5 = r13.f5736a     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            o7.f3 r5 = r5.f5672f     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C1111b.m3134u(r18)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            r5.m11172f(r15, r10, r4, r0)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> L1f7
            goto L104
        Lef:
            r0 = move-exception
            r5 = 0
            goto L1f9
        Lf3:
            r0 = move-exception
            r14 = 0
        Lf5:
            com.google.android.gms.measurement.internal.d r5 = r13.f5736a     // Catch: java.lang.Throwable -> L1f7
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> L1f7
            o7.f3 r5 = r5.f5672f     // Catch: java.lang.Throwable -> L1f7
            java.lang.String r10 = "Error selecting main event"
            r5.m11170d(r10, r0)     // Catch: java.lang.Throwable -> L1f7
            if (r14 == 0) goto L107
        L104:
            r14.close()
        L107:
            r0 = 0
        L108:
            if (r0 == 0) goto L1e4
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L110
            goto L1e4
        L110:
            k7.u2 r5 = (p185k7.C3997u2) r5
            r1.f19720b = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r13 = r0.longValue()
            r1.f19722d = r13
            java.lang.Object r0 = r1.f19723e
            o7.a7 r0 = (p249o7.C4956a7) r0
            o7.m6 r0 = r0.f19756b
            o7.o6 r0 = r0.f19866g
            p249o7.C5052m6.m11327I(r0)
            java.lang.Object r0 = r1.f19720b
            k7.u2 r0 = (p185k7.C3997u2) r0
            java.lang.Object r0 = p249o7.C5068o6.m11388p(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f19721c = r0
        L135:
            long r13 = r1.f19722d
            r15 = -1
            long r13 = r13 + r15
            r1.f19722d = r13
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 > 0) goto L179
            java.lang.Object r0 = r1.f19723e
            o7.a7 r0 = (p249o7.C4956a7) r0
            o7.m6 r0 = r0.f19756b
            o7.j r2 = r0.f19862c
            p249o7.C5052m6.m11327I(r2)
            r2.mo3183i()
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.m11170d(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L16a
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch: android.database.sqlite.SQLiteException -> L16a
            r5 = 0
            r4[r5] = r3     // Catch: android.database.sqlite.SQLiteException -> L16a
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L16a
            goto L190
        L16a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r3 = "Error clearing complex main event"
            r2.m11170d(r3, r0)
            goto L190
        L179:
            java.lang.Object r0 = r1.f19723e
            o7.a7 r0 = (p249o7.C4956a7) r0
            o7.m6 r0 = r0.f19756b
            o7.j r2 = r0.f19862c
            p249o7.C5052m6.m11327I(r2)
            long r5 = r1.f19722d
            java.lang.Object r0 = r1.f19720b
            r7 = r0
            k7.u2 r7 = (p185k7.C3997u2) r7
            r3 = r18
            r2.m11278t(r3, r4, r5, r7)
        L190:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r2 = r1.f19720b
            k7.u2 r2 = (p185k7.C3997u2) r2
            java.util.List r2 = r2.m9042A()
            java.util.Iterator r2 = r2.iterator()
        L1a1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1c6
            java.lang.Object r3 = r2.next()
            k7.y2 r3 = (p185k7.C4049y2) r3
            java.lang.Object r4 = r1.f19723e
            o7.a7 r4 = (p249o7.C4956a7) r4
            o7.m6 r4 = r4.f19756b
            o7.o6 r4 = r4.f19866g
            p249o7.C5052m6.m11327I(r4)
            java.lang.String r4 = r3.m9148y()
            k7.y2 r4 = p249o7.C5068o6.m11387o(r8, r4)
            if (r4 != 0) goto L1a1
            r0.add(r3)
            goto L1a1
        L1c6:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L1d1
            r0.addAll(r9)
            r9 = r0
            goto L1e2
        L1d1:
            java.lang.Object r0 = r1.f19723e
            o7.a7 r0 = (p249o7.C4956a7) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5673g
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.m11170d(r2, r11)
        L1e2:
            r0 = r11
            goto L24d
        L1e4:
            java.lang.Object r0 = r1.f19723e
            o7.a7 r0 = (p249o7.C4956a7) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5673g
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.m11171e(r2, r11, r4)
            r2 = 0
            return r2
        L1f7:
            r0 = move-exception
            r5 = r14
        L1f9:
            if (r5 == 0) goto L1fe
            r5.close()
        L1fe:
            throw r0
        L1ff:
            r1.f19721c = r4
            r1.f19720b = r8
            java.lang.Object r2 = r1.f19723e
            o7.a7 r2 = (p249o7.C4956a7) r2
            o7.m6 r2 = r2.f19756b
            o7.o6 r2 = r2.f19866g
            p249o7.C5052m6.m11327I(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = p249o7.C5068o6.m11388p(r8, r5)
            if (r5 == 0) goto L21b
            r2 = r5
        L21b:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f19722d = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L239
            java.lang.Object r2 = r1.f19723e
            o7.a7 r2 = (p249o7.C4956a7) r2
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5673g
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.m11170d(r3, r0)
            goto L24d
        L239:
            java.lang.Object r2 = r1.f19723e
            o7.a7 r2 = (p249o7.C4956a7) r2
            o7.m6 r2 = r2.f19756b
            o7.j r2 = r2.f19862c
            p249o7.C5052m6.m11327I(r2)
            long r5 = r1.f19722d
            r3 = r18
            r7 = r19
            r2.m11278t(r3, r4, r5, r7)
        L24d:
            k7.a6 r2 = r19.m8501o()
            k7.t2 r2 = (p185k7.C3984t2) r2
            r2.m9010u(r0)
            boolean r0 = r2.f16454a0
            if (r0 == 0) goto L260
            r2.m8203j()
            r3 = 0
            r2.f16454a0 = r3
        L260:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r2.f16453Z
            k7.u2 r0 = (p185k7.C3997u2) r0
            p185k7.C3997u2.m9035E(r0)
            boolean r0 = r2.f16454a0
            if (r0 == 0) goto L271
            r2.m8203j()
            r3 = 0
            r2.f16454a0 = r3
        L271:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r2.f16453Z
            k7.u2 r0 = (p185k7.C3997u2) r0
            p185k7.C3997u2.m9034D(r0, r9)
            k7.d6 r0 = r2.m8201f()
            k7.u2 r0 = (p185k7.C3997u2) r0
            return r0
    }

    /* renamed from: b */
    public p249o7.C5077q m11200b() {
            r7 = this;
            o7.q r6 = new o7.q
            java.lang.Object r0 = r7.f19720b
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            o7.o r2 = new o7.o
            android.os.Bundle r0 = new android.os.Bundle
            java.lang.Object r3 = r7.f19723e
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.<init>(r3)
            r2.<init>(r0)
            java.lang.Object r0 = r7.f19721c
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            long r4 = r7.f19722d
            r0 = r6
            r0.<init>(r1, r2, r3, r4)
            return r6
    }

    public java.lang.String toString() {
            r7 = this;
            int r0 = r7.f19719a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r7.f19721c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r7.f19720b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.f19723e
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r5 = r2.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 21
            int r3 = r3 + r4
            int r3 = r3 + r5
            r6.<init>(r3)
            java.lang.String r3 = "origin="
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = ",name="
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = ",params="
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = r6.toString()
            return r0
    }
}

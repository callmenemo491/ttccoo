package p021b4;

/* renamed from: b4.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C0673j implements p021b4.C0674k.b, p371v5.C6564n.a, p327s7.InterfaceC5977a {

    /* renamed from: Y */
    public final /* synthetic */ long f3841Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f3842Z;

    public /* synthetic */ C0673j(long r1, p385w3.AbstractC6787i r3) {
            r0 = this;
            r0.<init>()
            r0.f3841Y = r1
            r0.f3842Z = r3
            return
    }

    public /* synthetic */ C0673j(com.google.firebase.remoteconfig.internal.C1247a r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f3842Z = r1
            r0.f3841Y = r2
            return
    }

    public /* synthetic */ C0673j(p107g4.InterfaceC2255q.a r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f3842Z = r1
            r0.f3841Y = r2
            return
    }

    @Override // p021b4.C0674k.b
    public java.lang.Object apply(java.lang.Object r7) {
            r6 = this;
            long r0 = r6.f3841Y
            java.lang.Object r2 = r6.f3842Z
            w3.i r2 = (p385w3.AbstractC6787i) r2
            android.database.sqlite.SQLiteDatabase r7 = (android.database.sqlite.SQLiteDatabase) r7
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "next_request_ms"
            r3.put(r1, r0)
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = r2.mo13798b()
            r4 = 0
            r0[r4] = r1
            t3.d r1 = r2.mo13800d()
            int r1 = p069e4.C1515a.m4103a(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4 = 1
            r0[r4] = r1
            java.lang.String r1 = "transport_contexts"
            java.lang.String r5 = "backend_name = ? and priority = ?"
            int r0 = r7.update(r1, r3, r5, r0)
            r5 = 0
            if (r0 >= r4) goto L57
            java.lang.String r0 = r2.mo13798b()
            java.lang.String r4 = "backend_name"
            r3.put(r4, r0)
            t3.d r0 = r2.mo13800d()
            int r0 = p069e4.C1515a.m4103a(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "priority"
            r3.put(r2, r0)
            r7.insert(r1, r5, r3)
        L57:
            return r5
    }

    @Override // p371v5.C6564n.a
    /* renamed from: b */
    public void mo24b(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.f3842Z
            g4.q$a r0 = (p107g4.InterfaceC2255q.a) r0
            g4.q r2 = (p107g4.InterfaceC2255q) r2
            r2.m5919q()
            return
    }

    @Override // p327s7.InterfaceC5977a
    /* renamed from: g */
    public java.lang.Object mo816g(p327s7.AbstractC5985i r12) {
            r11 = this;
            java.lang.Object r0 = r11.f3842Z
            com.google.firebase.remoteconfig.internal.a r0 = (com.google.firebase.remoteconfig.internal.C1247a) r0
            long r1 = r11.f3841Y
            int[] r3 = com.google.firebase.remoteconfig.internal.C1247a.f6637j
            java.util.Objects.requireNonNull(r0)
            java.util.Date r3 = new java.util.Date
            long r4 = java.lang.System.currentTimeMillis()
            r3.<init>(r4)
            boolean r12 = r12.mo12455m()
            r4 = 2
            r5 = 0
            r6 = 0
            if (r12 == 0) goto L5b
            com.google.firebase.remoteconfig.internal.b r12 = r0.f6644g
            java.util.Objects.requireNonNull(r12)
            java.util.Date r7 = new java.util.Date
            android.content.SharedPreferences r12 = r12.f6651a
            r8 = -1
            java.lang.String r10 = "last_fetch_time_in_millis"
            long r8 = r12.getLong(r10, r8)
            r7.<init>(r8)
            java.util.Date r12 = com.google.firebase.remoteconfig.internal.C1248b.f6649d
            boolean r12 = r7.equals(r12)
            if (r12 == 0) goto L3b
            r12 = 0
            goto L4f
        L3b:
            java.util.Date r12 = new java.util.Date
            long r7 = r7.getTime()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r9.toMillis(r1)
            long r1 = r1 + r7
            r12.<init>(r1)
            boolean r12 = r3.before(r12)
        L4f:
            if (r12 == 0) goto L5b
            com.google.firebase.remoteconfig.internal.a$a r12 = new com.google.firebase.remoteconfig.internal.a$a
            r12.<init>(r3, r4, r5, r5)
            s7.i r12 = p327s7.C5988l.m12464e(r12)
            goto Lc4
        L5b:
            com.google.firebase.remoteconfig.internal.b r12 = r0.f6644g
            com.google.firebase.remoteconfig.internal.b$a r12 = r12.m3680a()
            java.util.Date r12 = r12.f6655b
            boolean r1 = r3.before(r12)
            if (r1 == 0) goto L6a
            r5 = r12
        L6a:
            r12 = 1
            if (r5 == 0) goto L98
            gb.f r1 = new gb.f
            long r7 = r5.getTime()
            long r9 = r3.getTime()
            long r7 = r7 - r9
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r7 = r2.toSeconds(r7)
            java.lang.String r2 = android.text.format.DateUtils.formatElapsedTime(r7)
            r12[r6] = r2
            java.lang.String r2 = "Fetch is throttled. Please wait before calling fetch again: %s"
            java.lang.String r12 = java.lang.String.format(r2, r12)
            long r4 = r5.getTime()
            r1.<init>(r12, r4)
            s7.i r12 = p327s7.C5988l.m12463d(r1)
            goto Lb9
        L98:
            xa.d r1 = r0.f6638a
            s7.i r1 = r1.mo14165r()
            xa.d r2 = r0.f6638a
            s7.i r2 = r2.mo14154a(r6)
            s7.i[] r4 = new p327s7.AbstractC5985i[r4]
            r4[r6] = r1
            r4[r12] = r2
            s7.i r12 = p327s7.C5988l.m12466g(r4)
            java.util.concurrent.Executor r4 = r0.f6640c
            hb.e r5 = new hb.e
            r5.<init>(r0, r1, r2, r3)
            s7.i r12 = r12.mo12449g(r4, r5)
        Lb9:
            java.util.concurrent.Executor r1 = r0.f6640c
            f1.g0 r2 = new f1.g0
            r2.<init>(r0, r3)
            s7.i r12 = r12.mo12449g(r1, r2)
        Lc4:
            return r12
    }
}

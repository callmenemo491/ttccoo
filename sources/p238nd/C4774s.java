package p238nd;

/* renamed from: nd.s */
/* loaded from: classes.dex */
public final /* synthetic */ class C4774s implements p105g2.C2222p.b {

    /* renamed from: a */
    public final /* synthetic */ int f19110a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f19111b;

    public /* synthetic */ C4774s(p060df.C1451g r2) {
            r1 = this;
            r0 = 3
            r1.f19110a = r0
            r1.<init>()
            r1.f19111b = r2
            return
    }

    public /* synthetic */ C4774s(p078ef.C1835f r2) {
            r1 = this;
            r0 = 4
            r1.f19110a = r0
            r1.<init>()
            r1.f19111b = r2
            return
    }

    public /* synthetic */ C4774s(p099ff.C2161g r2) {
            r1 = this;
            r0 = 5
            r1.f19110a = r0
            r1.<init>()
            r1.f19111b = r2
            return
    }

    public /* synthetic */ C4774s(p238nd.C4778u r2) {
            r1 = this;
            r0 = 0
            r1.f19110a = r0
            r1.<init>()
            r1.f19111b = r2
            return
    }

    public /* synthetic */ C4774s(pe.C5491m r2) {
            r1 = this;
            r0 = 2
            r1.f19110a = r0
            r1.<init>()
            r1.f19111b = r2
            return
    }

    public /* synthetic */ C4774s(p395wd.C6843l r2) {
            r1 = this;
            r0 = 1
            r1.f19110a = r0
            r1.<init>()
            r1.f19111b = r2
            return
    }

    @Override // p105g2.C2222p.b
    /* renamed from: a */
    public final void mo117a(java.lang.Object r18) {
            r17 = this;
            r1 = r17
            int r0 = r1.f19110a
            r2 = 1
            r3 = 0
            r4 = 0
            r6 = 10
            java.lang.String r7 = "this$0"
            switch(r0) {
                case 0: goto L277;
                case 1: goto L1b8;
                case 2: goto L10f;
                case 3: goto L3f;
                case 4: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L2ef
        L11:
            java.lang.Object r0 = r1.f19111b
            ef.f r0 = (p078ef.C1835f) r0
            r2 = r18
            java.lang.String r2 = (java.lang.String) r2
            p214m2.C4339q.m9706k(r0, r7)
            ef.e r3 = new ef.e
            r3.<init>()
            java.lang.reflect.Type r3 = r3.f21382b
            jb.j r4 = new jb.j
            r4.<init>()
            java.lang.Object r2 = r4.m7929c(r2, r3)
            od.p r2 = (p255od.C5221p) r2
            androidx.lifecycle.d0<java.util.List<od.n>> r3 = r0.f7993f
            java.util.List r2 = r2.getData()
            r3.mo7l(r2)
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r0.f7992e
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.mo7l(r2)
            return
        L3f:
            java.lang.Object r0 = r1.f19111b
            df.g r0 = (p060df.C1451g) r0
            r2 = r18
            java.lang.String r2 = (java.lang.String) r2
            p214m2.C4339q.m9706k(r0, r7)
            df.f r3 = new df.f
            r3.<init>()
            java.lang.reflect.Type r3 = r3.f21382b
            jb.j r6 = new jb.j
            r6.<init>()
            java.lang.Object r2 = r6.m7929c(r2, r3)
            od.k r2 = (p255od.C5211k) r2
            java.util.List r2 = r2.getRows()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L69:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L8e
            java.lang.Object r6 = r2.next()
            r7 = r6
            od.j r7 = (p255od.C5209j) r7
            java.lang.String r7 = r7.getSchema()
            java.lang.Object r8 = r3.get(r7)
            if (r8 != 0) goto L88
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r3.put(r7, r8)
        L88:
            java.util.List r8 = (java.util.List) r8
            r8.add(r6)
            goto L69
        L8e:
            java.lang.String r2 = "locomotive"
            java.lang.Object r2 = r3.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L9a
            dh.k r2 = p062dh.C1475k.f7237Y
        L9a:
            java.lang.String r6 = "conductor"
            java.lang.Object r6 = r3.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto La6
            dh.k r6 = p062dh.C1475k.f7237Y
        La6:
            java.lang.String r7 = "railcar"
            java.lang.Object r3 = r3.get(r7)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto Lb2
            dh.k r3 = p062dh.C1475k.f7237Y
        Lb2:
            androidx.lifecycle.d0<df.a> r0 = r0.f7187e
            int r8 = r2.size()
            int r9 = r6.size()
            int r10 = r3.size()
            java.util.Iterator r2 = r2.iterator()
            r11 = r4
        Lc5:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto Ld7
            java.lang.Object r7 = r2.next()
            od.j r7 = (p255od.C5209j) r7
            double r13 = r7.getValueToClaim()
            double r11 = r11 + r13
            goto Lc5
        Ld7:
            java.util.Iterator r2 = r6.iterator()
            r13 = r4
        Ldc:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto Lee
            java.lang.Object r6 = r2.next()
            od.j r6 = (p255od.C5209j) r6
            double r6 = r6.getValueToClaim()
            double r13 = r13 + r6
            goto Ldc
        Lee:
            java.util.Iterator r2 = r3.iterator()
            r15 = r4
        Lf3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L105
            java.lang.Object r3 = r2.next()
            od.j r3 = (p255od.C5209j) r3
            double r3 = r3.getValueToClaim()
            double r15 = r15 + r3
            goto Lf3
        L105:
            df.a r2 = new df.a
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r13, r15)
            r0.mo7l(r2)
            return
        L10f:
            java.lang.Object r0 = r1.f19111b
            pe.m r0 = (pe.C5491m) r0
            r4 = r18
            java.lang.String r4 = (java.lang.String) r4
            p214m2.C4339q.m9706k(r0, r7)
            pe.l r5 = new pe.l
            r5.<init>()
            java.lang.reflect.Type r5 = r5.f21382b
            jb.j r7 = new jb.j
            r7.<init>()
            java.lang.Object r4 = r7.m7929c(r4, r5)
            qe.b r4 = (p293qe.C5629b) r4
            java.util.List r4 = r4.getRows()
            java.lang.Object r4 = p062dh.C1473i.m3996H(r4)
            qe.c r4 = (p293qe.C5630c) r4
            if (r4 == 0) goto L163
            java.util.List r4 = r4.getTemplate_ids()
            if (r4 == 0) goto L163
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = p062dh.C1469e.m3992D(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L14b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L164
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.add(r6)
            goto L14b
        L163:
            r5 = 0
        L164:
            if (r5 == 0) goto L16f
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L16d
            goto L16f
        L16d:
            r4 = 0
            goto L170
        L16f:
            r4 = 1
        L170:
            if (r4 == 0) goto L181
            androidx.lifecycle.d0<java.lang.Boolean> r2 = r0.f21425e
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.mo7l(r3)
            androidx.lifecycle.d0<java.util.List<qe.e>> r0 = r0.f21427g
            dh.k r2 = p062dh.C1475k.f7237Y
            r0.mo7l(r2)
            goto L1b7
        L181:
            h2.j r4 = new h2.j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            nd.v0 r7 = p238nd.C4781v0.f19121e
            java.lang.String r8 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r7, r8)
            java.lang.String r7 = r7.m10837a()
            r6.append(r7)
            java.lang.String r7 = "/v1/templates?collection_name=alien.worlds&limit=1000"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            pe.h r7 = new pe.h
            r7.<init>(r0, r5)
            pe.g r5 = new pe.g
            r5.<init>(r0, r2)
            r4.<init>(r3, r6, r7, r5)
            ch.d r0 = r0.f21424d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            r0.m5814a(r4)
        L1b7:
            return
        L1b8:
            java.lang.Object r0 = r1.f19111b
            wd.l r0 = (p395wd.C6843l) r0
            r3 = r18
            java.lang.String r3 = (java.lang.String) r3
            p214m2.C4339q.m9706k(r0, r7)
            wd.k r4 = new wd.k
            r4.<init>()
            java.lang.reflect.Type r4 = r4.f21382b
            jb.j r5 = new jb.j
            r5.<init>()
            java.lang.Object r3 = r5.m7929c(r3, r4)
            od.v r3 = (p255od.C5233v) r3
            androidx.lifecycle.d0<java.util.List<od.w>> r0 = r0.f26598e
            java.util.List r3 = r3.getData()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L1e4:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L20d
            java.lang.Object r5 = r3.next()
            r7 = r5
            od.u r7 = (p255od.C5231u) r7
            od.q0 r7 = r7.getTemplate()
            java.lang.String r7 = r7.getTemplate_id()
            java.lang.Object r8 = r4.get(r7)
            if (r8 != 0) goto L207
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r4.put(r7, r8)
        L207:
            java.util.List r8 = (java.util.List) r8
            r8.add(r5)
            goto L1e4
        L20d:
            java.util.List r3 = p062dh.C1480p.m4015t(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = p062dh.C1469e.m3992D(r3, r6)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L21e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L26a
            java.lang.Object r5 = r3.next()
            ch.e r5 = (ch.C0978e) r5
            B r7 = r5.f5051Z
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = p062dh.C1473i.m3995G(r7)
            od.u r7 = (p255od.C5231u) r7
            B r8 = r5.f5051Z
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            B r5 = r5.f5051Z
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = p062dh.C1469e.m3992D(r5, r6)
            r9.<init>(r10)
            java.util.Iterator r5 = r5.iterator()
        L24d:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L261
            java.lang.Object r10 = r5.next()
            od.u r10 = (p255od.C5231u) r10
            java.lang.String r10 = r10.getAsset_id()
            r9.add(r10)
            goto L24d
        L261:
            od.w r5 = new od.w
            r5.<init>(r7, r8, r2, r9)
            r4.add(r5)
            goto L21e
        L26a:
            wd.i r2 = new wd.i
            r2.<init>()
            java.util.List r2 = p062dh.C1473i.m4004P(r4, r2)
            r0.mo7l(r2)
            return
        L277:
            java.lang.Object r0 = r1.f19111b
            nd.u r0 = (p238nd.C4778u) r0
            r4 = r18
            java.lang.String r4 = (java.lang.String) r4
            p214m2.C4339q.m9706k(r0, r7)
            nd.v r5 = new nd.v     // Catch: java.lang.Throwable -> L2ea
            r5.<init>()     // Catch: java.lang.Throwable -> L2ea
            java.lang.reflect.Type r5 = r5.f21382b     // Catch: java.lang.Throwable -> L2ea
            jb.j r6 = new jb.j     // Catch: java.lang.Throwable -> L2ea
            r6.<init>()     // Catch: java.lang.Throwable -> L2ea
            java.lang.Object r4 = r6.m7929c(r4, r5)     // Catch: java.lang.Throwable -> L2ea
            od.g0 r4 = (p255od.C5204g0) r4     // Catch: java.lang.Throwable -> L2ea
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L2ea
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2ea
            hk.a$b r7 = hk.C3053a.f12282b     // Catch: java.lang.Throwable -> L2ea
            r7.mo7467a(r5, r6)     // Catch: java.lang.Throwable -> L2ea
            java.lang.Long r5 = r4.getUnixtime()     // Catch: java.lang.Throwable -> L2ea
            if (r5 == 0) goto L2e0
            rh.f r5 = new rh.f     // Catch: java.lang.Throwable -> L2ea
            r6 = 1624759215(0x60d7dbaf, float:1.24433745E20)
            long r8 = (long) r6     // Catch: java.lang.Throwable -> L2ea
            r10 = 9999999999(0x2540be3ff, double:4.940656458E-314)
            r5.<init>(r8, r10)     // Catch: java.lang.Throwable -> L2ea
            java.lang.Long r6 = r4.getUnixtime()     // Catch: java.lang.Throwable -> L2ea
            long r10 = r6.longValue()     // Catch: java.lang.Throwable -> L2ea
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 > 0) goto L2c6
            long r5 = r5.f22657Z     // Catch: java.lang.Throwable -> L2ea
            int r8 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r8 > 0) goto L2c6
            goto L2c7
        L2c6:
            r2 = 0
        L2c7:
            if (r2 == 0) goto L2e0
            java.lang.Long r2 = r4.getUnixtime()     // Catch: java.lang.Throwable -> L2ea
            long r4 = r2.longValue()     // Catch: java.lang.Throwable -> L2ea
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2ea
            r2 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r2     // Catch: java.lang.Throwable -> L2ea
            long r8 = r8 / r10
            long r4 = r4 - r8
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L2ea
            r0.f19118b = r2     // Catch: java.lang.Throwable -> L2ea
        L2e0:
            java.lang.String r0 = r0.m10834b()     // Catch: java.lang.Throwable -> L2ea
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2ea
            r7.mo7467a(r0, r2)     // Catch: java.lang.Throwable -> L2ea
            goto L2ee
        L2ea:
            r0 = move-exception
            p074e9.C1805a.m4520e(r0)
        L2ee:
            return
        L2ef:
            java.lang.Object r0 = r1.f19111b
            ff.g r0 = (p099ff.C2161g) r0
            r2 = r18
            java.lang.String r2 = (java.lang.String) r2
            p214m2.C4339q.m9706k(r0, r7)
            java.lang.String r3 = "response"
            p214m2.C4339q.m9705j(r2, r3)
            jb.j r3 = new jb.j
            r3.<init>()
            ff.e r6 = new ff.e
            r6.<init>()
            java.lang.reflect.Type r6 = r6.f21382b
            java.lang.Object r2 = r3.m7929c(r2, r6)
            md.m r2 = (md.C4565m) r2
            androidx.lifecycle.d0<java.lang.Double> r0 = r0.f9905e
            java.util.List r2 = r2.getRows()
            java.lang.Object r2 = p062dh.C1473i.m3996H(r2)
            md.n r2 = (md.C4567n) r2
            if (r2 == 0) goto L32b
            java.lang.String r2 = r2.getUnclaimed()
            if (r2 == 0) goto L32b
            java.lang.Double r2 = p362uh.C6462h.m13048E(r2)
            if (r2 != 0) goto L32f
        L32b:
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
        L32f:
            r0.mo7l(r2)
            return
    }
}

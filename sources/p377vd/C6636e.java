package p377vd;

/* renamed from: vd.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C6636e implements p105g2.C2222p.b {

    /* renamed from: a */
    public final /* synthetic */ int f25829a;

    /* renamed from: b */
    public final /* synthetic */ p377vd.C6648q f25830b;

    public /* synthetic */ C6636e(p377vd.C6648q r1, int r2) {
            r0 = this;
            r0.f25829a = r2
            r0.<init>()
            r0.f25830b = r1
            return
    }

    @Override // p105g2.C2222p.b
    /* renamed from: a */
    public final void mo117a(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f25829a
            r1 = 0
            java.lang.String r2 = "this$0"
            switch(r0) {
                case 0: goto La;
                default: goto L8;
            }
        L8:
            goto Lcd
        La:
            vd.q r0 = r9.f25830b
            java.lang.String r10 = (java.lang.String) r10
            p214m2.C4339q.m9706k(r0, r2)
            vd.p r2 = new vd.p
            r2.<init>()
            java.lang.reflect.Type r2 = r2.f21382b
            jb.j r3 = new jb.j
            r3.<init>()
            java.lang.Object r10 = r3.m7929c(r10, r2)
            md.l r10 = (md.C4563l) r10
            java.util.List r2 = r10.getRows()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3d
            androidx.lifecycle.d0<vd.t> r10 = r0.f25841g
            vd.t r6 = new vd.t
            r1 = 1
            r3 = 0
            r4 = 0
            r5 = 12
            java.lang.String r2 = "Claim"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            goto L93
        L3d:
            java.lang.String r2 = "UTC"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            java.util.Calendar r2 = java.util.Calendar.getInstance(r2)
            long r2 = r2.getTimeInMillis()
            r4 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r4
            long r2 = r2 / r4
            java.util.List r10 = r10.getRows()
            java.lang.Object r10 = p062dh.C1473i.m3995G(r10)
            md.k r10 = (md.C4561k) r10
            int r10 = r10.getLast_claim()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "currentTime: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = ", lastClaim: "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            hk.a$b r8 = hk.C3053a.f12282b
            r8.mo7467a(r6, r7)
            int r10 = r10 + 3600
            long r6 = (long) r10
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 >= 0) goto L97
            androidx.lifecycle.d0<vd.t> r10 = r0.f25841g
            vd.t r6 = new vd.t
            r1 = 1
            r3 = 0
            r4 = 0
            r5 = 12
            java.lang.String r2 = "Claim"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
        L93:
            r10.mo7l(r6)
            goto Lcc
        L97:
            long r6 = r6 - r2
            r10 = 2
            long r2 = (long) r10
            long r6 = r6 + r2
            long r6 = r6 * r4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "currentTime millisInFuture: "
            r10.append(r2)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r8.mo7467a(r10, r1)
            android.os.CountDownTimer r10 = r0.f25851q
            if (r10 == 0) goto Lba
            r10.cancel()
        Lba:
            r1 = 5000(0x1388, double:2.4703E-320)
            int r10 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r10 >= 0) goto Lc1
            r6 = r1
        Lc1:
            vd.s r10 = new vd.s
            r10.<init>(r0, r6)
            android.os.CountDownTimer r10 = r10.start()
            r0.f25851q = r10
        Lcc:
            return
        Lcd:
            vd.q r0 = r9.f25830b
            java.lang.String r10 = (java.lang.String) r10
            p214m2.C4339q.m9706k(r0, r2)
            vd.i r2 = new vd.i
            r2.<init>()
            java.lang.reflect.Type r2 = r2.f21382b
            jb.j r3 = new jb.j
            r3.<init>()
            java.lang.Object r10 = r3.m7929c(r10, r2)
            od.v r10 = (p255od.C5233v) r10
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r0.f25843i
            boolean r2 = r10.getSuccess()
            r3 = 1
            if (r2 == 0) goto Lfb
            java.util.List r10 = r10.getData()
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r3
            if (r10 == 0) goto Lfb
            r1 = 1
        Lfb:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            r0.mo7l(r10)
            return
    }
}

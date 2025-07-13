package p258og;

/* renamed from: og.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C5266c implements p105g2.C2222p.b {

    /* renamed from: a */
    public final /* synthetic */ int f20444a;

    /* renamed from: b */
    public final /* synthetic */ p258og.C5267d f20445b;

    public /* synthetic */ C5266c(p258og.C5267d r1, int r2) {
            r0 = this;
            r0.f20444a = r2
            r0.<init>()
            r0.f20445b = r1
            return
    }

    @Override // p105g2.C2222p.b
    /* renamed from: a */
    public final void mo117a(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f20444a
            java.lang.String r1 = "response"
            java.lang.String r2 = "this$0"
            switch(r0) {
                case 0: goto La;
                default: goto L9;
            }
        L9:
            goto L63
        La:
            og.d r0 = r4.f20445b
            java.lang.String r5 = (java.lang.String) r5
            p214m2.C4339q.m9706k(r0, r2)
            p214m2.C4339q.m9705j(r5, r1)
            jb.j r1 = new jb.j
            r1.<init>()
            og.g r2 = new og.g
            r2.<init>()
            java.lang.reflect.Type r2 = r2.f21382b
            java.lang.Object r5 = r1.m7929c(r5, r2)
            md.d1 r5 = (md.C4547d1) r5
            md.c1 r5 = r5.getPayload()
            if (r5 == 0) goto L62
            java.lang.String r5 = r5.getMinecraftUUID()
            if (r5 == 0) goto L62
            r0.f20457n = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "{\"minecraftUUID\": \""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "\" }"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = p362uh.C6459e.m13046C(r5)
            og.c r1 = new og.c
            r2 = 1
            r1.<init>(r0, r2)
            qf.d r2 = p294qf.C5636d.f21930g
            og.l r3 = new og.l
            r3.<init>(r5, r1, r2)
            g2.o r5 = r0.m11522g()
            r5.m5814a(r3)
        L62:
            return
        L63:
            og.d r0 = r4.f20445b
            java.lang.String r5 = (java.lang.String) r5
            p214m2.C4339q.m9706k(r0, r2)
            p214m2.C4339q.m9705j(r5, r1)
            jb.j r1 = new jb.j
            r1.<init>()
            og.k r2 = new og.k
            r2.<init>()
            java.lang.reflect.Type r2 = r2.f21382b
            java.lang.Object r5 = r1.m7929c(r5, r2)
            md.a1 r5 = (md.C4538a1) r5
            androidx.lifecycle.d0<java.lang.Double> r1 = r0.f20450g
            md.z0 r2 = r5.getPayload()
            r3 = 0
            if (r2 == 0) goto L93
            java.lang.String r2 = r2.getBalance()
            if (r2 == 0) goto L93
            java.lang.Double r2 = p362uh.C6462h.m13048E(r2)
            goto L94
        L93:
            r2 = r3
        L94:
            r1.mo7l(r2)
            androidx.lifecycle.d0<java.lang.Double> r0 = r0.f20452i
            md.z0 r5 = r5.getPayload()
            if (r5 == 0) goto La9
            java.lang.String r5 = r5.getClaimable()
            if (r5 == 0) goto La9
            java.lang.Double r3 = p362uh.C6462h.m13048E(r5)
        La9:
            r0.mo7l(r3)
            return
    }
}

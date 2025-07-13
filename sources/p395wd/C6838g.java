package p395wd;

/* renamed from: wd.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C6838g implements p105g2.C2222p.a {

    /* renamed from: a */
    public final /* synthetic */ int f26593a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f26594b;

    public /* synthetic */ C6838g(p078ef.C1835f r2) {
            r1 = this;
            r0 = 1
            r1.f26593a = r0
            r1.<init>()
            r1.f26594b = r2
            return
    }

    public /* synthetic */ C6838g(gg.C2369g r2) {
            r1 = this;
            r0 = 2
            r1.f26593a = r0
            r1.<init>()
            r1.f26594b = r2
            return
    }

    public /* synthetic */ C6838g(p395wd.C6843l r2) {
            r1 = this;
            r0 = 0
            r1.f26593a = r0
            r1.<init>()
            r1.f26594b = r2
            return
    }

    @Override // p105g2.C2222p.a
    /* renamed from: a */
    public final void mo118a(p105g2.C2226t r7) {
            r6 = this;
            zg.d r0 = p458zg.EnumC7332d.f28068Z
            int r1 = r6.f26593a
            java.lang.String r2 = "Error"
            java.lang.String r3 = "it"
            java.lang.String r4 = "this$0"
            switch(r1) {
                case 0: goto L33;
                case 1: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L42
        Le:
            java.lang.Object r1 = r6.f26594b
            ef.f r1 = (p078ef.C1835f) r1
            p214m2.C4339q.m9706k(r1, r4)
            androidx.lifecycle.d0<vg.b<ah.a>> r4 = r1.f7995h
            p214m2.C4339q.m9705j(r7, r3)
            java.lang.String r7 = vg.C6672m.m13514a(r7)
            vg.b r3 = new vg.b
            ah.a r5 = new ah.a
            r5.<init>(r2, r7, r0)
            r3.<init>(r5)
            r4.mo7l(r3)
            androidx.lifecycle.d0<java.lang.Boolean> r7 = r1.f7992e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.mo7l(r0)
            return
        L33:
            java.lang.Object r7 = r6.f26594b
            wd.l r7 = (p395wd.C6843l) r7
            p214m2.C4339q.m9706k(r7, r4)
            androidx.lifecycle.d0<java.util.List<od.w>> r7 = r7.f26598e
            dh.k r0 = p062dh.C1475k.f7237Y
            r7.mo7l(r0)
            return
        L42:
            java.lang.Object r1 = r6.f26594b
            gg.g r1 = (gg.C2369g) r1
            p214m2.C4339q.m9706k(r1, r4)
            hk.a$b r4 = hk.C3053a.f12282b
            r4.mo7470d(r7)
            p214m2.C4339q.m9705j(r7, r3)
            java.lang.String r7 = vg.C6672m.m13514a(r7)
            androidx.lifecycle.d0<vg.b<ah.a>> r3 = r1.f10719n
            vg.b r4 = new vg.b
            ah.a r5 = new ah.a
            r5.<init>(r2, r7, r0)
            r4.<init>(r5)
            r3.mo7l(r4)
            androidx.lifecycle.d0<java.lang.Boolean> r7 = r1.f10714i
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.mo7l(r0)
            return
    }
}

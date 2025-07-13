package p257of;

/* renamed from: of.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C5251e implements p241o.InterfaceC4866a, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0630h {

    /* renamed from: Y */
    public final /* synthetic */ int f20403Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f20404Z;

    public /* synthetic */ C5251e(cg.C0966h r2) {
            r1 = this;
            r0 = 6
            r1.f20403Y = r0
            r1.<init>()
            r1.f20404Z = r2
            return
    }

    public /* synthetic */ C5251e(eg.C1838b r2) {
            r1 = this;
            r0 = 7
            r1.f20403Y = r0
            r1.<init>()
            r1.f20404Z = r2
            return
    }

    public /* synthetic */ C5251e(gg.C2367e r2) {
            r1 = this;
            r0 = 8
            r1.f20403Y = r0
            r1.<init>()
            r1.f20404Z = r2
            return
    }

    public /* synthetic */ C5251e(p152ig.C3146c r2) {
            r1 = this;
            r0 = 9
            r1.f20403Y = r0
            r1.<init>()
            r1.f20404Z = r2
            return
    }

    public /* synthetic */ C5251e(io.tacocrypto.app.p156ui.tools.nftwallet.assets.NFTAssetsFragment r2) {
            r1 = this;
            r0 = 2
            r1.f20403Y = r0
            r1.<init>()
            r1.f20404Z = r2
            return
    }

    public /* synthetic */ C5251e(io.tacocrypto.app.p156ui.tools.nftwallet.collections.NFTCollectionsFragment r2) {
            r1 = this;
            r0 = 3
            r1.f20403Y = r0
            r1.<init>()
            r1.f20404Z = r2
            return
    }

    public /* synthetic */ C5251e(io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment r2) {
            r1 = this;
            r0 = 4
            r1.f20403Y = r0
            r1.<init>()
            r1.f20404Z = r2
            return
    }

    public /* synthetic */ C5251e(io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTMainFragment r2) {
            r1 = this;
            r0 = 5
            r1.f20403Y = r0
            r1.<init>()
            r1.f20404Z = r2
            return
    }

    public /* synthetic */ C5251e(p208lg.C4294b r2) {
            r1 = this;
            r0 = 10
            r1.f20403Y = r0
            r1.<init>()
            r1.f20404Z = r2
            return
    }

    public /* synthetic */ C5251e(p257of.C5263q r2) {
            r1 = this;
            r0 = 0
            r1.f20403Y = r0
            r1.<init>()
            r1.f20404Z = r2
            return
    }

    public /* synthetic */ C5251e(pf.C5498g r2) {
            r1 = this;
            r0 = 1
            r1.f20403Y = r0
            r1.<init>()
            r1.f20404Z = r2
            return
    }

    @Override // p241o.InterfaceC4866a
    public java.lang.Object apply(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f20403Y
            java.lang.String r1 = "--"
            r2 = 2
            r3 = 0
            r4 = 4
            java.lang.String r5 = "it"
            r6 = 0
            java.lang.String r8 = "Balance "
            java.lang.String r9 = "this$0"
            switch(r0) {
                case 0: goto L13;
                default: goto L12;
            }
        L12:
            goto L45
        L13:
            java.lang.Object r0 = r10.f20404Z
            of.q r0 = (p257of.C5263q) r0
            java.lang.Double r11 = (java.lang.Double) r11
            p214m2.C4339q.m9706k(r0, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            boolean r0 = r0.f20420h
            if (r0 == 0) goto L26
            goto L28
        L26:
            java.lang.String r8 = "Staked "
        L28:
            r9.append(r8)
            boolean r0 = p214m2.C4339q.m9701a(r11, r6)
            if (r0 == 0) goto L32
            goto L3d
        L32:
            p214m2.C4339q.m9705j(r11, r5)
            double r0 = r11.doubleValue()
            java.lang.String r1 = vg.C6672m.m13535v(r0, r4, r3, r2)
        L3d:
            r9.append(r1)
            java.lang.String r11 = r9.toString()
            return r11
        L45:
            java.lang.Object r0 = r10.f20404Z
            pf.g r0 = (pf.C5498g) r0
            java.lang.Double r11 = (java.lang.Double) r11
            p214m2.C4339q.m9706k(r0, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            boolean r0 = r0.f21459i
            if (r0 == 0) goto L58
            goto L5a
        L58:
            java.lang.String r8 = "Deposited "
        L5a:
            r9.append(r8)
            boolean r0 = p214m2.C4339q.m9701a(r11, r6)
            if (r0 == 0) goto L64
            goto L6f
        L64:
            p214m2.C4339q.m9705j(r11, r5)
            double r0 = r11.doubleValue()
            java.lang.String r1 = vg.C6672m.m13535v(r0, r4, r3, r2)
        L6f:
            r9.append(r1)
            java.lang.String r11 = r9.toString()
            return r11
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0630h
    /* renamed from: e */
    public void mo2174e() {
            r3 = this;
            int r0 = r3.f20403Y
            java.lang.String r1 = "this$0"
            switch(r0) {
                case 2: goto L8d;
                case 3: goto L7c;
                case 4: goto L6b;
                case 5: goto L4d;
                case 6: goto L3c;
                case 7: goto L2b;
                case 8: goto L1a;
                case 9: goto L9;
                default: goto L7;
            }
        L7:
            goto L9e
        L9:
            java.lang.Object r0 = r3.f20404Z
            ig.c r0 = (p152ig.C3146c) r0
            ig.c$b r2 = p152ig.C3146c.f12587q1
            p214m2.C4339q.m9706k(r0, r1)
            ig.h r0 = r0.m7599P0()
            r0.m7608k()
            return
        L1a:
            java.lang.Object r0 = r3.f20404Z
            gg.e r0 = (gg.C2367e) r0
            int r2 = gg.C2367e.f10694o1
            p214m2.C4339q.m9706k(r0, r1)
            gg.g r0 = r0.m6102Q0()
            r0.m6109j()
            return
        L2b:
            java.lang.Object r0 = r3.f20404Z
            eg.b r0 = (eg.C1838b) r0
            int r2 = eg.C1838b.f8002p1
            p214m2.C4339q.m9706k(r0, r1)
            eg.m r0 = r0.m4592P0()
            r0.m4595f()
            return
        L3c:
            java.lang.Object r0 = r3.f20404Z
            cg.h r0 = (cg.C0966h) r0
            int r2 = cg.C0966h.f4989t1
            p214m2.C4339q.m9706k(r0, r1)
            cg.l r0 = r0.m2681Q0()
            java.util.Objects.requireNonNull(r0)
            return
        L4d:
            java.lang.Object r0 = r3.f20404Z
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTMainFragment r0 = (io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTMainFragment) r0
            int r2 = io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTMainFragment.f14489X0
            p214m2.C4339q.m9706k(r0, r1)
            wf.k r1 = r0.m7747H0()
            r2 = 0
            r1.m13926l(r2)
            T extends w1.a r0 = r0.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.u1 r0 = (p171jd.AbstractC3563u1) r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r0.f15570y
            r0.setRefreshing(r2)
            return
        L6b:
            java.lang.Object r0 = r3.f20404Z
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment r0 = (io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment) r0
            int r2 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment.f14429c1
            p214m2.C4339q.m9706k(r0, r1)
            uf.t r0 = r0.m7744H0()
            r0.m13041g()
            return
        L7c:
            java.lang.Object r0 = r3.f20404Z
            io.tacocrypto.app.ui.tools.nftwallet.collections.NFTCollectionsFragment r0 = (io.tacocrypto.app.p156ui.tools.nftwallet.collections.NFTCollectionsFragment) r0
            int r2 = io.tacocrypto.app.p156ui.tools.nftwallet.collections.NFTCollectionsFragment.f14415X0
            p214m2.C4339q.m9706k(r0, r1)
            tf.c r0 = r0.m7743H0()
            r0.m12825f()
            return
        L8d:
            java.lang.Object r0 = r3.f20404Z
            io.tacocrypto.app.ui.tools.nftwallet.assets.NFTAssetsFragment r0 = (io.tacocrypto.app.p156ui.tools.nftwallet.assets.NFTAssetsFragment) r0
            int r2 = io.tacocrypto.app.p156ui.tools.nftwallet.assets.NFTAssetsFragment.f14400Y0
            p214m2.C4339q.m9706k(r0, r1)
            sf.h r0 = r0.m7742H0()
            r0.m12524e()
            return
        L9e:
            java.lang.Object r0 = r3.f20404Z
            lg.b r0 = (p208lg.C4294b) r0
            int r2 = p208lg.C4294b.f17533p1
            p214m2.C4339q.m9706k(r0, r1)
            lg.k r0 = r0.m9591P0()
            r1 = 1
            r0.m9594e(r1)
            return
    }
}

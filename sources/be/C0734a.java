package be;

/* renamed from: be.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0734a implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: Y */
    public final /* synthetic */ int f4013Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f4014Z;

    public /* synthetic */ C0734a(be.C0739f r2) {
            r1 = this;
            r0 = 0
            r1.f4013Y = r0
            r1.<init>()
            r1.f4014Z = r2
            return
    }

    public /* synthetic */ C0734a(ge.C2331d r2) {
            r1 = this;
            r0 = 1
            r1.f4013Y = r0
            r1.<init>()
            r1.f4014Z = r2
            return
    }

    public /* synthetic */ C0734a(io.tacocrypto.app.p156ui.transfer.TransferFragment r2) {
            r1 = this;
            r0 = 4
            r1.f4013Y = r0
            r1.<init>()
            r1.f4014Z = r2
            return
    }

    public /* synthetic */ C0734a(p437yf.C7198b r2) {
            r1 = this;
            r0 = 2
            r1.f4013Y = r0
            r1.<init>()
            r1.f4014Z = r2
            return
    }

    public /* synthetic */ C0734a(p457zf.C7316c r2) {
            r1 = this;
            r0 = 3
            r1.f4013Y = r0
            r1.<init>()
            r1.f4014Z = r2
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r3, android.view.View r4, int r5, long r6) {
            r2 = this;
            int r4 = r2.f4013Y
            r6 = 0
            java.lang.String r7 = ""
            java.lang.String r0 = "this$0"
            switch(r4) {
                case 0: goto La7;
                case 1: goto L68;
                case 2: goto L3a;
                case 3: goto Lc;
                default: goto La;
            }
        La:
            goto Le6
        Lc:
            java.lang.Object r4 = r2.f4014Z
            zf.c r4 = (p457zf.C7316c) r4
            int r1 = p457zf.C7316c.f28016n1
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.Object r3 = r3.getItemAtPosition(r5)
            boolean r5 = r3 instanceof id.C3130a
            if (r5 == 0) goto L20
            id.a r3 = (id.C3130a) r3
            goto L21
        L20:
            r3 = r6
        L21:
            zf.n r5 = r4.m14398O0()
            if (r3 == 0) goto L2a
            java.lang.String r3 = r3.f12557Z
            goto L2b
        L2a:
            r3 = r6
        L2b:
            if (r3 != 0) goto L2e
            goto L2f
        L2e:
            r7 = r3
        L2f:
            r5.m14401f(r7)
            androidx.fragment.app.s r3 = r4.m1333s()
            vg.C6664e.m13505f(r3, r6)
            return
        L3a:
            java.lang.Object r4 = r2.f4014Z
            yf.b r4 = (p437yf.C7198b) r4
            int r1 = p437yf.C7198b.f27715o1
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.Object r3 = r3.getItemAtPosition(r5)
            boolean r5 = r3 instanceof id.C3130a
            if (r5 == 0) goto L4e
            id.a r3 = (id.C3130a) r3
            goto L4f
        L4e:
            r3 = r6
        L4f:
            yf.f r5 = r4.m14282O0()
            if (r3 == 0) goto L58
            java.lang.String r3 = r3.f12557Z
            goto L59
        L58:
            r3 = r6
        L59:
            if (r3 != 0) goto L5c
            goto L5d
        L5c:
            r7 = r3
        L5d:
            r5.m14283d(r7)
            androidx.fragment.app.s r3 = r4.m1333s()
            vg.C6664e.m13505f(r3, r6)
            return
        L68:
            java.lang.Object r4 = r2.f4014Z
            ge.d r4 = (ge.C2331d) r4
            int r1 = ge.C2331d.f10588o1
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.Object r3 = r3.getItemAtPosition(r5)
            boolean r5 = r3 instanceof id.C3130a
            if (r5 == 0) goto L7c
            id.a r3 = (id.C3130a) r3
            goto L7d
        L7c:
            r3 = r6
        L7d:
            ge.j r5 = r4.m6090O0()
            if (r3 == 0) goto L86
            java.lang.String r3 = r3.f12557Z
            goto L87
        L86:
            r3 = r6
        L87:
            if (r3 != 0) goto L8a
            goto L8b
        L8a:
            r7 = r3
        L8b:
            java.util.Objects.requireNonNull(r5)
            androidx.lifecycle.d0<java.lang.String> r3 = r5.f10619m
            r3.mo7l(r7)
            androidx.lifecycle.d0<vg.b<ch.l>> r3 = r5.f10618l
            vg.b r5 = new vg.b
            ch.l r7 = ch.C0985l.f5061a
            r5.<init>(r7)
            r3.mo7l(r5)
            androidx.fragment.app.s r3 = r4.m1333s()
            vg.C6664e.m13505f(r3, r6)
            return
        La7:
            java.lang.Object r4 = r2.f4014Z
            be.f r4 = (be.C0739f) r4
            int r1 = be.C0739f.f4022o1
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.Object r3 = r3.getItemAtPosition(r5)
            boolean r5 = r3 instanceof id.C3130a
            if (r5 == 0) goto Lbb
            id.a r3 = (id.C3130a) r3
            goto Lbc
        Lbb:
            r3 = r6
        Lbc:
            be.g r5 = r4.m2348P0()
            if (r3 == 0) goto Lc5
            java.lang.String r3 = r3.f12557Z
            goto Lc6
        Lc5:
            r3 = r6
        Lc6:
            if (r3 != 0) goto Lc9
            goto Lca
        Lc9:
            r7 = r3
        Lca:
            java.util.Objects.requireNonNull(r5)
            androidx.lifecycle.d0<java.lang.String> r3 = r5.f4050q
            r3.mo7l(r7)
            androidx.lifecycle.d0<vg.b<ch.l>> r3 = r5.f4040g
            vg.b r5 = new vg.b
            ch.l r7 = ch.C0985l.f5061a
            r5.<init>(r7)
            r3.mo7l(r5)
            androidx.fragment.app.s r3 = r4.m1333s()
            vg.C6664e.m13505f(r3, r6)
            return
        Le6:
            java.lang.Object r4 = r2.f4014Z
            io.tacocrypto.app.ui.transfer.TransferFragment r4 = (io.tacocrypto.app.p156ui.transfer.TransferFragment) r4
            int r1 = io.tacocrypto.app.p156ui.transfer.TransferFragment.f14509W0
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.Object r3 = r3.getItemAtPosition(r5)
            boolean r5 = r3 instanceof id.C3130a
            if (r5 == 0) goto Lfa
            id.a r3 = (id.C3130a) r3
            goto Lfb
        Lfa:
            r3 = r6
        Lfb:
            rg.f r5 = r4.m7749H0()
            if (r3 == 0) goto L104
            java.lang.String r3 = r3.f12557Z
            goto L105
        L104:
            r3 = r6
        L105:
            if (r3 != 0) goto L108
            goto L109
        L108:
            r7 = r3
        L109:
            java.util.Objects.requireNonNull(r5)
            androidx.lifecycle.d0<java.lang.String> r3 = r5.f22639p
            r3.mo7l(r7)
            androidx.lifecycle.d0<vg.b<ch.l>> r3 = r5.f22633j
            vg.b r5 = new vg.b
            ch.l r7 = ch.C0985l.f5061a
            r5.<init>(r7)
            r3.mo7l(r5)
            androidx.fragment.app.s r3 = r4.m1333s()
            vg.C6664e.m13505f(r3, r6)
            return
    }
}

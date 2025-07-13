package p455zd;

/* renamed from: zd.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC7296a implements android.view.View.OnClickListener {

    /* renamed from: Y */
    public final /* synthetic */ int f27970Y;

    /* renamed from: Z */
    public final /* synthetic */ p455zd.C7301f f27971Z;

    public /* synthetic */ ViewOnClickListenerC7296a(p455zd.C7301f r2, int r3) {
            r1 = this;
            r1.f27970Y = r3
            r0 = 1
            r1.<init>()
            r1.f27971Z = r2
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r14) {
            r13 = this;
            int r14 = r13.f27970Y
            java.lang.String r0 = "this$0"
            switch(r14) {
                case 0: goto L85;
                case 1: goto L9;
                default: goto L7;
            }
        L7:
            goto L90
        L9:
            zd.f r14 = r13.f27971Z
            int r1 = p455zd.C7301f.f27980o1
            p214m2.C4339q.m9706k(r14, r0)
            zd.l r0 = r14.m14397P0()
            android.content.Context r2 = r14.m1334s0()
            java.util.Objects.requireNonNull(r0)
            zg.d r14 = p458zg.EnumC7332d.f28069a0
            androidx.lifecycle.d0<id.b> r1 = r0.f28004j
            java.lang.Object r1 = r1.m1411d()
            r6 = r1
            id.b r6 = (id.C3131b) r6
            androidx.lifecycle.LiveData<ce.f> r1 = r0.f28003i
            java.lang.Object r1 = r1.m1411d()
            p214m2.C4339q.m9704i(r1)
            ce.f r1 = (p041ce.C0955f) r1
            java.lang.String r3 = "Wait"
            if (r6 != 0) goto L44
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f27999e
            vg.b r1 = new vg.b
            ah.a r2 = new ah.a
            java.lang.String r4 = "Wallet not selected"
            r2.<init>(r3, r4, r14)
            r1.<init>(r2)
            goto L5c
        L44:
            java.lang.String r4 = r6.f12559a
            java.lang.String r5 = r1.f4955b0
            boolean r4 = p214m2.C4339q.m9702c(r4, r5)
            if (r4 == 0) goto L60
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f27999e
            vg.b r1 = new vg.b
            ah.a r2 = new ah.a
            java.lang.String r4 = "You can't send it to yourself"
            r2.<init>(r3, r4, r14)
            r1.<init>(r2)
        L5c:
            r0.mo7l(r1)
            goto L84
        L60:
            nd.b0 r14 = r0.f27997c
            zd.k r5 = new zd.k
            r5.<init>(r0)
            java.util.Objects.requireNonNull(r14)
            od.r r0 = new od.r
            java.lang.String r8 = r1.f4955b0
            java.lang.String r9 = r1.f4952Y
            java.lang.String r10 = r1.f4953Z
            java.lang.String r11 = r1.f4957d0
            java.lang.String r12 = r1.f4954a0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            java.util.List r3 = p074e9.C1805a.m4528m(r0)
            nd.a r4 = p238nd.EnumC4724a.f18868Z
            r1 = r14
            r1.m10801n(r2, r3, r4, r5, r6)
        L84:
            return
        L85:
            zd.f r14 = r13.f27971Z
            int r1 = p455zd.C7301f.f27980o1
            p214m2.C4339q.m9706k(r14, r0)
            r14.mo1222D0()
            return
        L90:
            zd.f r14 = r13.f27971Z
            int r1 = p455zd.C7301f.f27980o1
            p214m2.C4339q.m9706k(r14, r0)
            zd.l r14 = r14.m14397P0()
            androidx.lifecycle.d0<vg.b<java.util.List<id.b>>> r0 = r14.f28008n
            vg.b r1 = new vg.b
            nd.b0 r14 = r14.f27997c
            java.util.List<id.b> r14 = r14.f18927w
            r1.<init>(r14)
            r0.mo7l(r1)
            return
    }
}

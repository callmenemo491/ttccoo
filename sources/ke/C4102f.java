package ke;

/* renamed from: ke.f */
/* loaded from: classes.dex */
public final class C4102f extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ ke.C4103g f17049Z;

    public C4102f(ke.C4103g r1) {
            r0 = this;
            r0.f17049Z = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public ch.C0985l mo122l(java.lang.Boolean r5, java.lang.String r6) {
            r4 = this;
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r6 = (java.lang.String) r6
            if (r5 == 0) goto L1f
            ke.g r5 = r4.f17049Z
            androidx.lifecycle.d0<vg.b<ch.e<java.lang.String, java.lang.String>>> r5 = r5.f17052e
            vg.b r6 = new vg.b
            ch.e r0 = new ch.e
            r1 = 0
            java.lang.String r2 = "Swap success"
            r0.<init>(r2, r1)
            r6.<init>(r0)
            r5.mo7l(r6)
            goto L34
        L1f:
            ke.g r5 = r4.f17049Z
            androidx.lifecycle.d0<vg.b<ah.a>> r5 = r5.f17051d
            vg.b r0 = new vg.b
            ah.a r1 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28068Z
            java.lang.String r3 = "Transaction Error"
            r1.<init>(r3, r6, r2)
            r0.<init>(r1)
            r5.mo7l(r0)
        L34:
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}

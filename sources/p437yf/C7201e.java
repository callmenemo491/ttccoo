package p437yf;

/* renamed from: yf.e */
/* loaded from: classes.dex */
public final class C7201e extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p437yf.C7202f f27733Z;

    public C7201e(p437yf.C7202f r1) {
            r0 = this;
            r0.f27733Z = r1
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
            if (r5 == 0) goto L32
            yf.f r5 = r4.f27733Z
            androidx.lifecycle.d0<java.lang.String> r6 = r5.f27740i
            java.lang.String r0 = ""
            r6.mo7l(r0)
            androidx.lifecycle.d0<java.lang.String> r5 = r5.f27741j
            r5.mo7l(r0)
            yf.f r5 = r4.f27733Z
            androidx.lifecycle.d0<vg.b<ah.a>> r5 = r5.f27738g
            java.lang.String r6 = "Congratulations"
            java.lang.String r0 = "title"
            p214m2.C4339q.m9706k(r6, r0)
            vg.b r0 = new vg.b
            ah.a r1 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28067Y
            java.lang.String r3 = "NFT sent successfully!"
            r1.<init>(r6, r3, r2)
            r0.<init>(r1)
            goto L44
        L32:
            yf.f r5 = r4.f27733Z
            androidx.lifecycle.d0<vg.b<ah.a>> r5 = r5.f27737f
            vg.b r0 = new vg.b
            ah.a r1 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28068Z
            java.lang.String r3 = "Transaction Error"
            r1.<init>(r3, r6, r2)
            r0.<init>(r1)
        L44:
            r5.mo7l(r0)
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}

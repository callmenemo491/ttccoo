package p457zf;

/* renamed from: zf.o */
/* loaded from: classes.dex */
public final class C7328o extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p457zf.C7327n f28063Z;

    public C7328o(p457zf.C7327n r1) {
            r0 = this;
            r0.f28063Z = r1
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
            if (r5 == 0) goto L38
            zf.n r5 = r4.f28063Z
            androidx.lifecycle.d0<xf.k> r6 = r5.f28057o
            r0 = 0
            r6.mo7l(r0)
            androidx.lifecycle.d0<java.lang.String> r6 = r5.f28058p
            java.lang.String r0 = ""
            r6.mo7l(r0)
            androidx.lifecycle.d0<java.lang.String> r5 = r5.f28059q
            r5.mo7l(r0)
            zf.n r5 = r4.f28063Z
            androidx.lifecycle.d0<vg.b<ah.a>> r5 = r5.f28050h
            java.lang.String r6 = "Congratulations"
            java.lang.String r0 = "title"
            p214m2.C4339q.m9706k(r6, r0)
            vg.b r0 = new vg.b
            ah.a r1 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28067Y
            java.lang.String r3 = "NFT sent successfully!"
            r1.<init>(r6, r3, r2)
            r0.<init>(r1)
            goto L60
        L38:
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            zf.n r0 = r4.f28063Z
            zf.h r1 = new zf.h
            r2 = 1
            r1.<init>(r0, r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r1, r2)
            zf.n r5 = r4.f28063Z
            androidx.lifecycle.d0<vg.b<ah.a>> r5 = r5.f28049g
            vg.b r0 = new vg.b
            ah.a r1 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28068Z
            java.lang.String r3 = "Transaction Error"
            r1.<init>(r3, r6, r2)
            r0.<init>(r1)
        L60:
            r5.mo7l(r0)
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}

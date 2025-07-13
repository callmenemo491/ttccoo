package p223mf;

/* renamed from: mf.g */
/* loaded from: classes.dex */
public final class C4602g extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p223mf.C4601f f18480Z;

    public C4602g(p223mf.C4601f r1) {
            r0 = this;
            r0.f18480Z = r1
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
            if (r5 == 0) goto L2e
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            mf.f r6 = r4.f18480Z
            f1.f r0 = new f1.f
            r0.<init>(r6)
            r1 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r0, r1)
            mf.f r5 = r4.f18480Z
            androidx.lifecycle.d0<vg.b<java.lang.String>> r5 = r5.f18466m
            vg.b r6 = new vg.b
            java.lang.String r0 = "Transaction success"
            r6.<init>(r0)
            r5.mo7l(r6)
            goto L43
        L2e:
            mf.f r5 = r4.f18480Z
            androidx.lifecycle.d0<vg.b<ah.a>> r5 = r5.f18465l
            vg.b r0 = new vg.b
            ah.a r1 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28068Z
            java.lang.String r3 = "Transaction Error"
            r1.<init>(r3, r6, r2)
            r0.<init>(r1)
            r5.mo7l(r0)
        L43:
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}

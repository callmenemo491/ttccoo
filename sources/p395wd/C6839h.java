package p395wd;

/* renamed from: wd.h */
/* loaded from: classes.dex */
public final class C6839h extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p395wd.C6843l f26595Z;

    public C6839h(p395wd.C6843l r1) {
            r0 = this;
            r0.f26595Z = r1
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
            wd.l r0 = r4.f26595Z
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f26600g
            if (r5 == 0) goto L23
            java.lang.String r5 = "Transaction success"
            r6 = 0
            java.lang.String r1 = "title"
            p214m2.C4339q.m9706k(r5, r1)
            vg.b r1 = new vg.b
            ah.a r2 = new ah.a
            zg.d r3 = p458zg.EnumC7332d.f28067Y
            r2.<init>(r5, r6, r3)
            r1.<init>(r2)
            goto L31
        L23:
            vg.b r1 = new vg.b
            ah.a r5 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28068Z
            java.lang.String r3 = "Transaction Error"
            r5.<init>(r3, r6, r2)
            r1.<init>(r5)
        L31:
            r0.mo7l(r1)
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            wd.l r6 = r4.f26595Z
            f1.f r0 = new f1.f
            r0.<init>(r6)
            r1 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r0, r1)
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}

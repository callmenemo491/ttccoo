package p172jf;

/* renamed from: jf.i */
/* loaded from: classes.dex */
public final class C3600i extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p172jf.C3598g f15854Z;

    public C3600i(p172jf.C3598g r1) {
            r0 = this;
            r0.f15854Z = r1
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
            jf.g r0 = r4.f15854Z
            androidx.lifecycle.d0<vg.b<ah.a>> r1 = r0.f15780o
            if (r5 == 0) goto L39
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            jf.g r6 = r4.f15854Z
            jf.h r0 = new jf.h
            r2 = 0
            r0.<init>(r6, r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r0, r2)
            java.lang.String r5 = "Harvest success"
            r6 = 0
            java.lang.String r0 = "title"
            p214m2.C4339q.m9706k(r5, r0)
            vg.b r0 = new vg.b
            ah.a r2 = new ah.a
            zg.d r3 = p458zg.EnumC7332d.f28067Y
            r2.<init>(r5, r6, r3)
            r0.<init>(r2)
            goto L4a
        L39:
            r0.m8034o()
            vg.b r0 = new vg.b
            ah.a r5 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28068Z
            java.lang.String r3 = "Transaction Error"
            r5.<init>(r3, r6, r2)
            r0.<init>(r5)
        L4a:
            r1.mo7l(r0)
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}

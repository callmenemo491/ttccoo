package gg;

/* renamed from: gg.h */
/* loaded from: classes.dex */
public final class C2370h extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ gg.C2369g f10750Z;

    public C2370h(gg.C2369g r1) {
            r0 = this;
            r0.f10750Z = r1
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
            gg.g r0 = r4.f10750Z
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f10719n
            if (r5 == 0) goto L23
            java.lang.String r5 = "Claim success"
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
            gg.g r5 = r4.f10750Z
            androidx.lifecycle.d0<java.util.List<od.h0>> r5 = r5.f10715j
            dh.k r6 = p062dh.C1475k.f7237Y
            r5.mo7l(r6)
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            gg.g r6 = r4.f10750Z
            gg.f r0 = new gg.f
            r1 = 1
            r0.<init>(r6, r1)
            r1 = 3000(0xbb8, double:1.482E-320)
            r5.postDelayed(r0, r1)
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}

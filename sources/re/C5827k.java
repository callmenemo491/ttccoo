package re;

/* renamed from: re.k */
/* loaded from: classes.dex */
public final class C5827k extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ re.C5832p f22563Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.String f22564a0;

    public C5827k(re.C5832p r1, java.lang.String r2) {
            r0 = this;
            r0.f22563Z = r1
            r0.f22564a0 = r2
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public ch.C0985l mo122l(java.lang.Boolean r7, java.lang.String r8) {
            r6 = this;
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.String r8 = (java.lang.String) r8
            if (r7 == 0) goto L7d
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r7.<init>(r8)
            re.p r8 = r6.f22563Z
            f1.f r0 = new f1.f
            r0.<init>(r8)
            r1 = 15000(0x3a98, double:7.411E-320)
            r7.postDelayed(r0, r1)
            re.p r7 = r6.f22563Z
            androidx.lifecycle.d0<vg.b<ah.a>> r7 = r7.f22572h
            java.lang.String r8 = "Completed"
            java.lang.String r0 = "title"
            p214m2.C4339q.m9706k(r8, r0)
            vg.b r0 = new vg.b
            ah.a r1 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28067Y
            java.lang.String r3 = "Sale deleted"
            r1.<init>(r8, r3, r2)
            r0.<init>(r1)
            r7.mo7l(r0)
            re.p r7 = r6.f22563Z
            androidx.lifecycle.d0<java.util.List<te.e>> r7 = r7.f22571g
            java.lang.Object r8 = r7.m1411d()
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L77
            java.util.List r8 = p062dh.C1473i.m4009U(r8)
            java.lang.String r0 = r6.f22564a0
            r1 = 0
            r2 = r8
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r3 = r2.iterator()
        L55:
            boolean r4 = r3.hasNext()
            r5 = -1
            if (r4 == 0) goto L70
            java.lang.Object r4 = r3.next()
            te.e r4 = (p344te.C6223e) r4
            java.lang.String r4 = r4.getSaleID()
            boolean r4 = p214m2.C4339q.m9702c(r4, r0)
            if (r4 == 0) goto L6d
            goto L71
        L6d:
            int r1 = r1 + 1
            goto L55
        L70:
            r1 = -1
        L71:
            if (r1 == r5) goto L79
            r2.remove(r1)
            goto L79
        L77:
            dh.k r8 = p062dh.C1475k.f7237Y
        L79:
            r7.mo7l(r8)
            goto L97
        L7d:
            re.p r7 = r6.f22563Z
            r7.m12196e()
            re.p r7 = r6.f22563Z
            androidx.lifecycle.d0<vg.b<ah.a>> r7 = r7.f22572h
            vg.b r0 = new vg.b
            ah.a r1 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28068Z
            java.lang.String r3 = "Transaction Error"
            r1.<init>(r3, r8, r2)
            r0.<init>(r1)
            r7.mo7l(r0)
        L97:
            ch.l r7 = ch.C0985l.f5061a
            return r7
    }
}

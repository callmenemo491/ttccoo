package p211m;

/* renamed from: m.c */
/* loaded from: classes.dex */
public abstract class AbstractC4310c {
    public AbstractC4310c(int r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: c */
    public static java.util.Hashtable m9638c(java.util.Hashtable r4) {
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            java.util.Enumeration r1 = r4.keys()
        L9:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r1.nextElement()
            java.lang.Object r3 = r4.get(r2)
            r0.put(r2, r3)
            goto L9
        L1b:
            return r0
    }

    /* renamed from: a */
    public boolean m9639a(p042cj.C0991c r6, p042cj.C0991c r7) {
            r5 = this;
            cj.b[] r6 = r6.m2726p()
            cj.b[] r7 = r7.m2726p()
            int r0 = r6.length
            int r1 = r7.length
            r2 = 0
            if (r0 == r1) goto Le
            return r2
        Le:
            r0 = r6[r2]
            cj.a r0 = r0.m2722n()
            r1 = 1
            if (r0 == 0) goto L35
            r0 = r7[r2]
            cj.a r0 = r0.m2722n()
            if (r0 == 0) goto L35
            r0 = r6[r2]
            cj.a r0 = r0.m2722n()
            ri.n r0 = r0.f5072Y
            r3 = r7[r2]
            cj.a r3 = r3.m2722n()
            ri.n r3 = r3.f5072Y
            boolean r0 = r0.equals(r3)
            r0 = r0 ^ r1
            goto L36
        L35:
            r0 = 0
        L36:
            r3 = 0
        L37:
            int r4 = r6.length
            if (r3 == r4) goto L46
            r4 = r6[r3]
            boolean r4 = r5.m9641e(r0, r4, r7)
            if (r4 != 0) goto L43
            return r2
        L43:
            int r3 = r3 + 1
            goto L37
        L46:
            return r1
    }

    /* renamed from: b */
    public int m9640b(p317ri.InterfaceC5870e r1) {
            r0 = this;
            java.lang.String r1 = p209lh.C4304a.m9606L(r1)
            java.lang.String r1 = p209lh.C4304a.m9614h(r1)
            int r1 = r1.hashCode()
            return r1
    }

    /* renamed from: d */
    public abstract void mo9634d(java.lang.Runnable r1);

    /* renamed from: e */
    public boolean m9641e(boolean r5, p042cj.C0990b r6, p042cj.C0990b[] r7) {
            r4 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r5 == 0) goto L1b
            int r5 = r7.length
            int r5 = r5 - r0
        L7:
            if (r5 < 0) goto L31
            r3 = r7[r5]
            if (r3 == 0) goto L18
            r3 = r7[r5]
            boolean r3 = r4.m9642h(r6, r3)
            if (r3 == 0) goto L18
            r7[r5] = r2
            return r0
        L18:
            int r5 = r5 + (-1)
            goto L7
        L1b:
            r5 = 0
        L1c:
            int r3 = r7.length
            if (r5 == r3) goto L31
            r3 = r7[r5]
            if (r3 == 0) goto L2e
            r3 = r7[r5]
            boolean r3 = r4.m9642h(r6, r3)
            if (r3 == 0) goto L2e
            r7[r5] = r2
            return r0
        L2e:
            int r5 = r5 + 1
            goto L1c
        L31:
            return r1
    }

    /* renamed from: f */
    public abstract boolean mo9635f();

    /* renamed from: g */
    public abstract void mo9636g(java.lang.Runnable r1);

    /* renamed from: h */
    public boolean m9642h(p042cj.C0990b r5, p042cj.C0990b r6) {
            r4 = this;
            boolean r0 = r5.m2724q()
            r1 = 0
            if (r0 == 0) goto L2e
            boolean r0 = r6.m2724q()
            if (r0 == 0) goto L40
            cj.a[] r5 = r5.m2723p()
            cj.a[] r6 = r6.m2723p()
            int r0 = r5.length
            int r2 = r6.length
            if (r0 == r2) goto L1a
            goto L40
        L1a:
            r0 = 0
        L1b:
            int r2 = r5.length
            if (r0 == r2) goto L2c
            r2 = r5[r0]
            r3 = r6[r0]
            boolean r2 = p209lh.C4304a.m9610d(r2, r3)
            if (r2 != 0) goto L29
            goto L40
        L29:
            int r0 = r0 + 1
            goto L1b
        L2c:
            r1 = 1
            goto L40
        L2e:
            boolean r0 = r6.m2724q()
            if (r0 != 0) goto L40
            cj.a r5 = r5.m2722n()
            cj.a r6 = r6.m2722n()
            boolean r1 = p209lh.C4304a.m9610d(r5, r6)
        L40:
            return r1
    }

    /* renamed from: i */
    public abstract java.lang.String mo4022i(p042cj.C0991c r1);
}

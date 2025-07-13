package p401x;

/* renamed from: x.k */
/* loaded from: classes.dex */
public class C6903k extends p401x.AbstractC6908p {
    public C6903k(p381w.C6765f r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p401x.AbstractC6908p, p401x.InterfaceC6896d
    /* renamed from: a */
    public void mo13964a(p401x.InterfaceC6896d r7) {
            r6 = this;
            w.f r7 = r6.f26855b
            w.a r7 = (p381w.C6760a) r7
            int r0 = r7.f26062J0
            r1 = 0
            x.f r2 = r6.f26861h
            java.util.List<x.f> r2 = r2.f26830l
            java.util.Iterator r2 = r2.iterator()
            r3 = -1
            r4 = -1
        L11:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L28
            java.lang.Object r5 = r2.next()
            x.f r5 = (p401x.C6898f) r5
            int r5 = r5.f26825g
            if (r4 == r3) goto L23
            if (r5 >= r4) goto L24
        L23:
            r4 = r5
        L24:
            if (r1 >= r5) goto L11
            r1 = r5
            goto L11
        L28:
            if (r0 == 0) goto L37
            r2 = 2
            if (r0 != r2) goto L2e
            goto L37
        L2e:
            x.f r0 = r6.f26861h
            int r7 = r7.f26064L0
            int r1 = r1 + r7
            r0.mo13980c(r1)
            goto L3f
        L37:
            x.f r0 = r6.f26861h
            int r7 = r7.f26064L0
            int r4 = r4 + r7
            r0.mo13980c(r4)
        L3f:
            return
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: d */
    public void mo13965d() {
            r7 = this;
            w.f r0 = r7.f26855b
            boolean r1 = r0 instanceof p381w.C6760a
            if (r1 == 0) goto Le0
            x.f r1 = r7.f26861h
            r2 = 1
            r1.f26820b = r2
            w.a r0 = (p381w.C6760a) r0
            int r3 = r0.f26062J0
            boolean r4 = r0.f26063K0
            r5 = 8
            r6 = 0
            if (r3 == 0) goto La6
            if (r3 == r2) goto L7e
            r2 = 2
            if (r3 == r2) goto L48
            r2 = 3
            if (r3 == r2) goto L20
            goto Le0
        L20:
            x.f$a r2 = p401x.C6898f.a.f26837e0
            r1.f26823e = r2
        L24:
            int r1 = r0.f26240I0
            if (r6 >= r1) goto L70
            w.f[] r1 = r0.f26239H0
            r1 = r1[r6]
            if (r4 != 0) goto L33
            int r2 = r1.f26156j0
            if (r2 != r5) goto L33
            goto L45
        L33:
            x.n r1 = r1.f26145e
            x.f r1 = r1.f26862i
            java.util.List<x.d> r2 = r1.f26829k
            x.f r3 = r7.f26861h
            r2.add(r3)
            x.f r2 = r7.f26861h
            java.util.List<x.f> r2 = r2.f26830l
            r2.add(r1)
        L45:
            int r6 = r6 + 1
            goto L24
        L48:
            x.f$a r2 = p401x.C6898f.a.f26836d0
            r1.f26823e = r2
        L4c:
            int r1 = r0.f26240I0
            if (r6 >= r1) goto L70
            w.f[] r1 = r0.f26239H0
            r1 = r1[r6]
            if (r4 != 0) goto L5b
            int r2 = r1.f26156j0
            if (r2 != r5) goto L5b
            goto L6d
        L5b:
            x.n r1 = r1.f26145e
            x.f r1 = r1.f26861h
            java.util.List<x.d> r2 = r1.f26829k
            x.f r3 = r7.f26861h
            r2.add(r3)
            x.f r2 = r7.f26861h
            java.util.List<x.f> r2 = r2.f26830l
            r2.add(r1)
        L6d:
            int r6 = r6 + 1
            goto L4c
        L70:
            w.f r0 = r7.f26855b
            x.n r0 = r0.f26145e
            x.f r0 = r0.f26861h
            r7.m13992m(r0)
            w.f r0 = r7.f26855b
            x.n r0 = r0.f26145e
            goto Ldb
        L7e:
            x.f$a r2 = p401x.C6898f.a.f26835c0
            r1.f26823e = r2
        L82:
            int r1 = r0.f26240I0
            if (r6 >= r1) goto Lce
            w.f[] r1 = r0.f26239H0
            r1 = r1[r6]
            if (r4 != 0) goto L91
            int r2 = r1.f26156j0
            if (r2 != r5) goto L91
            goto La3
        L91:
            x.l r1 = r1.f26143d
            x.f r1 = r1.f26862i
            java.util.List<x.d> r2 = r1.f26829k
            x.f r3 = r7.f26861h
            r2.add(r3)
            x.f r2 = r7.f26861h
            java.util.List<x.f> r2 = r2.f26830l
            r2.add(r1)
        La3:
            int r6 = r6 + 1
            goto L82
        La6:
            x.f$a r2 = p401x.C6898f.a.f26834b0
            r1.f26823e = r2
        Laa:
            int r1 = r0.f26240I0
            if (r6 >= r1) goto Lce
            w.f[] r1 = r0.f26239H0
            r1 = r1[r6]
            if (r4 != 0) goto Lb9
            int r2 = r1.f26156j0
            if (r2 != r5) goto Lb9
            goto Lcb
        Lb9:
            x.l r1 = r1.f26143d
            x.f r1 = r1.f26861h
            java.util.List<x.d> r2 = r1.f26829k
            x.f r3 = r7.f26861h
            r2.add(r3)
            x.f r2 = r7.f26861h
            java.util.List<x.f> r2 = r2.f26830l
            r2.add(r1)
        Lcb:
            int r6 = r6 + 1
            goto Laa
        Lce:
            w.f r0 = r7.f26855b
            x.l r0 = r0.f26143d
            x.f r0 = r0.f26861h
            r7.m13992m(r0)
            w.f r0 = r7.f26855b
            x.l r0 = r0.f26143d
        Ldb:
            x.f r0 = r0.f26862i
            r7.m13992m(r0)
        Le0:
            return
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: e */
    public void mo13966e() {
            r3 = this;
            w.f r0 = r3.f26855b
            boolean r1 = r0 instanceof p381w.C6760a
            if (r1 == 0) goto L1e
            r1 = r0
            w.a r1 = (p381w.C6760a) r1
            int r1 = r1.f26062J0
            if (r1 == 0) goto L18
            r2 = 1
            if (r1 != r2) goto L11
            goto L18
        L11:
            x.f r1 = r3.f26861h
            int r1 = r1.f26825g
            r0.f26134X = r1
            goto L1e
        L18:
            x.f r1 = r3.f26861h
            int r1 = r1.f26825g
            r0.f26133W = r1
        L1e:
            return
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: f */
    public void mo13967f() {
            r1 = this;
            r0 = 0
            r1.f26856c = r0
            x.f r0 = r1.f26861h
            r0.m13979b()
            return
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: k */
    public boolean mo13969k() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: m */
    public final void m13992m(p401x.C6898f r2) {
            r1 = this;
            x.f r0 = r1.f26861h
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r2)
            java.util.List<x.f> r2 = r2.f26830l
            x.f r0 = r1.f26861h
            r2.add(r0)
            return
    }
}

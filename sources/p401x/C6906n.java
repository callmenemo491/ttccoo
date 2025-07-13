package p401x;

/* renamed from: x.n */
/* loaded from: classes.dex */
public class C6906n extends p401x.AbstractC6908p {

    /* renamed from: k */
    public p401x.C6898f f26846k;

    /* renamed from: l */
    public p401x.C6899g f26847l;

    public C6906n(p381w.C6765f r3) {
            r2 = this;
            r2.<init>(r3)
            x.f r3 = new x.f
            r3.<init>(r2)
            r2.f26846k = r3
            r0 = 0
            r2.f26847l = r0
            x.f r0 = r2.f26861h
            x.f$a r1 = p401x.C6898f.a.f26836d0
            r0.f26823e = r1
            x.f r0 = r2.f26862i
            x.f$a r1 = p401x.C6898f.a.f26837e0
            r0.f26823e = r1
            x.f$a r0 = p401x.C6898f.a.f26838f0
            r3.f26823e = r0
            r3 = 1
            r2.f26859f = r3
            return
    }

    @Override // p401x.AbstractC6908p, p401x.InterfaceC6896d
    /* renamed from: a */
    public void mo13964a(p401x.InterfaceC6896d r9) {
            r8 = this;
            w.f$a r9 = p381w.C6765f.a.f26191a0
            int r0 = r8.f26863j
            int r0 = p365v.C6480g.m13148b(r0)
            r1 = 3
            r2 = 1
            if (r0 == r1) goto L17f
            x.g r0 = r8.f26858e
            boolean r3 = r0.f26821c
            r4 = 0
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r3 == 0) goto L61
            boolean r3 = r0.f26828j
            if (r3 != 0) goto L61
            w.f$a r3 = r8.f26857d
            if (r3 != r9) goto L61
            w.f r3 = r8.f26855b
            int r6 = r3.f26161m
            r7 = 2
            if (r6 == r7) goto L49
            if (r6 == r1) goto L27
            goto L61
        L27:
            x.l r1 = r3.f26143d
            x.g r1 = r1.f26858e
            boolean r6 = r1.f26828j
            if (r6 == 0) goto L61
            int r6 = r3.f26132V
            r7 = -1
            if (r6 == r7) goto L42
            if (r6 == 0) goto L3a
            if (r6 == r2) goto L42
            r1 = 0
            goto L5e
        L3a:
            int r1 = r1.f26825g
            float r1 = (float) r1
            float r3 = r3.f26131U
            float r1 = r1 * r3
            goto L5c
        L42:
            int r1 = r1.f26825g
            float r1 = (float) r1
            float r3 = r3.f26131U
            float r1 = r1 / r3
            goto L5c
        L49:
            w.f r1 = r3.f26128R
            if (r1 == 0) goto L61
            x.n r1 = r1.f26145e
            x.g r1 = r1.f26858e
            boolean r6 = r1.f26828j
            if (r6 == 0) goto L61
            float r3 = r3.f26175t
            int r1 = r1.f26825g
            float r1 = (float) r1
            float r1 = r1 * r3
        L5c:
            float r1 = r1 + r5
            int r1 = (int) r1
        L5e:
            r0.mo13980c(r1)
        L61:
            x.f r0 = r8.f26861h
            boolean r1 = r0.f26821c
            if (r1 == 0) goto L17e
            x.f r1 = r8.f26862i
            boolean r3 = r1.f26821c
            if (r3 != 0) goto L6f
            goto L17e
        L6f:
            boolean r0 = r0.f26828j
            if (r0 == 0) goto L7e
            boolean r0 = r1.f26828j
            if (r0 == 0) goto L7e
            x.g r0 = r8.f26858e
            boolean r0 = r0.f26828j
            if (r0 == 0) goto L7e
            return
        L7e:
            x.g r0 = r8.f26858e
            boolean r0 = r0.f26828j
            if (r0 != 0) goto Lc6
            w.f$a r0 = r8.f26857d
            if (r0 != r9) goto Lc6
            w.f r0 = r8.f26855b
            int r1 = r0.f26159l
            if (r1 != 0) goto Lc6
            boolean r0 = r0.m13691A()
            if (r0 != 0) goto Lc6
            x.f r9 = r8.f26861h
            java.util.List<x.f> r9 = r9.f26830l
            java.lang.Object r9 = r9.get(r4)
            x.f r9 = (p401x.C6898f) r9
            x.f r0 = r8.f26862i
            java.util.List<x.f> r0 = r0.f26830l
            java.lang.Object r0 = r0.get(r4)
            x.f r0 = (p401x.C6898f) r0
            int r9 = r9.f26825g
            x.f r1 = r8.f26861h
            int r2 = r1.f26824f
            int r9 = r9 + r2
            int r0 = r0.f26825g
            x.f r2 = r8.f26862i
            int r2 = r2.f26824f
            int r0 = r0 + r2
            int r2 = r0 - r9
            r1.mo13980c(r9)
            x.f r9 = r8.f26862i
            r9.mo13980c(r0)
            x.g r9 = r8.f26858e
            r9.mo13980c(r2)
            return
        Lc6:
            x.g r0 = r8.f26858e
            boolean r0 = r0.f26828j
            if (r0 != 0) goto L118
            w.f$a r0 = r8.f26857d
            if (r0 != r9) goto L118
            int r9 = r8.f26854a
            if (r9 != r2) goto L118
            x.f r9 = r8.f26861h
            java.util.List<x.f> r9 = r9.f26830l
            int r9 = r9.size()
            if (r9 <= 0) goto L118
            x.f r9 = r8.f26862i
            java.util.List<x.f> r9 = r9.f26830l
            int r9 = r9.size()
            if (r9 <= 0) goto L118
            x.f r9 = r8.f26861h
            java.util.List<x.f> r9 = r9.f26830l
            java.lang.Object r9 = r9.get(r4)
            x.f r9 = (p401x.C6898f) r9
            x.f r0 = r8.f26862i
            java.util.List<x.f> r0 = r0.f26830l
            java.lang.Object r0 = r0.get(r4)
            x.f r0 = (p401x.C6898f) r0
            int r9 = r9.f26825g
            x.f r1 = r8.f26861h
            int r1 = r1.f26824f
            int r9 = r9 + r1
            int r0 = r0.f26825g
            x.f r1 = r8.f26862i
            int r1 = r1.f26824f
            int r0 = r0 + r1
            int r0 = r0 - r9
            x.g r9 = r8.f26858e
            int r1 = r9.f26840m
            if (r0 >= r1) goto L115
            r9.mo13980c(r0)
            goto L118
        L115:
            r9.mo13980c(r1)
        L118:
            x.g r9 = r8.f26858e
            boolean r9 = r9.f26828j
            if (r9 != 0) goto L11f
            return
        L11f:
            x.f r9 = r8.f26861h
            java.util.List<x.f> r9 = r9.f26830l
            int r9 = r9.size()
            if (r9 <= 0) goto L17e
            x.f r9 = r8.f26862i
            java.util.List<x.f> r9 = r9.f26830l
            int r9 = r9.size()
            if (r9 <= 0) goto L17e
            x.f r9 = r8.f26861h
            java.util.List<x.f> r9 = r9.f26830l
            java.lang.Object r9 = r9.get(r4)
            x.f r9 = (p401x.C6898f) r9
            x.f r0 = r8.f26862i
            java.util.List<x.f> r0 = r0.f26830l
            java.lang.Object r0 = r0.get(r4)
            x.f r0 = (p401x.C6898f) r0
            int r1 = r9.f26825g
            x.f r2 = r8.f26861h
            int r3 = r2.f26824f
            int r3 = r3 + r1
            int r4 = r0.f26825g
            x.f r6 = r8.f26862i
            int r6 = r6.f26824f
            int r6 = r6 + r4
            w.f r7 = r8.f26855b
            float r7 = r7.f26150g0
            if (r9 != r0) goto L15e
            r7 = 1056964608(0x3f000000, float:0.5)
            goto L160
        L15e:
            r1 = r3
            r4 = r6
        L160:
            int r4 = r4 - r1
            x.g r9 = r8.f26858e
            int r9 = r9.f26825g
            int r4 = r4 - r9
            float r9 = (float) r1
            float r9 = r9 + r5
            float r0 = (float) r4
            float r0 = r0 * r7
            float r0 = r0 + r9
            int r9 = (int) r0
            r2.mo13980c(r9)
            x.f r9 = r8.f26862i
            x.f r0 = r8.f26861h
            int r0 = r0.f26825g
            x.g r1 = r8.f26858e
            int r1 = r1.f26825g
            int r0 = r0 + r1
            r9.mo13980c(r0)
        L17e:
            return
        L17f:
            w.f r9 = r8.f26855b
            w.d r0 = r9.f26116G
            w.d r9 = r9.f26119I
            r8.m14007l(r0, r9, r2)
            return
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: d */
    public void mo13965d() {
            r10 = this;
            w.f$a r0 = p381w.C6765f.a.f26192b0
            w.f$a r1 = p381w.C6765f.a.f26189Y
            w.f$a r2 = p381w.C6765f.a.f26191a0
            w.f r3 = r10.f26855b
            boolean r4 = r3.f26137a
            if (r4 == 0) goto L15
            x.g r4 = r10.f26858e
            int r3 = r3.m13715o()
            r4.mo13980c(r3)
        L15:
            x.g r3 = r10.f26858e
            boolean r3 = r3.f26828j
            if (r3 != 0) goto L91
            w.f r3 = r10.f26855b
            w.f$a r3 = r3.m13720t()
            r10.f26857d = r3
            w.f r3 = r10.f26855b
            boolean r3 = r3.f26104A
            if (r3 == 0) goto L30
            x.a r3 = new x.a
            r3.<init>(r10)
            r10.f26847l = r3
        L30:
            w.f$a r3 = r10.f26857d
            if (r3 == r2) goto Lc5
            if (r3 != r0) goto L81
            w.f r0 = r10.f26855b
            w.f r0 = r0.f26128R
            if (r0 == 0) goto L81
            w.f$a r3 = r0.m13720t()
            if (r3 != r1) goto L81
            int r1 = r0.m13715o()
            w.f r2 = r10.f26855b
            w.d r2 = r2.f26116G
            int r2 = r2.m13681d()
            int r1 = r1 - r2
            w.f r2 = r10.f26855b
            w.d r2 = r2.f26119I
            int r2 = r2.m13681d()
            int r1 = r1 - r2
            x.f r2 = r10.f26861h
            x.n r3 = r0.f26145e
            x.f r3 = r3.f26861h
            w.f r4 = r10.f26855b
            w.d r4 = r4.f26116G
            int r4 = r4.m13681d()
            r10.m14002b(r2, r3, r4)
            x.f r2 = r10.f26862i
            x.n r0 = r0.f26145e
            x.f r0 = r0.f26862i
            w.f r3 = r10.f26855b
            w.d r3 = r3.f26119I
            int r3 = r3.m13681d()
            int r3 = -r3
            r10.m14002b(r2, r0, r3)
            x.g r0 = r10.f26858e
            r0.mo13980c(r1)
            return
        L81:
            w.f$a r0 = r10.f26857d
            if (r0 != r1) goto Lc5
            x.g r0 = r10.f26858e
            w.f r1 = r10.f26855b
            int r1 = r1.m13715o()
            r0.mo13980c(r1)
            goto Lc5
        L91:
            w.f$a r3 = r10.f26857d
            if (r3 != r0) goto Lc5
            w.f r0 = r10.f26855b
            w.f r0 = r0.f26128R
            if (r0 == 0) goto Lc5
            w.f$a r3 = r0.m13720t()
            if (r3 != r1) goto Lc5
            x.f r1 = r10.f26861h
            x.n r2 = r0.f26145e
            x.f r2 = r2.f26861h
            w.f r3 = r10.f26855b
            w.d r3 = r3.f26116G
            int r3 = r3.m13681d()
            r10.m14002b(r1, r2, r3)
            x.f r1 = r10.f26862i
            x.n r0 = r0.f26145e
            x.f r0 = r0.f26862i
            w.f r2 = r10.f26855b
            w.d r2 = r2.f26119I
            int r2 = r2.m13681d()
            int r2 = -r2
            r10.m14002b(r1, r0, r2)
            return
        Lc5:
            x.g r0 = r10.f26858e
            boolean r1 = r0.f26828j
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 3
            r7 = 4
            if (r1 == 0) goto L249
            w.f r8 = r10.f26855b
            boolean r9 = r8.f26137a
            if (r9 == 0) goto L249
            w.d[] r0 = r8.f26124N
            r1 = r0[r5]
            w.d r1 = r1.f26091f
            if (r1 == 0) goto L160
            r1 = r0[r6]
            w.d r1 = r1.f26091f
            if (r1 == 0) goto L160
            boolean r0 = r8.m13691A()
            if (r0 == 0) goto L108
            x.f r0 = r10.f26861h
            w.f r1 = r10.f26855b
            w.d[] r1 = r1.f26124N
            r1 = r1[r5]
            int r1 = r1.m13681d()
            r0.f26824f = r1
            x.f r0 = r10.f26862i
            w.f r1 = r10.f26855b
            w.d[] r1 = r1.f26124N
            r1 = r1[r6]
            int r1 = r1.m13681d()
            int r1 = -r1
            r0.f26824f = r1
            goto L159
        L108:
            w.f r0 = r10.f26855b
            w.d[] r0 = r0.f26124N
            r0 = r0[r5]
            x.f r0 = r10.m14005h(r0)
            if (r0 == 0) goto L12c
            x.f r1 = r10.f26861h
            w.f r2 = r10.f26855b
            w.d[] r2 = r2.f26124N
            r2 = r2[r5]
            int r2 = r2.m13681d()
            java.util.List<x.f> r3 = r1.f26830l
            r3.add(r0)
            r1.f26824f = r2
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
        L12c:
            w.f r0 = r10.f26855b
            w.d[] r0 = r0.f26124N
            r0 = r0[r6]
            x.f r0 = r10.m14005h(r0)
            if (r0 == 0) goto L151
            x.f r1 = r10.f26862i
            w.f r2 = r10.f26855b
            w.d[] r2 = r2.f26124N
            r2 = r2[r6]
            int r2 = r2.m13681d()
            int r2 = -r2
            java.util.List<x.f> r3 = r1.f26830l
            r3.add(r0)
            r1.f26824f = r2
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
        L151:
            x.f r0 = r10.f26861h
            r0.f26820b = r4
            x.f r0 = r10.f26862i
            r0.f26820b = r4
        L159:
            w.f r0 = r10.f26855b
            boolean r1 = r0.f26104A
            if (r1 == 0) goto L43a
            goto L197
        L160:
            r1 = r0[r5]
            w.d r1 = r1.f26091f
            if (r1 == 0) goto L19d
            r0 = r0[r5]
            x.f r0 = r10.m14005h(r0)
            if (r0 == 0) goto L43a
            x.f r1 = r10.f26861h
            w.f r2 = r10.f26855b
            w.d[] r2 = r2.f26124N
            r2 = r2[r5]
            int r2 = r2.m13681d()
            java.util.List<x.f> r3 = r1.f26830l
            r3.add(r0)
            r1.f26824f = r2
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
            x.f r0 = r10.f26862i
            x.f r1 = r10.f26861h
            x.g r2 = r10.f26858e
            int r2 = r2.f26825g
            r10.m14002b(r0, r1, r2)
            w.f r0 = r10.f26855b
            boolean r1 = r0.f26104A
            if (r1 == 0) goto L43a
        L197:
            x.f r1 = r10.f26846k
            x.f r2 = r10.f26861h
            goto L242
        L19d:
            r1 = r0[r6]
            w.d r1 = r1.f26091f
            if (r1 == 0) goto L1d7
            r0 = r0[r6]
            x.f r0 = r10.m14005h(r0)
            if (r0 == 0) goto L1d0
            x.f r1 = r10.f26862i
            w.f r2 = r10.f26855b
            w.d[] r2 = r2.f26124N
            r2 = r2[r6]
            int r2 = r2.m13681d()
            int r2 = -r2
            java.util.List<x.f> r3 = r1.f26830l
            r3.add(r0)
            r1.f26824f = r2
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
            x.f r0 = r10.f26861h
            x.f r1 = r10.f26862i
            x.g r2 = r10.f26858e
            int r2 = r2.f26825g
            int r2 = -r2
            r10.m14002b(r0, r1, r2)
        L1d0:
            w.f r0 = r10.f26855b
            boolean r1 = r0.f26104A
            if (r1 == 0) goto L43a
            goto L197
        L1d7:
            r1 = r0[r7]
            w.d r1 = r1.f26091f
            if (r1 == 0) goto L20c
            r0 = r0[r7]
            x.f r0 = r10.m14005h(r0)
            if (r0 == 0) goto L43a
            x.f r1 = r10.f26846k
            java.util.List<x.f> r2 = r1.f26830l
            r2.add(r0)
            r1.f26824f = r3
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
            x.f r0 = r10.f26861h
            x.f r1 = r10.f26846k
            w.f r2 = r10.f26855b
            int r2 = r2.f26142c0
            int r2 = -r2
            r10.m14002b(r0, r1, r2)
            x.f r0 = r10.f26862i
            x.f r1 = r10.f26861h
            x.g r2 = r10.f26858e
            int r2 = r2.f26825g
            r10.m14002b(r0, r1, r2)
            goto L43a
        L20c:
            boolean r0 = r8 instanceof p381w.InterfaceC6769j
            if (r0 != 0) goto L43a
            w.f r0 = r8.f26128R
            if (r0 == 0) goto L43a
            w.d$a r0 = p381w.C6763d.a.f26100d0
            w.d r0 = r8.mo13712l(r0)
            w.d r0 = r0.f26091f
            if (r0 != 0) goto L43a
            w.f r0 = r10.f26855b
            w.f r1 = r0.f26128R
            x.n r1 = r1.f26145e
            x.f r1 = r1.f26861h
            x.f r2 = r10.f26861h
            int r0 = r0.m13723w()
            r10.m14002b(r2, r1, r0)
            x.f r0 = r10.f26862i
            x.f r1 = r10.f26861h
            x.g r2 = r10.f26858e
            int r2 = r2.f26825g
            r10.m14002b(r0, r1, r2)
            w.f r0 = r10.f26855b
            boolean r1 = r0.f26104A
            if (r1 == 0) goto L43a
            goto L197
        L242:
            int r0 = r0.f26142c0
            r10.m14002b(r1, r2, r0)
            goto L43a
        L249:
            if (r1 != 0) goto L29d
            w.f$a r1 = r10.f26857d
            if (r1 != r2) goto L29d
            w.f r1 = r10.f26855b
            int r8 = r1.f26161m
            if (r8 == r5) goto L273
            if (r8 == r6) goto L258
            goto L2a9
        L258:
            boolean r0 = r1.m13691A()
            if (r0 != 0) goto L2a9
            w.f r0 = r10.f26855b
            int r1 = r0.f26159l
            if (r1 != r6) goto L265
            goto L2a9
        L265:
            x.l r0 = r0.f26143d
            x.g r0 = r0.f26858e
            x.g r1 = r10.f26858e
            java.util.List<x.f> r1 = r1.f26830l
            r1.add(r0)
            java.util.List<x.d> r0 = r0.f26829k
            goto L283
        L273:
            w.f r1 = r1.f26128R
            if (r1 != 0) goto L278
            goto L2a9
        L278:
            x.n r1 = r1.f26145e
            x.g r1 = r1.f26858e
            java.util.List<x.f> r0 = r0.f26830l
            r0.add(r1)
            java.util.List<x.d> r0 = r1.f26829k
        L283:
            x.g r1 = r10.f26858e
            r0.add(r1)
            x.g r0 = r10.f26858e
            r0.f26820b = r4
            java.util.List<x.d> r0 = r0.f26829k
            x.f r1 = r10.f26861h
            r0.add(r1)
            x.g r0 = r10.f26858e
            java.util.List<x.d> r0 = r0.f26829k
            x.f r1 = r10.f26862i
            r0.add(r1)
            goto L2a9
        L29d:
            java.util.List<x.d> r1 = r0.f26829k
            r1.add(r10)
            boolean r0 = r0.f26828j
            if (r0 == 0) goto L2a9
            r10.mo13964a(r10)
        L2a9:
            w.f r0 = r10.f26855b
            w.d[] r1 = r0.f26124N
            r8 = r1[r5]
            w.d r8 = r8.f26091f
            if (r8 == 0) goto L313
            r8 = r1[r6]
            w.d r8 = r8.f26091f
            if (r8 == 0) goto L313
            boolean r0 = r0.m13691A()
            if (r0 == 0) goto L2dd
            x.f r0 = r10.f26861h
            w.f r1 = r10.f26855b
            w.d[] r1 = r1.f26124N
            r1 = r1[r5]
            int r1 = r1.m13681d()
            r0.f26824f = r1
            x.f r0 = r10.f26862i
            w.f r1 = r10.f26855b
            w.d[] r1 = r1.f26124N
            r1 = r1[r6]
            int r1 = r1.m13681d()
            int r1 = -r1
            r0.f26824f = r1
            goto L30b
        L2dd:
            w.f r0 = r10.f26855b
            w.d[] r0 = r0.f26124N
            r0 = r0[r5]
            x.f r0 = r10.m14005h(r0)
            w.f r1 = r10.f26855b
            w.d[] r1 = r1.f26124N
            r1 = r1[r6]
            x.f r1 = r10.m14005h(r1)
            java.util.List<x.d> r2 = r0.f26829k
            r2.add(r10)
            boolean r0 = r0.f26828j
            if (r0 == 0) goto L2fd
            r10.mo13964a(r10)
        L2fd:
            java.util.List<x.d> r0 = r1.f26829k
            r0.add(r10)
            boolean r0 = r1.f26828j
            if (r0 == 0) goto L309
            r10.mo13964a(r10)
        L309:
            r10.f26863j = r7
        L30b:
            w.f r0 = r10.f26855b
            boolean r0 = r0.f26104A
            if (r0 == 0) goto L42c
            goto L39d
        L313:
            r8 = r1[r5]
            w.d r8 = r8.f26091f
            r9 = 0
            if (r8 == 0) goto L366
            r0 = r1[r5]
            x.f r0 = r10.m14005h(r0)
            if (r0 == 0) goto L42c
            x.f r1 = r10.f26861h
            w.f r3 = r10.f26855b
            w.d[] r3 = r3.f26124N
            r3 = r3[r5]
            int r3 = r3.m13681d()
            java.util.List<x.f> r5 = r1.f26830l
            r5.add(r0)
            r1.f26824f = r3
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
            x.f r0 = r10.f26862i
            x.f r1 = r10.f26861h
            x.g r3 = r10.f26858e
            r10.m14003c(r0, r1, r4, r3)
            w.f r0 = r10.f26855b
            boolean r0 = r0.f26104A
            if (r0 == 0) goto L352
            x.f r0 = r10.f26846k
            x.f r1 = r10.f26861h
            x.g r3 = r10.f26847l
            r10.m14003c(r0, r1, r4, r3)
        L352:
            w.f$a r0 = r10.f26857d
            if (r0 != r2) goto L42c
            w.f r0 = r10.f26855b
            float r1 = r0.f26131U
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 <= 0) goto L42c
            x.l r0 = r0.f26143d
            w.f$a r1 = r0.f26857d
            if (r1 != r2) goto L42c
            goto L412
        L366:
            r5 = r1[r6]
            w.d r5 = r5.f26091f
            r8 = -1
            if (r5 == 0) goto L3a4
            r0 = r1[r6]
            x.f r0 = r10.m14005h(r0)
            if (r0 == 0) goto L42c
            x.f r1 = r10.f26862i
            w.f r2 = r10.f26855b
            w.d[] r2 = r2.f26124N
            r2 = r2[r6]
            int r2 = r2.m13681d()
            int r2 = -r2
            java.util.List<x.f> r3 = r1.f26830l
            r3.add(r0)
            r1.f26824f = r2
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
            x.f r0 = r10.f26861h
            x.f r1 = r10.f26862i
            x.g r2 = r10.f26858e
            r10.m14003c(r0, r1, r8, r2)
            w.f r0 = r10.f26855b
            boolean r0 = r0.f26104A
            if (r0 == 0) goto L42c
        L39d:
            x.f r0 = r10.f26846k
            x.f r1 = r10.f26861h
            x.g r2 = r10.f26847l
            goto L3cf
        L3a4:
            r5 = r1[r7]
            w.d r5 = r5.f26091f
            if (r5 == 0) goto L3d3
            r0 = r1[r7]
            x.f r0 = r10.m14005h(r0)
            if (r0 == 0) goto L42c
            x.f r1 = r10.f26846k
            java.util.List<x.f> r2 = r1.f26830l
            r2.add(r0)
            r1.f26824f = r3
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
            x.f r0 = r10.f26861h
            x.f r1 = r10.f26846k
            x.g r2 = r10.f26847l
            r10.m14003c(r0, r1, r8, r2)
            x.f r0 = r10.f26862i
            x.f r1 = r10.f26861h
            x.g r2 = r10.f26858e
        L3cf:
            r10.m14003c(r0, r1, r4, r2)
            goto L42c
        L3d3:
            boolean r1 = r0 instanceof p381w.InterfaceC6769j
            if (r1 != 0) goto L42c
            w.f r1 = r0.f26128R
            if (r1 == 0) goto L42c
            x.n r1 = r1.f26145e
            x.f r1 = r1.f26861h
            x.f r3 = r10.f26861h
            int r0 = r0.m13723w()
            r10.m14002b(r3, r1, r0)
            x.f r0 = r10.f26862i
            x.f r1 = r10.f26861h
            x.g r3 = r10.f26858e
            r10.m14003c(r0, r1, r4, r3)
            w.f r0 = r10.f26855b
            boolean r0 = r0.f26104A
            if (r0 == 0) goto L400
            x.f r0 = r10.f26846k
            x.f r1 = r10.f26861h
            x.g r3 = r10.f26847l
            r10.m14003c(r0, r1, r4, r3)
        L400:
            w.f$a r0 = r10.f26857d
            if (r0 != r2) goto L42c
            w.f r0 = r10.f26855b
            float r1 = r0.f26131U
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 <= 0) goto L42c
            x.l r0 = r0.f26143d
            w.f$a r1 = r0.f26857d
            if (r1 != r2) goto L42c
        L412:
            x.g r0 = r0.f26858e
            java.util.List<x.d> r0 = r0.f26829k
            x.g r1 = r10.f26858e
            r0.add(r1)
            x.g r0 = r10.f26858e
            java.util.List<x.f> r0 = r0.f26830l
            w.f r1 = r10.f26855b
            x.l r1 = r1.f26143d
            x.g r1 = r1.f26858e
            r0.add(r1)
            x.g r0 = r10.f26858e
            r0.f26819a = r10
        L42c:
            x.g r0 = r10.f26858e
            java.util.List<x.f> r0 = r0.f26830l
            int r0 = r0.size()
            if (r0 != 0) goto L43a
            x.g r0 = r10.f26858e
            r0.f26821c = r4
        L43a:
            return
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: e */
    public void mo13966e() {
            r2 = this;
            x.f r0 = r2.f26861h
            boolean r1 = r0.f26828j
            if (r1 == 0) goto Lc
            w.f r1 = r2.f26855b
            int r0 = r0.f26825g
            r1.f26134X = r0
        Lc:
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
            x.f r0 = r1.f26862i
            r0.m13979b()
            x.f r0 = r1.f26846k
            r0.m13979b()
            x.g r0 = r1.f26858e
            r0.m13979b()
            r0 = 0
            r1.f26860g = r0
            return
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: k */
    public boolean mo13969k() {
            r3 = this;
            w.f$a r0 = r3.f26857d
            w.f$a r1 = p381w.C6765f.a.f26191a0
            r2 = 1
            if (r0 != r1) goto L10
            w.f r0 = r3.f26855b
            int r0 = r0.f26161m
            if (r0 != 0) goto Le
            return r2
        Le:
            r0 = 0
            return r0
        L10:
            return r2
    }

    /* renamed from: m */
    public void m13997m() {
            r2 = this;
            r0 = 0
            r2.f26860g = r0
            x.f r1 = r2.f26861h
            r1.m13979b()
            x.f r1 = r2.f26861h
            r1.f26828j = r0
            x.f r1 = r2.f26862i
            r1.m13979b()
            x.f r1 = r2.f26862i
            r1.f26828j = r0
            x.f r1 = r2.f26846k
            r1.m13979b()
            x.f r1 = r2.f26846k
            r1.f26828j = r0
            x.g r1 = r2.f26858e
            r1.f26828j = r0
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "VerticalRun "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            w.f r1 = r2.f26855b
            java.lang.String r1 = r1.f26158k0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

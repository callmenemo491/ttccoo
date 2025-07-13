package p401x;

/* renamed from: x.l */
/* loaded from: classes.dex */
public class C6904l extends p401x.AbstractC6908p {

    /* renamed from: k */
    public static int[] f26842k;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            p401x.C6904l.f26842k = r0
            return
    }

    public C6904l(p381w.C6765f r2) {
            r1 = this;
            r1.<init>(r2)
            x.f r2 = r1.f26861h
            x.f$a r0 = p401x.C6898f.a.f26834b0
            r2.f26823e = r0
            x.f r2 = r1.f26862i
            x.f$a r0 = p401x.C6898f.a.f26835c0
            r2.f26823e = r0
            r2 = 0
            r1.f26859f = r2
            return
    }

    @Override // p401x.AbstractC6908p, p401x.InterfaceC6896d
    /* renamed from: a */
    public void mo13964a(p401x.InterfaceC6896d r19) {
            r18 = this;
            r8 = r18
            w.f$a r9 = p381w.C6765f.a.f26191a0
            int r0 = r8.f26863j
            int r0 = p365v.C6480g.m13148b(r0)
            r10 = 0
            r1 = 3
            if (r0 == r1) goto L3c0
            x.g r0 = r8.f26858e
            boolean r2 = r0.f26828j
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            if (r2 != 0) goto L2a6
            w.f$a r2 = r8.f26857d
            if (r2 != r9) goto L2a6
            w.f r2 = r8.f26855b
            int r3 = r2.f26159l
            r4 = 2
            if (r3 == r4) goto L28e
            if (r3 == r1) goto L26
            goto L2a6
        L26:
            int r3 = r2.f26161m
            r4 = -1
            if (r3 == 0) goto L52
            if (r3 != r1) goto L2e
            goto L52
        L2e:
            int r1 = r2.f26132V
            if (r1 == r4) goto L45
            if (r1 == 0) goto L39
            if (r1 == r12) goto L45
            r1 = 0
            goto L2a3
        L39:
            x.n r1 = r2.f26145e
            x.g r1 = r1.f26858e
            int r1 = r1.f26825g
            float r1 = (float) r1
            float r2 = r2.f26131U
            float r1 = r1 / r2
            goto L2a1
        L45:
            x.n r1 = r2.f26145e
            x.g r1 = r1.f26858e
            int r1 = r1.f26825g
            float r1 = (float) r1
            float r2 = r2.f26131U
            float r1 = r1 * r2
            goto L2a1
        L52:
            x.n r0 = r2.f26145e
            x.f r13 = r0.f26861h
            x.f r14 = r0.f26862i
            w.d r0 = r2.f26114F
            w.d r0 = r0.f26091f
            if (r0 == 0) goto L60
            r0 = 1
            goto L61
        L60:
            r0 = 0
        L61:
            w.d r1 = r2.f26116G
            w.d r1 = r1.f26091f
            if (r1 == 0) goto L69
            r1 = 1
            goto L6a
        L69:
            r1 = 0
        L6a:
            w.d r3 = r2.f26118H
            w.d r3 = r3.f26091f
            if (r3 == 0) goto L72
            r3 = 1
            goto L73
        L72:
            r3 = 0
        L73:
            w.d r5 = r2.f26119I
            w.d r5 = r5.f26091f
            if (r5 == 0) goto L7b
            r5 = 1
            goto L7c
        L7b:
            r5 = 0
        L7c:
            int r15 = r2.f26132V
            if (r0 == 0) goto L1b7
            if (r1 == 0) goto L1b7
            if (r3 == 0) goto L1b7
            if (r5 == 0) goto L1b7
            float r7 = r2.f26131U
            boolean r0 = r13.f26828j
            if (r0 == 0) goto Le8
            boolean r0 = r14.f26828j
            if (r0 == 0) goto Le8
            x.f r0 = r8.f26861h
            boolean r1 = r0.f26821c
            if (r1 == 0) goto Le7
            x.f r1 = r8.f26862i
            boolean r1 = r1.f26821c
            if (r1 != 0) goto L9d
            goto Le7
        L9d:
            java.util.List<x.f> r0 = r0.f26830l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p401x.C6898f) r0
            int r0 = r0.f26825g
            x.f r1 = r8.f26861h
            int r1 = r1.f26824f
            int r2 = r0 + r1
            x.f r0 = r8.f26862i
            java.util.List<x.f> r0 = r0.f26830l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p401x.C6898f) r0
            int r0 = r0.f26825g
            x.f r1 = r8.f26862i
            int r1 = r1.f26824f
            int r3 = r0 - r1
            int r0 = r13.f26825g
            int r1 = r13.f26824f
            int r4 = r0 + r1
            int r0 = r14.f26825g
            int r1 = r14.f26824f
            int r5 = r0 - r1
            int[] r9 = p401x.C6904l.f26842k
            r0 = r18
            r1 = r9
            r6 = r7
            r7 = r15
            r0.m13993m(r1, r2, r3, r4, r5, r6, r7)
            x.g r0 = r8.f26858e
            r1 = r9[r10]
            r0.mo13980c(r1)
            w.f r0 = r8.f26855b
            x.n r0 = r0.f26145e
            x.g r0 = r0.f26858e
            r1 = r9[r12]
            r0.mo13980c(r1)
        Le7:
            return
        Le8:
            x.f r0 = r8.f26861h
            boolean r1 = r0.f26828j
            if (r1 == 0) goto L145
            x.f r1 = r8.f26862i
            boolean r2 = r1.f26828j
            if (r2 == 0) goto L145
            boolean r2 = r13.f26821c
            if (r2 == 0) goto L144
            boolean r2 = r14.f26821c
            if (r2 != 0) goto Lfd
            goto L144
        Lfd:
            int r2 = r0.f26825g
            int r0 = r0.f26824f
            int r2 = r2 + r0
            int r0 = r1.f26825g
            int r1 = r1.f26824f
            int r3 = r0 - r1
            java.util.List<x.f> r0 = r13.f26830l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p401x.C6898f) r0
            int r0 = r0.f26825g
            int r1 = r13.f26824f
            int r4 = r0 + r1
            java.util.List<x.f> r0 = r14.f26830l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p401x.C6898f) r0
            int r0 = r0.f26825g
            int r1 = r14.f26824f
            int r5 = r0 - r1
            int[] r16 = p401x.C6904l.f26842k
            r0 = r18
            r1 = r16
            r6 = r7
            r17 = r7
            r7 = r15
            r0.m13993m(r1, r2, r3, r4, r5, r6, r7)
            x.g r0 = r8.f26858e
            r1 = r16[r10]
            r0.mo13980c(r1)
            w.f r0 = r8.f26855b
            x.n r0 = r0.f26145e
            x.g r0 = r0.f26858e
            r1 = r16[r12]
            r0.mo13980c(r1)
            goto L147
        L144:
            return
        L145:
            r17 = r7
        L147:
            x.f r0 = r8.f26861h
            boolean r1 = r0.f26821c
            if (r1 == 0) goto L1b6
            x.f r1 = r8.f26862i
            boolean r1 = r1.f26821c
            if (r1 == 0) goto L1b6
            boolean r1 = r13.f26821c
            if (r1 == 0) goto L1b6
            boolean r1 = r14.f26821c
            if (r1 != 0) goto L15c
            goto L1b6
        L15c:
            java.util.List<x.f> r0 = r0.f26830l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p401x.C6898f) r0
            int r0 = r0.f26825g
            x.f r1 = r8.f26861h
            int r1 = r1.f26824f
            int r2 = r0 + r1
            x.f r0 = r8.f26862i
            java.util.List<x.f> r0 = r0.f26830l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p401x.C6898f) r0
            int r0 = r0.f26825g
            x.f r1 = r8.f26862i
            int r1 = r1.f26824f
            int r3 = r0 - r1
            java.util.List<x.f> r0 = r13.f26830l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p401x.C6898f) r0
            int r0 = r0.f26825g
            int r1 = r13.f26824f
            int r4 = r0 + r1
            java.util.List<x.f> r0 = r14.f26830l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p401x.C6898f) r0
            int r0 = r0.f26825g
            int r1 = r14.f26824f
            int r5 = r0 - r1
            int[] r13 = p401x.C6904l.f26842k
            r0 = r18
            r1 = r13
            r6 = r17
            r7 = r15
            r0.m13993m(r1, r2, r3, r4, r5, r6, r7)
            x.g r0 = r8.f26858e
            r1 = r13[r10]
            r0.mo13980c(r1)
            w.f r0 = r8.f26855b
            x.n r0 = r0.f26145e
            x.g r0 = r0.f26858e
            r1 = r13[r12]
            goto L2a3
        L1b6:
            return
        L1b7:
            if (r0 == 0) goto L22a
            if (r3 == 0) goto L22a
            x.f r0 = r8.f26861h
            boolean r1 = r0.f26821c
            if (r1 == 0) goto L229
            x.f r1 = r8.f26862i
            boolean r1 = r1.f26821c
            if (r1 != 0) goto L1c8
            goto L229
        L1c8:
            float r1 = r2.f26131U
            java.util.List<x.f> r0 = r0.f26830l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p401x.C6898f) r0
            int r0 = r0.f26825g
            x.f r2 = r8.f26861h
            int r2 = r2.f26824f
            int r0 = r0 + r2
            x.f r2 = r8.f26862i
            java.util.List<x.f> r2 = r2.f26830l
            java.lang.Object r2 = r2.get(r10)
            x.f r2 = (p401x.C6898f) r2
            int r2 = r2.f26825g
            x.f r3 = r8.f26862i
            int r3 = r3.f26824f
            int r2 = r2 - r3
            if (r15 == r4) goto L205
            if (r15 == 0) goto L205
            if (r15 == r12) goto L1f2
            goto L2a6
        L1f2:
            int r2 = r2 - r0
            int r0 = r8.m14004g(r2, r10)
            float r2 = (float) r0
            float r2 = r2 / r1
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.m14004g(r2, r12)
            if (r2 == r3) goto L219
            float r0 = (float) r3
            float r0 = r0 * r1
            goto L217
        L205:
            int r2 = r2 - r0
            int r0 = r8.m14004g(r2, r10)
            float r2 = (float) r0
            float r2 = r2 * r1
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.m14004g(r2, r12)
            if (r2 == r3) goto L219
            float r0 = (float) r3
            float r0 = r0 / r1
        L217:
            float r0 = r0 + r11
            int r0 = (int) r0
        L219:
            x.g r1 = r8.f26858e
            r1.mo13980c(r0)
            w.f r0 = r8.f26855b
            x.n r0 = r0.f26145e
            x.g r0 = r0.f26858e
            r0.mo13980c(r3)
            goto L2a6
        L229:
            return
        L22a:
            if (r1 == 0) goto L2a6
            if (r5 == 0) goto L2a6
            boolean r0 = r13.f26821c
            if (r0 == 0) goto L28d
            boolean r0 = r14.f26821c
            if (r0 != 0) goto L237
            goto L28d
        L237:
            float r0 = r2.f26131U
            java.util.List<x.f> r1 = r13.f26830l
            java.lang.Object r1 = r1.get(r10)
            x.f r1 = (p401x.C6898f) r1
            int r1 = r1.f26825g
            int r2 = r13.f26824f
            int r1 = r1 + r2
            java.util.List<x.f> r2 = r14.f26830l
            java.lang.Object r2 = r2.get(r10)
            x.f r2 = (p401x.C6898f) r2
            int r2 = r2.f26825g
            int r3 = r14.f26824f
            int r2 = r2 - r3
            if (r15 == r4) goto L26d
            if (r15 == 0) goto L25a
            if (r15 == r12) goto L26d
            goto L2a6
        L25a:
            int r2 = r2 - r1
            int r1 = r8.m14004g(r2, r12)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.m14004g(r2, r10)
            if (r2 == r3) goto L281
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L27f
        L26d:
            int r2 = r2 - r1
            int r1 = r8.m14004g(r2, r12)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.m14004g(r2, r10)
            if (r2 == r3) goto L281
            float r1 = (float) r3
            float r1 = r1 * r0
        L27f:
            float r1 = r1 + r11
            int r1 = (int) r1
        L281:
            x.g r0 = r8.f26858e
            r0.mo13980c(r3)
            w.f r0 = r8.f26855b
            x.n r0 = r0.f26145e
            x.g r0 = r0.f26858e
            goto L2a3
        L28d:
            return
        L28e:
            w.f r1 = r2.f26128R
            if (r1 == 0) goto L2a6
            x.l r1 = r1.f26143d
            x.g r1 = r1.f26858e
            boolean r3 = r1.f26828j
            if (r3 == 0) goto L2a6
            float r2 = r2.f26169q
            int r1 = r1.f26825g
            float r1 = (float) r1
            float r1 = r1 * r2
        L2a1:
            float r1 = r1 + r11
            int r1 = (int) r1
        L2a3:
            r0.mo13980c(r1)
        L2a6:
            x.f r0 = r8.f26861h
            boolean r1 = r0.f26821c
            if (r1 == 0) goto L3bf
            x.f r1 = r8.f26862i
            boolean r2 = r1.f26821c
            if (r2 != 0) goto L2b4
            goto L3bf
        L2b4:
            boolean r0 = r0.f26828j
            if (r0 == 0) goto L2c3
            boolean r0 = r1.f26828j
            if (r0 == 0) goto L2c3
            x.g r0 = r8.f26858e
            boolean r0 = r0.f26828j
            if (r0 == 0) goto L2c3
            return
        L2c3:
            x.g r0 = r8.f26858e
            boolean r0 = r0.f26828j
            if (r0 != 0) goto L30b
            w.f$a r0 = r8.f26857d
            if (r0 != r9) goto L30b
            w.f r0 = r8.f26855b
            int r1 = r0.f26159l
            if (r1 != 0) goto L30b
            boolean r0 = r0.m13726z()
            if (r0 != 0) goto L30b
            x.f r0 = r8.f26861h
            java.util.List<x.f> r0 = r0.f26830l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p401x.C6898f) r0
            x.f r1 = r8.f26862i
            java.util.List<x.f> r1 = r1.f26830l
            java.lang.Object r1 = r1.get(r10)
            x.f r1 = (p401x.C6898f) r1
            int r0 = r0.f26825g
            x.f r2 = r8.f26861h
            int r3 = r2.f26824f
            int r0 = r0 + r3
            int r1 = r1.f26825g
            x.f r3 = r8.f26862i
            int r3 = r3.f26824f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo13980c(r0)
            x.f r0 = r8.f26862i
            r0.mo13980c(r1)
            x.g r0 = r8.f26858e
            r0.mo13980c(r3)
            return
        L30b:
            x.g r0 = r8.f26858e
            boolean r0 = r0.f26828j
            if (r0 != 0) goto L36d
            w.f$a r0 = r8.f26857d
            if (r0 != r9) goto L36d
            int r0 = r8.f26854a
            if (r0 != r12) goto L36d
            x.f r0 = r8.f26861h
            java.util.List<x.f> r0 = r0.f26830l
            int r0 = r0.size()
            if (r0 <= 0) goto L36d
            x.f r0 = r8.f26862i
            java.util.List<x.f> r0 = r0.f26830l
            int r0 = r0.size()
            if (r0 <= 0) goto L36d
            x.f r0 = r8.f26861h
            java.util.List<x.f> r0 = r0.f26830l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p401x.C6898f) r0
            x.f r1 = r8.f26862i
            java.util.List<x.f> r1 = r1.f26830l
            java.lang.Object r1 = r1.get(r10)
            x.f r1 = (p401x.C6898f) r1
            int r0 = r0.f26825g
            x.f r2 = r8.f26861h
            int r2 = r2.f26824f
            int r0 = r0 + r2
            int r1 = r1.f26825g
            x.f r2 = r8.f26862i
            int r2 = r2.f26824f
            int r1 = r1 + r2
            int r1 = r1 - r0
            x.g r0 = r8.f26858e
            int r0 = r0.f26840m
            int r0 = java.lang.Math.min(r1, r0)
            w.f r1 = r8.f26855b
            int r2 = r1.f26167p
            int r1 = r1.f26165o
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L368
            int r0 = java.lang.Math.min(r2, r0)
        L368:
            x.g r1 = r8.f26858e
            r1.mo13980c(r0)
        L36d:
            x.g r0 = r8.f26858e
            boolean r0 = r0.f26828j
            if (r0 != 0) goto L374
            return
        L374:
            x.f r0 = r8.f26861h
            java.util.List<x.f> r0 = r0.f26830l
            java.lang.Object r0 = r0.get(r10)
            x.f r0 = (p401x.C6898f) r0
            x.f r1 = r8.f26862i
            java.util.List<x.f> r1 = r1.f26830l
            java.lang.Object r1 = r1.get(r10)
            x.f r1 = (p401x.C6898f) r1
            int r2 = r0.f26825g
            x.f r3 = r8.f26861h
            int r4 = r3.f26824f
            int r4 = r4 + r2
            int r5 = r1.f26825g
            x.f r6 = r8.f26862i
            int r6 = r6.f26824f
            int r6 = r6 + r5
            w.f r7 = r8.f26855b
            float r7 = r7.f26148f0
            if (r0 != r1) goto L39f
            r7 = 1056964608(0x3f000000, float:0.5)
            goto L3a1
        L39f:
            r2 = r4
            r5 = r6
        L3a1:
            int r5 = r5 - r2
            x.g r0 = r8.f26858e
            int r0 = r0.f26825g
            int r5 = r5 - r0
            float r0 = (float) r2
            float r0 = r0 + r11
            float r1 = (float) r5
            float r1 = r1 * r7
            float r1 = r1 + r0
            int r0 = (int) r1
            r3.mo13980c(r0)
            x.f r0 = r8.f26862i
            x.f r1 = r8.f26861h
            int r1 = r1.f26825g
            x.g r2 = r8.f26858e
            int r2 = r2.f26825g
            int r1 = r1 + r2
            r0.mo13980c(r1)
        L3bf:
            return
        L3c0:
            w.f r0 = r8.f26855b
            w.d r1 = r0.f26114F
            w.d r0 = r0.f26118H
            r8.m14007l(r1, r0, r10)
            return
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: d */
    public void mo13965d() {
            r6 = this;
            w.f$a r0 = p381w.C6765f.a.f26191a0
            w.f$a r1 = p381w.C6765f.a.f26192b0
            w.f$a r2 = p381w.C6765f.a.f26189Y
            w.f r3 = r6.f26855b
            boolean r4 = r3.f26137a
            if (r4 == 0) goto L15
            x.g r4 = r6.f26858e
            int r3 = r3.m13721u()
            r4.mo13980c(r3)
        L15:
            x.g r3 = r6.f26858e
            boolean r3 = r3.f26828j
            if (r3 != 0) goto L88
            w.f r3 = r6.f26855b
            w.f$a r3 = r3.m13716p()
            r6.f26857d = r3
            if (r3 == r0) goto Lc2
            if (r3 != r1) goto L78
            w.f r3 = r6.f26855b
            w.f r3 = r3.f26128R
            if (r3 == 0) goto L33
            w.f$a r4 = r3.m13716p()
            if (r4 == r2) goto L39
        L33:
            w.f$a r4 = r3.m13716p()
            if (r4 != r1) goto L78
        L39:
            int r0 = r3.m13721u()
            w.f r1 = r6.f26855b
            w.d r1 = r1.f26114F
            int r1 = r1.m13681d()
            int r0 = r0 - r1
            w.f r1 = r6.f26855b
            w.d r1 = r1.f26118H
            int r1 = r1.m13681d()
            int r0 = r0 - r1
            x.f r1 = r6.f26861h
            x.l r2 = r3.f26143d
            x.f r2 = r2.f26861h
            w.f r4 = r6.f26855b
            w.d r4 = r4.f26114F
            int r4 = r4.m13681d()
            r6.m14002b(r1, r2, r4)
            x.f r1 = r6.f26862i
            x.l r2 = r3.f26143d
            x.f r2 = r2.f26862i
            w.f r3 = r6.f26855b
            w.d r3 = r3.f26118H
            int r3 = r3.m13681d()
            int r3 = -r3
            r6.m14002b(r1, r2, r3)
            x.g r1 = r6.f26858e
            r1.mo13980c(r0)
            return
        L78:
            w.f$a r1 = r6.f26857d
            if (r1 != r2) goto Lc2
            x.g r1 = r6.f26858e
            w.f r2 = r6.f26855b
            int r2 = r2.m13721u()
            r1.mo13980c(r2)
            goto Lc2
        L88:
            w.f$a r3 = r6.f26857d
            if (r3 != r1) goto Lc2
            w.f r3 = r6.f26855b
            w.f r3 = r3.f26128R
            if (r3 == 0) goto L98
            w.f$a r4 = r3.m13716p()
            if (r4 == r2) goto L9e
        L98:
            w.f$a r2 = r3.m13716p()
            if (r2 != r1) goto Lc2
        L9e:
            x.f r0 = r6.f26861h
            x.l r1 = r3.f26143d
            x.f r1 = r1.f26861h
            w.f r2 = r6.f26855b
            w.d r2 = r2.f26114F
            int r2 = r2.m13681d()
            r6.m14002b(r0, r1, r2)
            x.f r0 = r6.f26862i
            x.l r1 = r3.f26143d
            x.f r1 = r1.f26862i
            w.f r2 = r6.f26855b
            w.d r2 = r2.f26118H
            int r2 = r2.m13681d()
            int r2 = -r2
            r6.m14002b(r0, r1, r2)
            return
        Lc2:
            x.g r1 = r6.f26858e
            boolean r2 = r1.f26828j
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1d7
            w.f r2 = r6.f26855b
            boolean r5 = r2.f26137a
            if (r5 == 0) goto L1d7
            w.d[] r0 = r2.f26124N
            r1 = r0[r3]
            w.d r1 = r1.f26091f
            if (r1 == 0) goto L14f
            r1 = r0[r4]
            w.d r1 = r1.f26091f
            if (r1 == 0) goto L14f
            boolean r0 = r2.m13726z()
            if (r0 == 0) goto Lfc
            x.f r0 = r6.f26861h
            w.f r1 = r6.f26855b
            w.d[] r1 = r1.f26124N
            r1 = r1[r3]
            int r1 = r1.m13681d()
            r0.f26824f = r1
            x.f r0 = r6.f26862i
            w.f r1 = r6.f26855b
            w.d[] r1 = r1.f26124N
            r1 = r1[r4]
            goto L31e
        Lfc:
            w.f r0 = r6.f26855b
            w.d[] r0 = r0.f26124N
            r0 = r0[r3]
            x.f r0 = r6.m14005h(r0)
            if (r0 == 0) goto L120
            x.f r1 = r6.f26861h
            w.f r2 = r6.f26855b
            w.d[] r2 = r2.f26124N
            r2 = r2[r3]
            int r2 = r2.m13681d()
            java.util.List<x.f> r3 = r1.f26830l
            r3.add(r0)
            r1.f26824f = r2
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
        L120:
            w.f r0 = r6.f26855b
            w.d[] r0 = r0.f26124N
            r0 = r0[r4]
            x.f r0 = r6.m14005h(r0)
            if (r0 == 0) goto L145
            x.f r1 = r6.f26862i
            w.f r2 = r6.f26855b
            w.d[] r2 = r2.f26124N
            r2 = r2[r4]
            int r2 = r2.m13681d()
            int r2 = -r2
            java.util.List<x.f> r3 = r1.f26830l
            r3.add(r0)
            r1.f26824f = r2
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
        L145:
            x.f r0 = r6.f26861h
            r0.f26820b = r4
            x.f r0 = r6.f26862i
            r0.f26820b = r4
            goto L3cf
        L14f:
            r1 = r0[r3]
            w.d r1 = r1.f26091f
            if (r1 == 0) goto L176
            r0 = r0[r3]
            x.f r0 = r6.m14005h(r0)
            if (r0 == 0) goto L3cf
            x.f r1 = r6.f26861h
            w.f r2 = r6.f26855b
            w.d[] r2 = r2.f26124N
            r2 = r2[r3]
            int r2 = r2.m13681d()
            java.util.List<x.f> r3 = r1.f26830l
            r3.add(r0)
            r1.f26824f = r2
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
            goto L1ca
        L176:
            r1 = r0[r4]
            w.d r1 = r1.f26091f
            if (r1 == 0) goto L1a7
            r0 = r0[r4]
            x.f r0 = r6.m14005h(r0)
            if (r0 == 0) goto L3cf
            x.f r1 = r6.f26862i
            w.f r2 = r6.f26855b
            w.d[] r2 = r2.f26124N
            r2 = r2[r4]
            int r2 = r2.m13681d()
            int r2 = -r2
            java.util.List<x.f> r3 = r1.f26830l
            r3.add(r0)
            r1.f26824f = r2
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
            x.f r0 = r6.f26861h
            x.f r1 = r6.f26862i
            x.g r2 = r6.f26858e
            int r2 = r2.f26825g
            int r2 = -r2
            goto L1d2
        L1a7:
            boolean r0 = r2 instanceof p381w.InterfaceC6769j
            if (r0 != 0) goto L3cf
            w.f r0 = r2.f26128R
            if (r0 == 0) goto L3cf
            w.d$a r0 = p381w.C6763d.a.f26100d0
            w.d r0 = r2.mo13712l(r0)
            w.d r0 = r0.f26091f
            if (r0 != 0) goto L3cf
            w.f r0 = r6.f26855b
            w.f r1 = r0.f26128R
            x.l r1 = r1.f26143d
            x.f r1 = r1.f26861h
            x.f r2 = r6.f26861h
            int r0 = r0.m13722v()
            r6.m14002b(r2, r1, r0)
        L1ca:
            x.f r0 = r6.f26862i
            x.f r1 = r6.f26861h
            x.g r2 = r6.f26858e
            int r2 = r2.f26825g
        L1d2:
            r6.m14002b(r0, r1, r2)
            goto L3cf
        L1d7:
            w.f$a r2 = r6.f26857d
            if (r2 != r0) goto L2f2
            w.f r0 = r6.f26855b
            int r2 = r0.f26159l
            r5 = 2
            if (r2 == r5) goto L2c9
            r5 = 3
            if (r2 == r5) goto L1e7
            goto L2f2
        L1e7:
            int r2 = r0.f26161m
            if (r2 != r5) goto L27b
            x.f r2 = r6.f26861h
            r2.f26819a = r6
            x.f r2 = r6.f26862i
            r2.f26819a = r6
            x.n r2 = r0.f26145e
            x.f r5 = r2.f26861h
            r5.f26819a = r6
            x.f r2 = r2.f26862i
            r2.f26819a = r6
            r1.f26819a = r6
            boolean r0 = r0.m13691A()
            if (r0 == 0) goto L253
            x.g r0 = r6.f26858e
            java.util.List<x.f> r0 = r0.f26830l
            w.f r1 = r6.f26855b
            x.n r1 = r1.f26145e
            x.g r1 = r1.f26858e
            r0.add(r1)
            w.f r0 = r6.f26855b
            x.n r0 = r0.f26145e
            x.g r0 = r0.f26858e
            java.util.List<x.d> r0 = r0.f26829k
            x.g r1 = r6.f26858e
            r0.add(r1)
            w.f r0 = r6.f26855b
            x.n r0 = r0.f26145e
            x.g r1 = r0.f26858e
            r1.f26819a = r6
            x.g r1 = r6.f26858e
            java.util.List<x.f> r1 = r1.f26830l
            x.f r0 = r0.f26861h
            r1.add(r0)
            x.g r0 = r6.f26858e
            java.util.List<x.f> r0 = r0.f26830l
            w.f r1 = r6.f26855b
            x.n r1 = r1.f26145e
            x.f r1 = r1.f26862i
            r0.add(r1)
            w.f r0 = r6.f26855b
            x.n r0 = r0.f26145e
            x.f r0 = r0.f26861h
            java.util.List<x.d> r0 = r0.f26829k
            x.g r1 = r6.f26858e
            r0.add(r1)
            w.f r0 = r6.f26855b
            x.n r0 = r0.f26145e
            x.f r0 = r0.f26862i
            java.util.List<x.d> r0 = r0.f26829k
            goto L2c6
        L253:
            w.f r0 = r6.f26855b
            boolean r0 = r0.m13726z()
            if (r0 == 0) goto L274
            w.f r0 = r6.f26855b
            x.n r0 = r0.f26145e
            x.g r0 = r0.f26858e
            java.util.List<x.f> r0 = r0.f26830l
            x.g r1 = r6.f26858e
            r0.add(r1)
            x.g r0 = r6.f26858e
            java.util.List<x.d> r0 = r0.f26829k
            w.f r1 = r6.f26855b
            x.n r1 = r1.f26145e
            x.g r1 = r1.f26858e
            goto L2ef
        L274:
            w.f r0 = r6.f26855b
            x.n r0 = r0.f26145e
            x.g r0 = r0.f26858e
            goto L2c4
        L27b:
            x.n r0 = r0.f26145e
            x.g r0 = r0.f26858e
            java.util.List<x.f> r1 = r1.f26830l
            r1.add(r0)
            java.util.List<x.d> r0 = r0.f26829k
            x.g r1 = r6.f26858e
            r0.add(r1)
            w.f r0 = r6.f26855b
            x.n r0 = r0.f26145e
            x.f r0 = r0.f26861h
            java.util.List<x.d> r0 = r0.f26829k
            x.g r1 = r6.f26858e
            r0.add(r1)
            w.f r0 = r6.f26855b
            x.n r0 = r0.f26145e
            x.f r0 = r0.f26862i
            java.util.List<x.d> r0 = r0.f26829k
            x.g r1 = r6.f26858e
            r0.add(r1)
            x.g r0 = r6.f26858e
            r0.f26820b = r4
            java.util.List<x.d> r0 = r0.f26829k
            x.f r1 = r6.f26861h
            r0.add(r1)
            x.g r0 = r6.f26858e
            java.util.List<x.d> r0 = r0.f26829k
            x.f r1 = r6.f26862i
            r0.add(r1)
            x.f r0 = r6.f26861h
            java.util.List<x.f> r0 = r0.f26830l
            x.g r1 = r6.f26858e
            r0.add(r1)
            x.f r0 = r6.f26862i
        L2c4:
            java.util.List<x.f> r0 = r0.f26830l
        L2c6:
            x.g r1 = r6.f26858e
            goto L2ef
        L2c9:
            w.f r0 = r0.f26128R
            if (r0 != 0) goto L2ce
            goto L2f2
        L2ce:
            x.n r0 = r0.f26145e
            x.g r0 = r0.f26858e
            java.util.List<x.f> r1 = r1.f26830l
            r1.add(r0)
            java.util.List<x.d> r0 = r0.f26829k
            x.g r1 = r6.f26858e
            r0.add(r1)
            x.g r0 = r6.f26858e
            r0.f26820b = r4
            java.util.List<x.d> r0 = r0.f26829k
            x.f r1 = r6.f26861h
            r0.add(r1)
            x.g r0 = r6.f26858e
            java.util.List<x.d> r0 = r0.f26829k
            x.f r1 = r6.f26862i
        L2ef:
            r0.add(r1)
        L2f2:
            w.f r0 = r6.f26855b
            w.d[] r1 = r0.f26124N
            r2 = r1[r3]
            w.d r2 = r2.f26091f
            if (r2 == 0) goto L358
            r2 = r1[r4]
            w.d r2 = r2.f26091f
            if (r2 == 0) goto L358
            boolean r0 = r0.m13726z()
            if (r0 == 0) goto L327
            x.f r0 = r6.f26861h
            w.f r1 = r6.f26855b
            w.d[] r1 = r1.f26124N
            r1 = r1[r3]
            int r1 = r1.m13681d()
            r0.f26824f = r1
            x.f r0 = r6.f26862i
            w.f r1 = r6.f26855b
            w.d[] r1 = r1.f26124N
            r1 = r1[r4]
        L31e:
            int r1 = r1.m13681d()
            int r1 = -r1
            r0.f26824f = r1
            goto L3cf
        L327:
            w.f r0 = r6.f26855b
            w.d[] r0 = r0.f26124N
            r0 = r0[r3]
            x.f r0 = r6.m14005h(r0)
            w.f r1 = r6.f26855b
            w.d[] r1 = r1.f26124N
            r1 = r1[r4]
            x.f r1 = r6.m14005h(r1)
            java.util.List<x.d> r2 = r0.f26829k
            r2.add(r6)
            boolean r0 = r0.f26828j
            if (r0 == 0) goto L347
            r6.mo13964a(r6)
        L347:
            java.util.List<x.d> r0 = r1.f26829k
            r0.add(r6)
            boolean r0 = r1.f26828j
            if (r0 == 0) goto L353
            r6.mo13964a(r6)
        L353:
            r0 = 4
            r6.f26863j = r0
            goto L3cf
        L358:
            r2 = r1[r3]
            w.d r2 = r2.f26091f
            if (r2 == 0) goto L37f
            r0 = r1[r3]
            x.f r0 = r6.m14005h(r0)
            if (r0 == 0) goto L3cf
            x.f r1 = r6.f26861h
            w.f r2 = r6.f26855b
            w.d[] r2 = r2.f26124N
            r2 = r2[r3]
            int r2 = r2.m13681d()
            java.util.List<x.f> r3 = r1.f26830l
            r3.add(r0)
            r1.f26824f = r2
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
            goto L3c6
        L37f:
            r2 = r1[r4]
            w.d r2 = r2.f26091f
            if (r2 == 0) goto L3b1
            r0 = r1[r4]
            x.f r0 = r6.m14005h(r0)
            if (r0 == 0) goto L3cf
            x.f r1 = r6.f26862i
            w.f r2 = r6.f26855b
            w.d[] r2 = r2.f26124N
            r2 = r2[r4]
            int r2 = r2.m13681d()
            int r2 = -r2
            java.util.List<x.f> r3 = r1.f26830l
            r3.add(r0)
            r1.f26824f = r2
            java.util.List<x.d> r0 = r0.f26829k
            r0.add(r1)
            x.f r0 = r6.f26861h
            x.f r1 = r6.f26862i
            r2 = -1
            x.g r3 = r6.f26858e
            r6.m14003c(r0, r1, r2, r3)
            goto L3cf
        L3b1:
            boolean r1 = r0 instanceof p381w.InterfaceC6769j
            if (r1 != 0) goto L3cf
            w.f r1 = r0.f26128R
            if (r1 == 0) goto L3cf
            x.l r1 = r1.f26143d
            x.f r1 = r1.f26861h
            x.f r2 = r6.f26861h
            int r0 = r0.m13722v()
            r6.m14002b(r2, r1, r0)
        L3c6:
            x.f r0 = r6.f26862i
            x.f r1 = r6.f26861h
            x.g r2 = r6.f26858e
            r6.m14003c(r0, r1, r4, r2)
        L3cf:
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
            r1.f26133W = r0
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
            int r0 = r0.f26159l
            if (r0 != 0) goto Le
            return r2
        Le:
            r0 = 0
            return r0
        L10:
            return r2
    }

    /* renamed from: m */
    public final void m13993m(int[] r3, int r4, int r5, int r6, int r7, float r8, int r9) {
            r2 = this;
            int r5 = r5 - r4
            int r7 = r7 - r6
            r4 = -1
            r6 = 0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            if (r9 == r4) goto L22
            if (r9 == 0) goto L18
            if (r9 == r1) goto Le
            goto L38
        Le:
            float r4 = (float) r5
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            r3[r6] = r5
            r3[r1] = r4
            goto L38
        L18:
            float r4 = (float) r7
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            r3[r6] = r4
            r3[r1] = r7
            goto L38
        L22:
            float r4 = (float) r7
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            float r9 = (float) r5
            float r9 = r9 / r8
            float r9 = r9 + r0
            int r8 = (int) r9
            if (r4 > r5) goto L32
            r3[r6] = r4
            r3[r1] = r7
            goto L38
        L32:
            if (r8 > r7) goto L38
            r3[r6] = r5
            r3[r1] = r8
        L38:
            return
    }

    /* renamed from: n */
    public void m13994n() {
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
            x.g r1 = r2.f26858e
            r1.f26828j = r0
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "HorizontalRun "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            w.f r1 = r2.f26855b
            java.lang.String r1 = r1.f26158k0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

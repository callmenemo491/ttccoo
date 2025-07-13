package p401x;

/* renamed from: x.e */
/* loaded from: classes.dex */
public class C6897e {

    /* renamed from: a */
    public p381w.C6766g f26811a;

    /* renamed from: b */
    public boolean f26812b;

    /* renamed from: c */
    public boolean f26813c;

    /* renamed from: d */
    public p381w.C6766g f26814d;

    /* renamed from: e */
    public java.util.ArrayList<p401x.AbstractC6908p> f26815e;

    /* renamed from: f */
    public p401x.C6894b.b f26816f;

    /* renamed from: g */
    public p401x.C6894b.a f26817g;

    /* renamed from: h */
    public java.util.ArrayList<p401x.C6905m> f26818h;

    public C6897e(p381w.C6766g r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f26812b = r0
            r1.f26813c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f26815e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0 = 0
            r1.f26816f = r0
            x.b$a r0 = new x.b$a
            r0.<init>()
            r1.f26817g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f26818h = r0
            r1.f26811a = r2
            r1.f26814d = r2
            return
    }

    /* renamed from: a */
    public final void m13972a(p401x.C6898f r9, int r10, int r11, p401x.C6898f r12, java.util.ArrayList<p401x.C6905m> r13, p401x.C6905m r14) {
            r8 = this;
            x.p r9 = r9.f26822d
            x.m r0 = r9.f26856c
            if (r0 != 0) goto L101
            w.g r0 = r8.f26811a
            x.l r1 = r0.f26143d
            if (r9 == r1) goto L101
            x.n r0 = r0.f26145e
            if (r9 != r0) goto L12
            goto L101
        L12:
            if (r14 != 0) goto L1c
            x.m r14 = new x.m
            r14.<init>(r9, r11)
            r13.add(r14)
        L1c:
            r9.f26856c = r14
            java.util.ArrayList<x.p> r11 = r14.f26845b
            r11.add(r9)
            x.f r11 = r9.f26861h
            java.util.List<x.d> r11 = r11.f26829k
            java.util.Iterator r11 = r11.iterator()
        L2b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r11.next()
            x.d r0 = (p401x.InterfaceC6896d) r0
            boolean r1 = r0 instanceof p401x.C6898f
            if (r1 == 0) goto L2b
            r1 = r0
            x.f r1 = (p401x.C6898f) r1
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m13972a(r1, r2, r3, r4, r5, r6)
            goto L2b
        L48:
            x.f r11 = r9.f26862i
            java.util.List<x.d> r11 = r11.f26829k
            java.util.Iterator r11 = r11.iterator()
        L50:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r11.next()
            x.d r0 = (p401x.InterfaceC6896d) r0
            boolean r1 = r0 instanceof p401x.C6898f
            if (r1 == 0) goto L50
            r1 = r0
            x.f r1 = (p401x.C6898f) r1
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m13972a(r1, r2, r3, r4, r5, r6)
            goto L50
        L6d:
            r11 = 1
            if (r10 != r11) goto L9c
            boolean r0 = r9 instanceof p401x.C6906n
            if (r0 == 0) goto L9c
            r0 = r9
            x.n r0 = (p401x.C6906n) r0
            x.f r0 = r0.f26846k
            java.util.List<x.d> r0 = r0.f26829k
            java.util.Iterator r7 = r0.iterator()
        L7f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r7.next()
            x.d r0 = (p401x.InterfaceC6896d) r0
            boolean r1 = r0 instanceof p401x.C6898f
            if (r1 == 0) goto L7f
            r1 = r0
            x.f r1 = (p401x.C6898f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m13972a(r1, r2, r3, r4, r5, r6)
            goto L7f
        L9c:
            x.f r0 = r9.f26861h
            java.util.List<x.f> r0 = r0.f26830l
            java.util.Iterator r7 = r0.iterator()
        La4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r7.next()
            r1 = r0
            x.f r1 = (p401x.C6898f) r1
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m13972a(r1, r2, r3, r4, r5, r6)
            goto La4
        Lbb:
            x.f r0 = r9.f26862i
            java.util.List<x.f> r0 = r0.f26830l
            java.util.Iterator r7 = r0.iterator()
        Lc3:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lda
            java.lang.Object r0 = r7.next()
            r1 = r0
            x.f r1 = (p401x.C6898f) r1
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m13972a(r1, r2, r3, r4, r5, r6)
            goto Lc3
        Lda:
            if (r10 != r11) goto L101
            boolean r11 = r9 instanceof p401x.C6906n
            if (r11 == 0) goto L101
            x.n r9 = (p401x.C6906n) r9
            x.f r9 = r9.f26846k
            java.util.List<x.f> r9 = r9.f26830l
            java.util.Iterator r9 = r9.iterator()
        Lea:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L101
            java.lang.Object r11 = r9.next()
            r1 = r11
            x.f r1 = (p401x.C6898f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m13972a(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L102
            goto Lea
        L101:
            return
        L102:
            r9 = move-exception
            throw r9
    }

    /* renamed from: b */
    public final boolean m13973b(p381w.C6766g r20) {
            r19 = this;
            r0 = r20
            w.f$a r1 = p381w.C6765f.a.f26191a0
            w.f$a r8 = p381w.C6765f.a.f26190Z
            w.f$a r9 = p381w.C6765f.a.f26189Y
            java.util.ArrayList<w.f> r2 = r0.f26243H0
            java.util.Iterator r10 = r2.iterator()
        Le:
            boolean r2 = r10.hasNext()
            r3 = 0
            if (r2 == 0) goto L2c3
            java.lang.Object r2 = r10.next()
            r15 = r2
            w.f r15 = (p381w.C6765f) r15
            w.f$a[] r2 = r15.f26127Q
            r4 = r2[r3]
            r14 = 1
            r2 = r2[r14]
            int r5 = r15.f26156j0
            r6 = 8
            if (r5 != r6) goto L2c
        L29:
            r15.f26137a = r14
            goto Le
        L2c:
            float r5 = r15.f26169q
            r11 = 1065353216(0x3f800000, float:1.0)
            r6 = 2
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 >= 0) goto L39
            if (r4 != r1) goto L39
            r15.f26159l = r6
        L39:
            float r7 = r15.f26175t
            int r12 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r12 >= 0) goto L43
            if (r2 != r1) goto L43
            r15.f26161m = r6
        L43:
            float r12 = r15.f26131U
            r13 = 0
            r11 = 3
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L6c
            if (r4 != r1) goto L54
            if (r2 == r8) goto L51
            if (r2 != r9) goto L54
        L51:
            r15.f26159l = r11
            goto L6c
        L54:
            if (r2 != r1) goto L5d
            if (r4 == r8) goto L5a
            if (r4 != r9) goto L5d
        L5a:
            r15.f26161m = r11
            goto L6c
        L5d:
            if (r4 != r1) goto L6c
            if (r2 != r1) goto L6c
            int r12 = r15.f26159l
            if (r12 != 0) goto L67
            r15.f26159l = r11
        L67:
            int r12 = r15.f26161m
            if (r12 != 0) goto L6c
            goto L5a
        L6c:
            if (r4 != r1) goto L7f
            int r12 = r15.f26159l
            if (r12 != r14) goto L7f
            w.d r12 = r15.f26114F
            w.d r12 = r12.f26091f
            if (r12 == 0) goto L7e
            w.d r12 = r15.f26118H
            w.d r12 = r12.f26091f
            if (r12 != 0) goto L7f
        L7e:
            r4 = r8
        L7f:
            if (r2 != r1) goto L93
            int r12 = r15.f26161m
            if (r12 != r14) goto L93
            w.d r12 = r15.f26116G
            w.d r12 = r12.f26091f
            if (r12 == 0) goto L91
            w.d r12 = r15.f26119I
            w.d r12 = r12.f26091f
            if (r12 != 0) goto L93
        L91:
            r12 = r8
            goto L94
        L93:
            r12 = r2
        L94:
            x.l r2 = r15.f26143d
            r2.f26857d = r4
            int r13 = r15.f26159l
            r2.f26854a = r13
            x.n r2 = r15.f26145e
            r2.f26857d = r12
            int r3 = r15.f26161m
            r2.f26854a = r3
            w.f$a r2 = p381w.C6765f.a.f26192b0
            if (r4 == r2) goto Lac
            if (r4 == r9) goto Lac
            if (r4 != r8) goto Lb4
        Lac:
            if (r12 == r2) goto L26c
            if (r12 == r9) goto L26c
            if (r12 != r8) goto Lb4
            goto L26c
        Lb4:
            r18 = 1056964608(0x3f000000, float:0.5)
            if (r4 != r1) goto L165
            if (r12 == r8) goto Lbc
            if (r12 != r9) goto L165
        Lbc:
            if (r13 != r11) goto Lf6
            if (r12 != r8) goto Lca
            r5 = 0
            r7 = 0
            r2 = r19
            r3 = r15
            r4 = r8
            r6 = r8
            r2.m13977f(r3, r4, r5, r6, r7)
        Lca:
            int r7 = r15.m13715o()
            float r2 = (float) r7
            float r3 = r15.f26131U
            float r2 = r2 * r3
            float r2 = r2 + r18
            int r5 = (int) r2
            r2 = r19
            r3 = r15
            r4 = r9
            r6 = r9
        Ldb:
            r2.m13977f(r3, r4, r5, r6, r7)
            x.l r2 = r15.f26143d
            x.g r2 = r2.f26858e
            int r3 = r15.m13721u()
            r2.mo13980c(r3)
            x.n r2 = r15.f26145e
            x.g r2 = r2.f26858e
            int r3 = r15.m13715o()
            r2.mo13980c(r3)
            goto L29
        Lf6:
            if (r13 != r14) goto L10e
            r5 = 0
            r7 = 0
            r2 = r19
            r3 = r15
            r4 = r8
            r6 = r12
            r2.m13977f(r3, r4, r5, r6, r7)
            x.l r2 = r15.f26143d
            x.g r2 = r2.f26858e
            int r3 = r15.m13721u()
        L10a:
            r2.f26840m = r3
            goto Le
        L10e:
            if (r13 != r6) goto L130
            w.f$a[] r6 = r0.f26127Q
            r17 = 0
            r11 = r6[r17]
            if (r11 == r9) goto L11c
            r6 = r6[r17]
            if (r6 != r2) goto L165
        L11c:
            int r2 = r20.m13721u()
            float r2 = (float) r2
            float r5 = r5 * r2
            float r5 = r5 + r18
            int r5 = (int) r5
            int r7 = r15.m13715o()
            r2 = r19
            r3 = r15
            r4 = r9
            r6 = r12
            goto Ldb
        L130:
            w.d[] r6 = r15.f26124N
            r11 = 0
            r14 = r6[r11]
            w.d r11 = r14.f26091f
            if (r11 == 0) goto L140
            r11 = 1
            r6 = r6[r11]
            w.d r6 = r6.f26091f
            if (r6 != 0) goto L165
        L140:
            r5 = 0
            r7 = 0
            r2 = r19
            r3 = r15
            r4 = r8
            r6 = r12
        L147:
            r2.m13977f(r3, r4, r5, r6, r7)
            x.l r2 = r15.f26143d
            x.g r2 = r2.f26858e
            int r3 = r15.m13721u()
            r2.mo13980c(r3)
            x.n r2 = r15.f26145e
            x.g r2 = r2.f26858e
            int r3 = r15.m13715o()
            r2.mo13980c(r3)
            r2 = 1
            r15.f26137a = r2
            goto Le
        L165:
            if (r12 != r1) goto L1f4
            if (r4 == r8) goto L16b
            if (r4 != r9) goto L1f4
        L16b:
            r6 = 3
            if (r3 != r6) goto L1b2
            if (r4 != r8) goto L17a
            r5 = 0
            r7 = 0
            r2 = r19
            r3 = r15
            r4 = r8
            r6 = r8
            r2.m13977f(r3, r4, r5, r6, r7)
        L17a:
            int r5 = r15.m13721u()
            float r2 = r15.f26131U
            int r3 = r15.f26132V
            r4 = -1
            if (r3 != r4) goto L189
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 / r2
        L189:
            float r3 = (float) r5
            float r3 = r3 * r2
            float r3 = r3 + r18
            int r7 = (int) r3
            r2 = r19
            r3 = r15
            r4 = r9
            r6 = r9
            r2.m13977f(r3, r4, r5, r6, r7)
            x.l r2 = r15.f26143d
            x.g r2 = r2.f26858e
            int r3 = r15.m13721u()
            r2.mo13980c(r3)
            x.n r2 = r15.f26145e
            x.g r2 = r2.f26858e
            int r3 = r15.m13715o()
            r2.mo13980c(r3)
            r6 = 1
            r15.f26137a = r6
            goto Le
        L1b2:
            r6 = 1
            if (r3 != r6) goto L1c0
            r5 = 0
            r7 = 0
            r2 = r19
            r3 = r15
            r6 = r8
            r2.m13977f(r3, r4, r5, r6, r7)
            goto L262
        L1c0:
            r6 = 2
            if (r3 != r6) goto L1e2
            w.f$a[] r6 = r0.f26127Q
            r11 = 1
            r14 = r6[r11]
            if (r14 == r9) goto L1ce
            r6 = r6[r11]
            if (r6 != r2) goto L1f4
        L1ce:
            int r5 = r15.m13721u()
            int r2 = r20.m13715o()
            float r2 = (float) r2
            float r7 = r7 * r2
            float r7 = r7 + r18
            int r7 = (int) r7
            r2 = r19
            r3 = r15
            r6 = r9
            goto L147
        L1e2:
            w.d[] r2 = r15.f26124N
            r6 = 2
            r11 = r2[r6]
            w.d r6 = r11.f26091f
            if (r6 == 0) goto L140
            r6 = 3
            r2 = r2[r6]
            w.d r2 = r2.f26091f
            if (r2 != 0) goto L1f4
            goto L140
        L1f4:
            r2 = 1
            if (r4 != r1) goto Le
            if (r12 != r1) goto Le
            if (r13 == r2) goto L24e
            if (r3 != r2) goto L1fe
            goto L24e
        L1fe:
            r2 = 2
            if (r3 != r2) goto Le
            if (r13 != r2) goto Le
            w.f$a[] r2 = r0.f26127Q
            r3 = 0
            r4 = r2[r3]
            if (r4 == r9) goto L20e
            r3 = r2[r3]
            if (r3 != r9) goto Le
        L20e:
            r3 = 1
            r4 = r2[r3]
            if (r4 == r9) goto L217
            r2 = r2[r3]
            if (r2 != r9) goto Le
        L217:
            int r2 = r20.m13721u()
            float r2 = (float) r2
            float r5 = r5 * r2
            float r5 = r5 + r18
            int r5 = (int) r5
            int r2 = r20.m13715o()
            float r2 = (float) r2
            float r7 = r7 * r2
            float r7 = r7 + r18
            int r7 = (int) r7
            r2 = r19
            r3 = r15
            r4 = r9
            r6 = r9
            r2.m13977f(r3, r4, r5, r6, r7)
            x.l r2 = r15.f26143d
            x.g r2 = r2.f26858e
            int r3 = r15.m13721u()
            r2.mo13980c(r3)
            x.n r2 = r15.f26145e
            x.g r2 = r2.f26858e
            int r3 = r15.m13715o()
            r2.mo13980c(r3)
            r3 = 1
            r15.f26137a = r3
            goto Le
        L24e:
            r5 = 0
            r7 = 0
            r2 = r19
            r3 = r15
            r4 = r8
            r6 = r8
            r2.m13977f(r3, r4, r5, r6, r7)
            x.l r2 = r15.f26143d
            x.g r2 = r2.f26858e
            int r3 = r15.m13721u()
            r2.f26840m = r3
        L262:
            x.n r2 = r15.f26145e
            x.g r2 = r2.f26858e
            int r3 = r15.m13715o()
            goto L10a
        L26c:
            r3 = 1
            int r5 = r15.m13721u()
            if (r4 != r2) goto L284
            int r4 = r20.m13721u()
            w.d r5 = r15.f26114F
            int r5 = r5.f26092g
            int r4 = r4 - r5
            w.d r5 = r15.f26118H
            int r5 = r5.f26092g
            int r4 = r4 - r5
            r14 = r4
            r13 = r9
            goto L286
        L284:
            r13 = r4
            r14 = r5
        L286:
            int r4 = r15.m13715o()
            if (r12 != r2) goto L29e
            int r2 = r20.m13715o()
            w.d r4 = r15.f26116G
            int r4 = r4.f26092g
            int r2 = r2 - r4
            w.d r4 = r15.f26119I
            int r4 = r4.f26092g
            int r2 = r2 - r4
            r16 = r2
            r2 = r9
            goto L2a1
        L29e:
            r16 = r4
            r2 = r12
        L2a1:
            r11 = r19
            r12 = r15
            r4 = r15
            r15 = r2
            r11.m13977f(r12, r13, r14, r15, r16)
            x.l r2 = r4.f26143d
            x.g r2 = r2.f26858e
            int r5 = r4.m13721u()
            r2.mo13980c(r5)
            x.n r2 = r4.f26145e
            x.g r2 = r2.f26858e
            int r5 = r4.m13715o()
            r2.mo13980c(r5)
            r4.f26137a = r3
            goto Le
        L2c3:
            r2 = 0
            return r2
    }

    /* renamed from: c */
    public void m13974c() {
            r7 = this;
            java.util.ArrayList<x.p> r0 = r7.f26815e
            r0.clear()
            w.g r1 = r7.f26814d
            x.l r1 = r1.f26143d
            r1.mo13967f()
            w.g r1 = r7.f26814d
            x.n r1 = r1.f26145e
            r1.mo13967f()
            w.g r1 = r7.f26814d
            x.l r1 = r1.f26143d
            r0.add(r1)
            w.g r1 = r7.f26814d
            x.n r1 = r1.f26145e
            r0.add(r1)
            w.g r1 = r7.f26814d
            java.util.ArrayList<w.f> r1 = r1.f26243H0
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L2a:
            boolean r3 = r1.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L95
            java.lang.Object r3 = r1.next()
            w.f r3 = (p381w.C6765f) r3
            boolean r6 = r3 instanceof p381w.C6768i
            if (r6 == 0) goto L42
            x.j r4 = new x.j
            r4.<init>(r3)
            goto L91
        L42:
            boolean r6 = r3.m13726z()
            if (r6 == 0) goto L60
            x.c r6 = r3.f26139b
            if (r6 != 0) goto L53
            x.c r6 = new x.c
            r6.<init>(r3, r5)
            r3.f26139b = r6
        L53:
            if (r2 != 0) goto L5a
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
        L5a:
            x.c r5 = r3.f26139b
            r2.add(r5)
            goto L65
        L60:
            x.l r5 = r3.f26143d
            r0.add(r5)
        L65:
            boolean r5 = r3.m13691A()
            if (r5 == 0) goto L83
            x.c r5 = r3.f26141c
            if (r5 != 0) goto L76
            x.c r5 = new x.c
            r5.<init>(r3, r4)
            r3.f26141c = r5
        L76:
            if (r2 != 0) goto L7d
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
        L7d:
            x.c r4 = r3.f26141c
            r2.add(r4)
            goto L88
        L83:
            x.n r4 = r3.f26145e
            r0.add(r4)
        L88:
            boolean r4 = r3 instanceof p381w.C6770k
            if (r4 == 0) goto L2a
            x.k r4 = new x.k
            r4.<init>(r3)
        L91:
            r0.add(r4)
            goto L2a
        L95:
            if (r2 == 0) goto L9a
            r0.addAll(r2)
        L9a:
            java.util.Iterator r1 = r0.iterator()
        L9e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lae
            java.lang.Object r2 = r1.next()
            x.p r2 = (p401x.AbstractC6908p) r2
            r2.mo13967f()
            goto L9e
        Lae:
            java.util.Iterator r0 = r0.iterator()
        Lb2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc9
            java.lang.Object r1 = r0.next()
            x.p r1 = (p401x.AbstractC6908p) r1
            w.f r2 = r1.f26855b
            w.g r3 = r7.f26814d
            if (r2 != r3) goto Lc5
            goto Lb2
        Lc5:
            r1.mo13965d()
            goto Lb2
        Lc9:
            java.util.ArrayList<x.m> r0 = r7.f26818h
            r0.clear()
            p401x.C6905m.f26843c = r5
            w.g r0 = r7.f26811a
            x.l r0 = r0.f26143d
            java.util.ArrayList<x.m> r1 = r7.f26818h
            r7.m13976e(r0, r5, r1)
            w.g r0 = r7.f26811a
            x.n r0 = r0.f26145e
            java.util.ArrayList<x.m> r1 = r7.f26818h
            r7.m13976e(r0, r4, r1)
            r7.f26812b = r5
            return
    }

    /* renamed from: d */
    public final int m13975d(p381w.C6766g r18, int r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.util.ArrayList<x.m> r3 = r0.f26818h
            int r3 = r3.size()
            r4 = 0
            r6 = 0
            r6 = r4
            r8 = 0
        L11:
            if (r8 >= r3) goto L124
            java.util.ArrayList<x.m> r9 = r0.f26818h
            java.lang.Object r9 = r9.get(r8)
            x.m r9 = (p401x.C6905m) r9
            x.p r10 = r9.f26844a
            boolean r11 = r10 instanceof p401x.C6895c
            if (r11 == 0) goto L2a
            r11 = r10
            x.c r11 = (p401x.C6895c) r11
            int r11 = r11.f26859f
            if (r11 == r2) goto L38
            goto L116
        L2a:
            if (r2 != 0) goto L32
            boolean r11 = r10 instanceof p401x.C6904l
            if (r11 != 0) goto L38
            goto L116
        L32:
            boolean r11 = r10 instanceof p401x.C6906n
            if (r11 != 0) goto L38
            goto L116
        L38:
            if (r2 != 0) goto L3d
            x.l r11 = r1.f26143d
            goto L3f
        L3d:
            x.n r11 = r1.f26145e
        L3f:
            x.f r11 = r11.f26861h
            if (r2 != 0) goto L46
            x.l r12 = r1.f26143d
            goto L48
        L46:
            x.n r12 = r1.f26145e
        L48:
            x.f r12 = r12.f26862i
            x.f r10 = r10.f26861h
            java.util.List<x.f> r10 = r10.f26830l
            boolean r10 = r10.contains(r11)
            x.p r11 = r9.f26844a
            x.f r11 = r11.f26862i
            java.util.List<x.f> r11 = r11.f26830l
            boolean r11 = r11.contains(r12)
            x.p r12 = r9.f26844a
            long r12 = r12.mo13968j()
            if (r10 == 0) goto Ld3
            if (r11 == 0) goto Ld3
            x.p r10 = r9.f26844a
            x.f r10 = r10.f26861h
            long r10 = r9.m13996b(r10, r6)
            x.p r14 = r9.f26844a
            x.f r14 = r14.f26862i
            long r6 = r9.m13995a(r14, r6)
            long r10 = r10 - r12
            x.p r14 = r9.f26844a
            x.f r15 = r14.f26862i
            int r15 = r15.f26824f
            int r0 = -r15
            long r0 = (long) r0
            int r16 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r16 < 0) goto L85
            long r0 = (long) r15
            long r10 = r10 + r0
        L85:
            long r0 = -r6
            long r0 = r0 - r12
            x.f r6 = r14.f26861h
            int r6 = r6.f26824f
            long r6 = (long) r6
            long r0 = r0 - r6
            int r15 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r15 < 0) goto L92
            long r0 = r0 - r6
        L92:
            w.f r6 = r14.f26855b
            java.util.Objects.requireNonNull(r6)
            if (r2 != 0) goto L9c
            float r6 = r6.f26148f0
            goto La4
        L9c:
            r7 = 1
            if (r2 != r7) goto La2
            float r6 = r6.f26150g0
            goto La4
        La2:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
        La4:
            r7 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto Lb4
            float r0 = (float) r0
            float r0 = r0 / r6
            float r1 = (float) r10
            float r7 = r14 - r6
            float r1 = r1 / r7
            float r1 = r1 + r0
            long r0 = (long) r1
            goto Lb6
        Lb4:
            r0 = 0
        Lb6:
            float r0 = (float) r0
            float r1 = r0 * r6
            r7 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r7
            long r10 = (long) r1
            float r0 = p346u.C6268m.m12887a(r14, r6, r0, r7)
            long r0 = (long) r0
            long r10 = r10 + r12
            long r10 = r10 + r0
            x.p r0 = r9.f26844a
            x.f r1 = r0.f26861h
            int r1 = r1.f26824f
            long r6 = (long) r1
            long r6 = r6 + r10
            x.f r0 = r0.f26862i
            int r0 = r0.f26824f
            long r0 = (long) r0
            long r6 = r6 - r0
            goto L116
        Ld3:
            x.p r0 = r9.f26844a
            if (r10 == 0) goto Le9
            x.f r0 = r0.f26861h
            int r1 = r0.f26824f
            long r6 = (long) r1
            long r0 = r9.m13996b(r0, r6)
            x.p r6 = r9.f26844a
            x.f r6 = r6.f26861h
            int r6 = r6.f26824f
            long r6 = (long) r6
            long r6 = r6 + r12
            goto Lfe
        Le9:
            if (r11 == 0) goto L103
            x.f r0 = r0.f26862i
            int r1 = r0.f26824f
            long r6 = (long) r1
            long r0 = r9.m13995a(r0, r6)
            x.p r6 = r9.f26844a
            x.f r6 = r6.f26862i
            int r6 = r6.f26824f
            int r6 = -r6
            long r6 = (long) r6
            long r6 = r6 + r12
            long r0 = -r0
        Lfe:
            long r6 = java.lang.Math.max(r0, r6)
            goto L116
        L103:
            x.f r1 = r0.f26861h
            int r1 = r1.f26824f
            long r6 = (long) r1
            long r0 = r0.mo13968j()
            long r0 = r0 + r6
            x.p r6 = r9.f26844a
            x.f r6 = r6.f26862i
            int r6 = r6.f26824f
            long r6 = (long) r6
            long r6 = r0 - r6
        L116:
            long r4 = java.lang.Math.max(r4, r6)
            int r8 = r8 + 1
            r6 = 0
            r0 = r17
            r1 = r18
            goto L11
        L124:
            int r0 = (int) r4
            return r0
    }

    /* renamed from: e */
    public final void m13976e(p401x.AbstractC6908p r11, int r12, java.util.ArrayList<p401x.C6905m> r13) {
            r10 = this;
            x.f r0 = r11.f26861h
            java.util.List<x.d> r0 = r0.f26829k
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            x.d r1 = (p401x.InterfaceC6896d) r1
            boolean r2 = r1 instanceof p401x.C6898f
            if (r2 == 0) goto L26
            r4 = r1
            x.f r4 = (p401x.C6898f) r4
            r6 = 0
            x.f r7 = r11.f26862i
            r9 = 0
            r3 = r10
            r5 = r12
            r8 = r13
            r3.m13972a(r4, r5, r6, r7, r8, r9)
            goto L8
        L26:
            boolean r2 = r1 instanceof p401x.AbstractC6908p
            if (r2 == 0) goto L8
            x.p r1 = (p401x.AbstractC6908p) r1
            x.f r3 = r1.f26861h
            r5 = 0
            x.f r6 = r11.f26862i
            r8 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.m13972a(r3, r4, r5, r6, r7, r8)
            goto L8
        L39:
            x.f r0 = r11.f26862i
            java.util.List<x.d> r0 = r0.f26829k
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()
            x.d r1 = (p401x.InterfaceC6896d) r1
            boolean r2 = r1 instanceof p401x.C6898f
            if (r2 == 0) goto L5f
            r4 = r1
            x.f r4 = (p401x.C6898f) r4
            r6 = 1
            x.f r7 = r11.f26861h
            r9 = 0
            r3 = r10
            r5 = r12
            r8 = r13
            r3.m13972a(r4, r5, r6, r7, r8, r9)
            goto L41
        L5f:
            boolean r2 = r1 instanceof p401x.AbstractC6908p
            if (r2 == 0) goto L41
            x.p r1 = (p401x.AbstractC6908p) r1
            x.f r3 = r1.f26862i
            r5 = 1
            x.f r6 = r11.f26861h
            r8 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.m13972a(r3, r4, r5, r6, r7, r8)
            goto L41
        L72:
            r0 = 1
            if (r12 != r0) goto L9c
            x.n r11 = (p401x.C6906n) r11
            x.f r11 = r11.f26846k
            java.util.List<x.d> r11 = r11.f26829k
            java.util.Iterator r11 = r11.iterator()
        L7f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r11.next()
            x.d r0 = (p401x.InterfaceC6896d) r0
            boolean r1 = r0 instanceof p401x.C6898f
            if (r1 == 0) goto L7f
            r3 = r0
            x.f r3 = (p401x.C6898f) r3
            r5 = 2
            r6 = 0
            r8 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.m13972a(r3, r4, r5, r6, r7, r8)
            goto L7f
        L9c:
            return
    }

    /* renamed from: f */
    public final void m13977f(p381w.C6765f r2, p381w.C6765f.a r3, int r4, p381w.C6765f.a r5, int r6) {
            r1 = this;
            x.b$a r0 = r1.f26817g
            r0.f26799a = r3
            r0.f26800b = r5
            r0.f26801c = r4
            r0.f26802d = r6
            x.b$b r3 = r1.f26816f
            androidx.constraintlayout.widget.ConstraintLayout$b r3 = (androidx.constraintlayout.widget.ConstraintLayout.C0331b) r3
            r3.m934b(r2, r0)
            x.b$a r3 = r1.f26817g
            int r3 = r3.f26803e
            r2.m13704P(r3)
            x.b$a r3 = r1.f26817g
            int r3 = r3.f26804f
            r2.m13699K(r3)
            x.b$a r3 = r1.f26817g
            boolean r4 = r3.f26806h
            r2.f26104A = r4
            int r3 = r3.f26805g
            r2.m13696H(r3)
            return
    }

    /* renamed from: g */
    public void m13978g() {
            r14 = this;
            w.f$a r6 = p381w.C6765f.a.f26189Y
            w.f$a r7 = p381w.C6765f.a.f26191a0
            w.g r0 = r14.f26811a
            java.util.ArrayList<w.f> r0 = r0.f26243H0
            java.util.Iterator r8 = r0.iterator()
        Lc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r0 = r8.next()
            r9 = r0
            w.f r9 = (p381w.C6765f) r9
            boolean r0 = r9.f26137a
            if (r0 == 0) goto L1e
            goto Lc
        L1e:
            w.f$a[] r0 = r9.f26127Q
            r1 = 0
            r10 = r0[r1]
            r11 = 1
            r12 = r0[r11]
            int r0 = r9.f26159l
            int r2 = r9.f26161m
            w.f$a r4 = p381w.C6765f.a.f26190Z
            if (r10 == r4) goto L35
            if (r10 != r7) goto L33
            if (r0 != r11) goto L33
            goto L35
        L33:
            r0 = 0
            goto L36
        L35:
            r0 = 1
        L36:
            if (r12 == r4) goto L3c
            if (r12 != r7) goto L3d
            if (r2 != r11) goto L3d
        L3c:
            r1 = 1
        L3d:
            x.l r2 = r9.f26143d
            x.g r2 = r2.f26858e
            boolean r3 = r2.f26828j
            x.n r5 = r9.f26145e
            x.g r5 = r5.f26858e
            boolean r13 = r5.f26828j
            if (r3 == 0) goto L5b
            if (r13 == 0) goto L5b
            int r3 = r2.f26825g
            int r5 = r5.f26825g
            r0 = r14
            r1 = r9
            r2 = r6
            r4 = r6
            r0.m13977f(r1, r2, r3, r4, r5)
        L58:
            r9.f26137a = r11
            goto L94
        L5b:
            if (r3 == 0) goto L7a
            if (r1 == 0) goto L7a
            int r3 = r2.f26825g
            int r5 = r5.f26825g
            r0 = r14
            r1 = r9
            r2 = r6
            r0.m13977f(r1, r2, r3, r4, r5)
            x.n r0 = r9.f26145e
            x.g r0 = r0.f26858e
            int r1 = r9.m13715o()
            if (r12 != r7) goto L76
        L73:
            r0.f26840m = r1
            goto L94
        L76:
            r0.mo13980c(r1)
            goto L58
        L7a:
            if (r13 == 0) goto L94
            if (r0 == 0) goto L94
            int r3 = r2.f26825g
            int r5 = r5.f26825g
            r0 = r14
            r1 = r9
            r2 = r4
            r4 = r6
            r0.m13977f(r1, r2, r3, r4, r5)
            x.l r0 = r9.f26143d
            x.g r0 = r0.f26858e
            int r1 = r9.m13721u()
            if (r10 != r7) goto L76
            goto L73
        L94:
            boolean r0 = r9.f26137a
            if (r0 == 0) goto Lc
            x.n r0 = r9.f26145e
            x.g r0 = r0.f26847l
            if (r0 == 0) goto Lc
            int r1 = r9.f26142c0
            r0.mo13980c(r1)
            goto Lc
        La5:
            return
    }
}

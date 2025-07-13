package p370v4;

/* renamed from: v4.c0 */
/* loaded from: classes.dex */
public final class C6523c0 implements p216m4.InterfaceC4364i {

    /* renamed from: a */
    public final int f25299a;

    /* renamed from: b */
    public final int f25300b;

    /* renamed from: c */
    public final java.util.List<p371v5.C6576z> f25301c;

    /* renamed from: d */
    public final p371v5.C6571u f25302d;

    /* renamed from: e */
    public final android.util.SparseIntArray f25303e;

    /* renamed from: f */
    public final p370v4.InterfaceC6525d0.c f25304f;

    /* renamed from: g */
    public final android.util.SparseArray<p370v4.InterfaceC6525d0> f25305g;

    /* renamed from: h */
    public final android.util.SparseBooleanArray f25306h;

    /* renamed from: i */
    public final android.util.SparseBooleanArray f25307i;

    /* renamed from: j */
    public final p370v4.C6521b0 f25308j;

    /* renamed from: k */
    public p370v4.C6519a0 f25309k;

    /* renamed from: l */
    public p216m4.InterfaceC4366k f25310l;

    /* renamed from: m */
    public int f25311m;

    /* renamed from: n */
    public boolean f25312n;

    /* renamed from: o */
    public boolean f25313o;

    /* renamed from: p */
    public boolean f25314p;

    /* renamed from: q */
    public p370v4.InterfaceC6525d0 f25315q;

    /* renamed from: r */
    public int f25316r;

    /* renamed from: s */
    public int f25317s;

    /* renamed from: v4.c0$a */
    public class a implements p370v4.InterfaceC6546x {

        /* renamed from: a */
        public final p216m4.C4355b0 f25318a;

        /* renamed from: b */
        public final /* synthetic */ p370v4.C6523c0 f25319b;

        public a(p370v4.C6523c0 r4) {
                r3 = this;
                r3.f25319b = r4
                r3.<init>()
                m4.b0 r4 = new m4.b0
                r0 = 4
                byte[] r0 = new byte[r0]
                r1 = 1
                r2 = 0
                r4.<init>(r0, r1, r2)
                r3.f25318a = r4
                return
        }

        @Override // p370v4.InterfaceC6546x
        /* renamed from: b */
        public void mo13247b(p371v5.C6576z r1, p216m4.InterfaceC4366k r2, p370v4.InterfaceC6525d0.d r3) {
                r0 = this;
                return
        }

        @Override // p370v4.InterfaceC6546x
        /* renamed from: c */
        public void mo13248c(p371v5.C6571u r10) {
                r9 = this;
                int r0 = r10.m13418u()
                if (r0 == 0) goto L7
                return
            L7:
                int r0 = r10.m13418u()
                r0 = r0 & 128(0x80, float:1.8E-43)
                if (r0 != 0) goto L10
                return
            L10:
                r0 = 6
                r10.m13397G(r0)
                int r0 = r10.m13398a()
                r1 = 4
                int r0 = r0 / r1
                r2 = 0
                r3 = 0
            L1c:
                if (r3 >= r0) goto L67
                m4.b0 r4 = r9.f25318a
                r10.m13401d(r4, r1)
                m4.b0 r4 = r9.f25318a
                r5 = 16
                int r4 = r4.m9766k(r5)
                m4.b0 r5 = r9.f25318a
                r6 = 3
                r5.m9775t(r6)
                r5 = 13
                if (r4 != 0) goto L3b
                m4.b0 r4 = r9.f25318a
                r4.m9775t(r5)
                goto L64
            L3b:
                m4.b0 r4 = r9.f25318a
                int r4 = r4.m9766k(r5)
                v4.c0 r5 = r9.f25319b
                android.util.SparseArray<v4.d0> r5 = r5.f25305g
                java.lang.Object r5 = r5.get(r4)
                if (r5 != 0) goto L64
                v4.c0 r5 = r9.f25319b
                android.util.SparseArray<v4.d0> r6 = r5.f25305g
                v4.y r7 = new v4.y
                v4.c0$b r8 = new v4.c0$b
                r8.<init>(r5, r4)
                r7.<init>(r8)
                r6.put(r4, r7)
                v4.c0 r4 = r9.f25319b
                int r5 = r4.f25311m
                int r5 = r5 + 1
                r4.f25311m = r5
            L64:
                int r3 = r3 + 1
                goto L1c
            L67:
                v4.c0 r10 = r9.f25319b
                int r0 = r10.f25299a
                r1 = 2
                if (r0 == r1) goto L73
                android.util.SparseArray<v4.d0> r10 = r10.f25305g
                r10.remove(r2)
            L73:
                return
        }
    }

    /* renamed from: v4.c0$b */
    public class b implements p370v4.InterfaceC6546x {

        /* renamed from: a */
        public final p216m4.C4355b0 f25320a;

        /* renamed from: b */
        public final android.util.SparseArray<p370v4.InterfaceC6525d0> f25321b;

        /* renamed from: c */
        public final android.util.SparseIntArray f25322c;

        /* renamed from: d */
        public final int f25323d;

        /* renamed from: e */
        public final /* synthetic */ p370v4.C6523c0 f25324e;

        public b(p370v4.C6523c0 r4, int r5) {
                r3 = this;
                r3.f25324e = r4
                r3.<init>()
                m4.b0 r4 = new m4.b0
                r0 = 5
                byte[] r0 = new byte[r0]
                r1 = 1
                r2 = 0
                r4.<init>(r0, r1, r2)
                r3.f25320a = r4
                android.util.SparseArray r4 = new android.util.SparseArray
                r4.<init>()
                r3.f25321b = r4
                android.util.SparseIntArray r4 = new android.util.SparseIntArray
                r4.<init>()
                r3.f25322c = r4
                r3.f25323d = r5
                return
        }

        @Override // p370v4.InterfaceC6546x
        /* renamed from: b */
        public void mo13247b(p371v5.C6576z r1, p216m4.InterfaceC4366k r2, p370v4.InterfaceC6525d0.d r3) {
                r0 = this;
                return
        }

        @Override // p370v4.InterfaceC6546x
        /* renamed from: c */
        public void mo13248c(p371v5.C6571u r24) {
                r23 = this;
                r0 = r23
                r1 = r24
                int r2 = r24.m13418u()
                r3 = 2
                if (r2 == r3) goto Lc
                return
            Lc:
                v4.c0 r2 = r0.f25324e
                int r4 = r2.f25299a
                r5 = 1
                r6 = 0
                if (r4 == r5) goto L34
                if (r4 == r3) goto L34
                int r4 = r2.f25311m
                if (r4 != r5) goto L1b
                goto L34
            L1b:
                v5.z r4 = new v5.z
                java.util.List<v5.z> r2 = r2.f25301c
                java.lang.Object r2 = r2.get(r6)
                v5.z r2 = (p371v5.C6576z) r2
                long r7 = r2.m13445c()
                r4.<init>(r7)
                v4.c0 r2 = r0.f25324e
                java.util.List<v5.z> r2 = r2.f25301c
                r2.add(r4)
                goto L3d
            L34:
                java.util.List<v5.z> r2 = r2.f25301c
                java.lang.Object r2 = r2.get(r6)
                r4 = r2
                v5.z r4 = (p371v5.C6576z) r4
            L3d:
                int r2 = r24.m13418u()
                r2 = r2 & 128(0x80, float:1.8E-43)
                if (r2 != 0) goto L46
                return
            L46:
                r1.m13397G(r5)
                int r2 = r24.m13423z()
                r7 = 3
                r1.m13397G(r7)
                m4.b0 r8 = r0.f25320a
                r1.m13401d(r8, r3)
                m4.b0 r8 = r0.f25320a
                r8.m9775t(r7)
                v4.c0 r8 = r0.f25324e
                m4.b0 r9 = r0.f25320a
                r10 = 13
                int r9 = r9.m9766k(r10)
                r8.f25317s = r9
                m4.b0 r8 = r0.f25320a
                r1.m13401d(r8, r3)
                m4.b0 r8 = r0.f25320a
                r9 = 4
                r8.m9775t(r9)
                m4.b0 r8 = r0.f25320a
                r11 = 12
                int r8 = r8.m9766k(r11)
                r1.m13397G(r8)
                v4.c0 r8 = r0.f25324e
                int r12 = r8.f25299a
                r13 = 21
                r14 = 0
                r15 = 8192(0x2000, float:1.148E-41)
                if (r12 != r3) goto Lad
                v4.d0 r8 = r8.f25315q
                if (r8 != 0) goto Lad
                v4.d0$b r8 = new v4.d0$b
                byte[] r12 = p371v5.C6552b0.f25629f
                r8.<init>(r13, r14, r14, r12)
                v4.c0 r12 = r0.f25324e
                v4.d0$c r14 = r12.f25304f
                v4.d0 r8 = r14.mo13252a(r13, r8)
                r12.f25315q = r8
                v4.c0 r8 = r0.f25324e
                v4.d0 r12 = r8.f25315q
                if (r12 == 0) goto Lad
                m4.k r8 = r8.f25310l
                v4.d0$d r14 = new v4.d0$d
                r14.<init>(r2, r13, r15)
                r12.mo13250b(r4, r8, r14)
            Lad:
                android.util.SparseArray<v4.d0> r8 = r0.f25321b
                r8.clear()
                android.util.SparseIntArray r8 = r0.f25322c
                r8.clear()
                int r8 = r24.m13398a()
            Lbb:
                if (r8 <= 0) goto L250
                m4.b0 r14 = r0.f25320a
                r12 = 5
                r1.m13401d(r14, r12)
                m4.b0 r14 = r0.f25320a
                r5 = 8
                int r5 = r14.m9766k(r5)
                m4.b0 r14 = r0.f25320a
                r14.m9775t(r7)
                m4.b0 r14 = r0.f25320a
                int r14 = r14.m9766k(r10)
                m4.b0 r10 = r0.f25320a
                r10.m9775t(r9)
                m4.b0 r10 = r0.f25320a
                int r10 = r10.m9766k(r11)
                int r11 = r1.f25711b
                int r15 = r10 + r11
                r3 = -1
                r17 = 0
                r18 = 0
            Lea:
                int r6 = r1.f25711b
                if (r6 >= r15) goto L1d0
                int r6 = r24.m13418u()
                int r16 = r24.m13418u()
                int r9 = r1.f25711b
                int r9 = r9 + r16
                if (r9 <= r15) goto Lfe
                goto L1d0
            Lfe:
                r7 = 89
                if (r6 != r12) goto L128
                long r6 = r24.m13419v()
                r19 = 1094921523(0x41432d33, double:5.409631094E-315)
                int r16 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                if (r16 != 0) goto L10e
                goto L12c
            L10e:
                r19 = 1161904947(0x45414333, double:5.74057318E-315)
                int r16 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                if (r16 != 0) goto L116
                goto L134
            L116:
                r19 = 1094921524(0x41432d34, double:5.4096311E-315)
                int r16 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                if (r16 != 0) goto L11e
                goto L141
            L11e:
                r19 = 1212503619(0x48455643, double:5.990563836E-315)
                int r16 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                if (r16 != 0) goto L12e
                r3 = 36
                goto L12e
            L128:
                r12 = 106(0x6a, float:1.49E-43)
                if (r6 != r12) goto L130
            L12c:
                r3 = 129(0x81, float:1.81E-43)
            L12e:
                r12 = 3
                goto L158
            L130:
                r12 = 122(0x7a, float:1.71E-43)
                if (r6 != r12) goto L137
            L134:
                r3 = 135(0x87, float:1.89E-43)
                goto L12e
            L137:
                r12 = 127(0x7f, float:1.78E-43)
                if (r6 != r12) goto L144
                int r6 = r24.m13418u()
                if (r6 != r13) goto L12e
            L141:
                r3 = 172(0xac, float:2.41E-43)
                goto L12e
            L144:
                r12 = 123(0x7b, float:1.72E-43)
                if (r6 != r12) goto L14b
                r3 = 138(0x8a, float:1.93E-43)
                goto L12e
            L14b:
                r12 = 10
                if (r6 != r12) goto L160
                r12 = 3
                java.lang.String r6 = r1.m13415r(r12)
                java.lang.String r17 = r6.trim()
            L158:
                r21 = r2
                r20 = r4
                r22 = r14
                r12 = 4
                goto L1bd
            L160:
                r12 = 3
                if (r6 != r7) goto L1ae
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L168:
                int r6 = r1.f25711b
                if (r6 >= r9) goto L1a2
                java.lang.String r6 = r1.m13415r(r12)
                java.lang.String r6 = r6.trim()
                int r7 = r24.m13418u()
                r12 = 4
                byte[] r13 = new byte[r12]
                r20 = r4
                byte[] r4 = r1.f25710a
                r21 = r2
                int r2 = r1.f25711b
                r22 = r14
                r14 = 0
                java.lang.System.arraycopy(r4, r2, r13, r14, r12)
                int r2 = r1.f25711b
                int r2 = r2 + r12
                r1.f25711b = r2
                v4.d0$a r2 = new v4.d0$a
                r2.<init>(r6, r7, r13)
                r3.add(r2)
                r4 = r20
                r2 = r21
                r14 = r22
                r7 = 89
                r12 = 3
                r13 = 21
                goto L168
            L1a2:
                r21 = r2
                r20 = r4
                r22 = r14
                r12 = 4
                r18 = r3
                r3 = 89
                goto L1bd
            L1ae:
                r21 = r2
                r20 = r4
                r22 = r14
                r12 = 4
                r2 = 111(0x6f, float:1.56E-43)
                if (r6 != r2) goto L1bd
                r2 = 257(0x101, float:3.6E-43)
                r3 = 257(0x101, float:3.6E-43)
            L1bd:
                int r2 = r1.f25711b
                int r9 = r9 - r2
                r1.m13397G(r9)
                r4 = r20
                r2 = r21
                r14 = r22
                r7 = 3
                r9 = 4
                r12 = 5
                r13 = 21
                goto Lea
            L1d0:
                r21 = r2
                r20 = r4
                r22 = r14
                r12 = 4
                r1.m13396F(r15)
                v4.d0$b r2 = new v4.d0$b
                byte[] r4 = r1.f25710a
                byte[] r4 = java.util.Arrays.copyOfRange(r4, r11, r15)
                r6 = r17
                r7 = r18
                r2.<init>(r3, r6, r7, r4)
                r4 = 6
                if (r5 == r4) goto L1ef
                r4 = 5
                if (r5 != r4) goto L1f0
            L1ef:
                r5 = r3
            L1f0:
                int r10 = r10 + 5
                int r8 = r8 - r10
                v4.c0 r3 = r0.f25324e
                int r4 = r3.f25299a
                r6 = 2
                if (r4 != r6) goto L1fc
                r4 = r5
                goto L1fe
            L1fc:
                r4 = r22
            L1fe:
                android.util.SparseBooleanArray r3 = r3.f25306h
                boolean r3 = r3.get(r4)
                if (r3 == 0) goto L209
                r7 = 21
                goto L23d
            L209:
                v4.c0 r3 = r0.f25324e
                int r7 = r3.f25299a
                if (r7 != r6) goto L216
                r7 = 21
                if (r5 != r7) goto L218
                v4.d0 r2 = r3.f25315q
                goto L21e
            L216:
                r7 = 21
            L218:
                v4.d0$c r3 = r3.f25304f
                v4.d0 r2 = r3.mo13252a(r5, r2)
            L21e:
                v4.c0 r3 = r0.f25324e
                int r3 = r3.f25299a
                if (r3 != r6) goto L231
                android.util.SparseIntArray r3 = r0.f25322c
                r5 = 8192(0x2000, float:1.148E-41)
                int r3 = r3.get(r4, r5)
                r5 = r22
                if (r5 >= r3) goto L23d
                goto L233
            L231:
                r5 = r22
            L233:
                android.util.SparseIntArray r3 = r0.f25322c
                r3.put(r4, r5)
                android.util.SparseArray<v4.d0> r3 = r0.f25321b
                r3.put(r4, r2)
            L23d:
                r4 = r20
                r2 = r21
                r3 = 2
                r5 = 1
                r6 = 0
                r7 = 3
                r9 = 4
                r10 = 13
                r11 = 12
                r13 = 21
                r15 = 8192(0x2000, float:1.148E-41)
                goto Lbb
            L250:
                r21 = r2
                r20 = r4
                android.util.SparseIntArray r1 = r0.f25322c
                int r1 = r1.size()
                r14 = 0
            L25b:
                if (r14 >= r1) goto L2b4
                android.util.SparseIntArray r2 = r0.f25322c
                int r2 = r2.keyAt(r14)
                android.util.SparseIntArray r3 = r0.f25322c
                int r3 = r3.valueAt(r14)
                v4.c0 r4 = r0.f25324e
                android.util.SparseBooleanArray r4 = r4.f25306h
                r5 = 1
                r4.put(r2, r5)
                v4.c0 r4 = r0.f25324e
                android.util.SparseBooleanArray r4 = r4.f25307i
                r4.put(r3, r5)
                android.util.SparseArray<v4.d0> r4 = r0.f25321b
                java.lang.Object r4 = r4.valueAt(r14)
                v4.d0 r4 = (p370v4.InterfaceC6525d0) r4
                if (r4 == 0) goto L2a7
                v4.c0 r5 = r0.f25324e
                v4.d0 r6 = r5.f25315q
                if (r4 == r6) goto L299
                m4.k r5 = r5.f25310l
                v4.d0$d r6 = new v4.d0$d
                r7 = r21
                r8 = 8192(0x2000, float:1.148E-41)
                r6.<init>(r7, r2, r8)
                r2 = r20
                r4.mo13250b(r2, r5, r6)
                goto L29f
            L299:
                r2 = r20
                r7 = r21
                r8 = 8192(0x2000, float:1.148E-41)
            L29f:
                v4.c0 r5 = r0.f25324e
                android.util.SparseArray<v4.d0> r5 = r5.f25305g
                r5.put(r3, r4)
                goto L2ad
            L2a7:
                r2 = r20
                r7 = r21
                r8 = 8192(0x2000, float:1.148E-41)
            L2ad:
                int r14 = r14 + 1
                r20 = r2
                r21 = r7
                goto L25b
            L2b4:
                v4.c0 r1 = r0.f25324e
                int r2 = r1.f25299a
                r3 = 2
                if (r2 != r3) goto L2cb
                boolean r2 = r1.f25312n
                if (r2 != 0) goto L2ee
                m4.k r1 = r1.f25310l
                r1.mo6043b()
                v4.c0 r1 = r0.f25324e
                r2 = 0
                r1.f25311m = r2
                r4 = 1
                goto L2ec
            L2cb:
                r2 = 0
                android.util.SparseArray<v4.d0> r1 = r1.f25305g
                int r3 = r0.f25323d
                r1.remove(r3)
                v4.c0 r1 = r0.f25324e
                int r3 = r1.f25299a
                r4 = 1
                if (r3 != r4) goto L2dc
                r6 = 0
                goto L2e1
            L2dc:
                int r2 = r1.f25311m
                r3 = -1
                int r6 = r2 + (-1)
            L2e1:
                r1.f25311m = r6
                if (r6 != 0) goto L2ee
                m4.k r1 = r1.f25310l
                r1.mo6043b()
                v4.c0 r1 = r0.f25324e
            L2ec:
                r1.f25312n = r4
            L2ee:
                return
        }
    }

    static {
            androidx.room.a r0 = androidx.room.C0618a.f3659i0
            return
    }

    public C6523c0(int r5, int r6, int r7) {
            r4 = this;
            v5.z r0 = new v5.z
            r1 = 0
            r0.<init>(r1)
            v4.g r1 = new v4.g
            r1.<init>(r6)
            r4.<init>()
            r4.f25304f = r1
            r4.f25300b = r7
            r4.f25299a = r5
            r6 = 1
            if (r5 == r6) goto L27
            r6 = 2
            if (r5 != r6) goto L1c
            goto L27
        L1c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f25301c = r5
            r5.add(r0)
            goto L2d
        L27:
            java.util.List r5 = java.util.Collections.singletonList(r0)
            r4.f25301c = r5
        L2d:
            v5.u r5 = new v5.u
            r6 = 9400(0x24b8, float:1.3172E-41)
            byte[] r6 = new byte[r6]
            r0 = 0
            r5.<init>(r6, r0)
            r4.f25302d = r5
            android.util.SparseBooleanArray r5 = new android.util.SparseBooleanArray
            r5.<init>()
            r4.f25306h = r5
            android.util.SparseBooleanArray r6 = new android.util.SparseBooleanArray
            r6.<init>()
            r4.f25307i = r6
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
            r4.f25305g = r6
            android.util.SparseIntArray r2 = new android.util.SparseIntArray
            r2.<init>()
            r4.f25303e = r2
            v4.b0 r2 = new v4.b0
            r2.<init>(r7)
            r4.f25308j = r2
            m4.k r7 = p216m4.InterfaceC4366k.f17908Q
            r4.f25310l = r7
            r7 = -1
            r4.f25317s = r7
            r5.clear()
            r6.clear()
            android.util.SparseArray r5 = r1.m13263b()
            int r6 = r5.size()
            r7 = 0
        L72:
            if (r7 >= r6) goto L86
            android.util.SparseArray<v4.d0> r1 = r4.f25305g
            int r2 = r5.keyAt(r7)
            java.lang.Object r3 = r5.valueAt(r7)
            v4.d0 r3 = (p370v4.InterfaceC6525d0) r3
            r1.put(r2, r3)
            int r7 = r7 + 1
            goto L72
        L86:
            android.util.SparseArray<v4.d0> r5 = r4.f25305g
            v4.y r6 = new v4.y
            v4.c0$a r7 = new v4.c0$a
            r7.<init>(r4)
            r6.<init>(r7)
            r5.put(r0, r6)
            r5 = 0
            r4.f25315q = r5
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: b */
    public void mo9803b(long r11, long r13) {
            r10 = this;
            int r11 = r10.f25299a
            r12 = 1
            r0 = 0
            r1 = 2
            if (r11 == r1) goto L9
            r11 = 1
            goto La
        L9:
            r11 = 0
        La:
            p371v5.C6549a.m13291e(r11)
            java.util.List<v5.z> r11 = r10.f25301c
            int r11 = r11.size()
            r1 = 0
        L14:
            r2 = 0
            if (r1 >= r11) goto L4d
            java.util.List<v5.z> r4 = r10.f25301c
            java.lang.Object r4 = r4.get(r1)
            v5.z r4 = (p371v5.C6576z) r4
            long r5 = r4.m13446d()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            if (r5 != 0) goto L45
            long r5 = r4.m13445c()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L44
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 == 0) goto L44
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 == 0) goto L44
            r5 = 1
            goto L45
        L44:
            r5 = 0
        L45:
            if (r5 == 0) goto L4a
            r4.m13447e(r13)
        L4a:
            int r1 = r1 + 1
            goto L14
        L4d:
            int r11 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r11 == 0) goto L58
            v4.a0 r11 = r10.f25309k
            if (r11 == 0) goto L58
            r11.m9740e(r13)
        L58:
            v5.u r11 = r10.f25302d
            r11.m13392B(r0)
            android.util.SparseIntArray r11 = r10.f25303e
            r11.clear()
            r11 = 0
        L63:
            android.util.SparseArray<v4.d0> r12 = r10.f25305g
            int r12 = r12.size()
            if (r11 >= r12) goto L79
            android.util.SparseArray<v4.d0> r12 = r10.f25305g
            java.lang.Object r12 = r12.valueAt(r11)
            v4.d0 r12 = (p370v4.InterfaceC6525d0) r12
            r12.mo13249a()
            int r11 = r11 + 1
            goto L63
        L79:
            r10.f25316r = r0
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: c */
    public void mo9804c(p216m4.InterfaceC4366k r1) {
            r0 = this;
            r0.f25310l = r1
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: f */
    public boolean mo9805f(p216m4.InterfaceC4365j r8) {
            r7 = this;
            v5.u r0 = r7.f25302d
            byte[] r0 = r0.f25710a
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r8.mo9795o(r0, r2, r1)
            r1 = 0
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2c
            r3 = 0
        L10:
            r4 = 5
            r5 = 1
            if (r3 >= r4) goto L22
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r6 = 71
            if (r4 == r6) goto L1f
            r3 = 0
            goto L23
        L1f:
            int r3 = r3 + 1
            goto L10
        L22:
            r3 = 1
        L23:
            if (r3 == 0) goto L29
            r8.mo9791i(r1)
            return r5
        L29:
            int r1 = r1 + 1
            goto Lb
        L2c:
            return r2
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: i */
    public int mo9806i(p216m4.InterfaceC4365j r14, p216m4.C4377v r15) {
            r13 = this;
            long r8 = r14.mo9786a()
            boolean r0 = r13.f25312n
            r1 = 71
            r2 = -1
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L176
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L19
            int r0 = r13.f25299a
            if (r0 == r4) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            if (r0 == 0) goto L120
            v4.b0 r0 = r13.f25308j
            boolean r4 = r0.f25290d
            if (r4 != 0) goto L120
            int r4 = r13.f25317s
            if (r4 > 0) goto L2f
            goto L11c
        L2f:
            boolean r7 = r0.f25292f
            if (r7 != 0) goto L99
            long r7 = r14.mo9786a()
            int r9 = r0.f25287a
            long r9 = (long) r9
            long r9 = java.lang.Math.min(r9, r7)
            int r10 = (int) r9
            long r11 = (long) r10
            long r7 = r7 - r11
            long r11 = r14.mo9797q()
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 == 0) goto L4d
            r15.f17934a = r7
            goto Led
        L4d:
            v5.u r15 = r0.f25289c
            r15.m13392B(r10)
            r14.mo9790h()
            v5.u r15 = r0.f25289c
            byte[] r15 = r15.f25710a
            r14.mo9795o(r15, r6, r10)
            v5.u r14 = r0.f25289c
            int r15 = r14.f25711b
            int r6 = r14.f25712c
            int r7 = r6 + (-188)
        L64:
            if (r7 < r15) goto L94
            byte[] r8 = r14.f25710a
            r9 = -4
            r10 = 0
        L6a:
            r11 = 4
            if (r9 > r11) goto L83
            int r11 = r9 * 188
            int r11 = r11 + r7
            if (r11 < r15) goto L7f
            if (r11 >= r6) goto L7f
            r11 = r8[r11]
            if (r11 == r1) goto L79
            goto L7f
        L79:
            int r10 = r10 + r5
            r11 = 5
            if (r10 != r11) goto L80
            r8 = 1
            goto L84
        L7f:
            r10 = 0
        L80:
            int r9 = r9 + 1
            goto L6a
        L83:
            r8 = 0
        L84:
            if (r8 != 0) goto L87
            goto L91
        L87:
            long r8 = p064e.C1492f.m4047g(r14, r7, r4)
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 == 0) goto L91
            r2 = r8
            goto L94
        L91:
            int r7 = r7 + (-1)
            goto L64
        L94:
            r0.f25294h = r2
            r0.f25292f = r5
            goto Lec
        L99:
            long r7 = r0.f25294h
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 != 0) goto La1
            goto L11c
        La1:
            boolean r7 = r0.f25291e
            if (r7 != 0) goto Lef
            int r7 = r0.f25287a
            long r7 = (long) r7
            long r9 = r14.mo9786a()
            long r7 = java.lang.Math.min(r7, r9)
            int r8 = (int) r7
            long r9 = r14.mo9797q()
            long r11 = (long) r6
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 == 0) goto Lbd
            r15.f17934a = r11
            goto Led
        Lbd:
            v5.u r15 = r0.f25289c
            r15.m13392B(r8)
            r14.mo9790h()
            v5.u r15 = r0.f25289c
            byte[] r15 = r15.f25710a
            r14.mo9795o(r15, r6, r8)
            v5.u r14 = r0.f25289c
            int r15 = r14.f25711b
            int r6 = r14.f25712c
        Ld2:
            if (r15 >= r6) goto Le8
            byte[] r7 = r14.f25710a
            r7 = r7[r15]
            if (r7 == r1) goto Ldb
            goto Le5
        Ldb:
            long r7 = p064e.C1492f.m4047g(r14, r15, r4)
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 == 0) goto Le5
            r2 = r7
            goto Le8
        Le5:
            int r15 = r15 + 1
            goto Ld2
        Le8:
            r0.f25293g = r2
            r0.f25291e = r5
        Lec:
            r5 = 0
        Led:
            r6 = r5
            goto L11f
        Lef:
            long r4 = r0.f25293g
            int r15 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r15 != 0) goto Lf6
            goto L11c
        Lf6:
            v5.z r15 = r0.f25288b
            long r4 = r15.m13444b(r4)
            v5.z r15 = r0.f25288b
            long r7 = r0.f25294h
            long r7 = r15.m13444b(r7)
            long r7 = r7 - r4
            r0.f25295i = r7
            int r15 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r15 >= 0) goto L11c
            r15 = 65
            java.lang.String r1 = "Invalid duration: "
            java.lang.String r4 = ". Using TIME_UNSET instead."
            java.lang.String r15 = p304r4.C5780a.m12119a(r15, r1, r7, r4)
            java.lang.String r1 = "TsDurationReader"
            android.util.Log.w(r1, r15)
            r0.f25295i = r2
        L11c:
            r0.m13246a(r14)
        L11f:
            return r6
        L120:
            boolean r0 = r13.f25313o
            if (r0 != 0) goto L14d
            r13.f25313o = r5
            v4.b0 r0 = r13.f25308j
            long r4 = r0.f25295i
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L143
            v4.a0 r12 = new v4.a0
            v5.z r1 = r0.f25288b
            int r6 = r13.f25317s
            int r7 = r13.f25300b
            r0 = r12
            r2 = r4
            r4 = r8
            r0.<init>(r1, r2, r4, r6, r7)
            r13.f25309k = r12
            m4.k r0 = r13.f25310l
            m4.a$a r1 = r12.f17839a
            goto L14a
        L143:
            m4.k r0 = r13.f25310l
            m4.w$b r1 = new m4.w$b
            r1.<init>(r4, r10)
        L14a:
            r0.mo6044c(r1)
        L14d:
            boolean r0 = r13.f25314p
            if (r0 == 0) goto L163
            r0 = 0
            r13.f25314p = r0
            r13.mo9803b(r10, r10)
            long r1 = r14.mo9797q()
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 == 0) goto L164
            r15.f17934a = r10
            r14 = 1
            return r14
        L163:
            r0 = 0
        L164:
            r1 = 1
            v4.a0 r2 = r13.f25309k
            if (r2 == 0) goto L178
            boolean r2 = r2.m9737b()
            if (r2 == 0) goto L178
            v4.a0 r0 = r13.f25309k
            int r14 = r0.m9736a(r14, r15)
            return r14
        L176:
            r0 = 0
            r1 = 1
        L178:
            v5.u r15 = r13.f25302d
            byte[] r2 = r15.f25710a
            int r3 = r15.f25711b
            int r3 = 9400 - r3
            r4 = 188(0xbc, float:2.63E-43)
            if (r3 >= r4) goto L196
            int r15 = r15.m13398a()
            if (r15 <= 0) goto L191
            v5.u r3 = r13.f25302d
            int r3 = r3.f25711b
            java.lang.System.arraycopy(r2, r3, r2, r0, r15)
        L191:
            v5.u r3 = r13.f25302d
            r3.m13394D(r2, r15)
        L196:
            v5.u r15 = r13.f25302d
            int r15 = r15.m13398a()
            r3 = -1
            if (r15 >= r4) goto L1b4
            v5.u r15 = r13.f25302d
            int r15 = r15.f25712c
            int r5 = 9400 - r15
            int r5 = r14.mo6020b(r2, r15, r5)
            if (r5 != r3) goto L1ad
            r14 = 0
            goto L1b5
        L1ad:
            v5.u r3 = r13.f25302d
            int r15 = r15 + r5
            r3.m13395E(r15)
            goto L196
        L1b4:
            r14 = 1
        L1b5:
            if (r14 != 0) goto L1b8
            return r3
        L1b8:
            v5.u r14 = r13.f25302d
            int r15 = r14.f25711b
            int r2 = r14.f25712c
            byte[] r14 = r14.f25710a
            r3 = r15
        L1c1:
            if (r3 >= r2) goto L1cc
            r4 = r14[r3]
            r5 = 71
            if (r4 == r5) goto L1cc
            int r3 = r3 + 1
            goto L1c1
        L1cc:
            v5.u r14 = r13.f25302d
            r14.m13396F(r3)
            int r14 = r3 + 188
            r4 = 0
            if (r14 <= r2) goto L1ed
            int r2 = r13.f25316r
            int r3 = r3 - r15
            int r3 = r3 + r2
            r13.f25316r = r3
            int r15 = r13.f25299a
            r2 = 2
            if (r15 != r2) goto L1f0
            r15 = 376(0x178, float:5.27E-43)
            if (r3 > r15) goto L1e6
            goto L1f0
        L1e6:
            java.lang.String r14 = "Cannot find sync byte. Most likely not a Transport Stream."
            f4.s0 r14 = p088f4.C2044s0.m5407a(r14, r4)
            throw r14
        L1ed:
            r2 = 2
            r13.f25316r = r0
        L1f0:
            v5.u r15 = r13.f25302d
            int r3 = r15.f25712c
            if (r14 <= r3) goto L1f7
            return r0
        L1f7:
            int r15 = r15.m13403f()
            r5 = 8388608(0x800000, float:1.1754944E-38)
            r5 = r5 & r15
            if (r5 == 0) goto L202
            goto L29f
        L202:
            r5 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 & r15
            if (r5 == 0) goto L209
            r5 = 1
            goto L20a
        L209:
            r5 = 0
        L20a:
            r5 = r5 | 0
            r6 = 2096896(0x1fff00, float:2.938377E-39)
            r6 = r6 & r15
            int r6 = r6 >> 8
            r7 = r15 & 32
            if (r7 == 0) goto L218
            r7 = 1
            goto L219
        L218:
            r7 = 0
        L219:
            r10 = r15 & 16
            if (r10 == 0) goto L21f
            r10 = 1
            goto L220
        L21f:
            r10 = 0
        L220:
            if (r10 == 0) goto L22a
            android.util.SparseArray<v4.d0> r4 = r13.f25305g
            java.lang.Object r4 = r4.get(r6)
            v4.d0 r4 = (p370v4.InterfaceC6525d0) r4
        L22a:
            if (r4 != 0) goto L22e
            goto L29f
        L22e:
            int r10 = r13.f25299a
            if (r10 == r2) goto L24c
            r15 = r15 & 15
            android.util.SparseIntArray r10 = r13.f25303e
            int r11 = r15 + (-1)
            int r10 = r10.get(r6, r11)
            android.util.SparseIntArray r11 = r13.f25303e
            r11.put(r6, r15)
            if (r10 != r15) goto L244
            goto L29f
        L244:
            int r10 = r10 + r1
            r10 = r10 & 15
            if (r15 == r10) goto L24c
            r4.mo13249a()
        L24c:
            if (r7 == 0) goto L268
            v5.u r15 = r13.f25302d
            int r15 = r15.m13418u()
            v5.u r7 = r13.f25302d
            int r7 = r7.m13418u()
            r7 = r7 & 64
            if (r7 == 0) goto L260
            r7 = 2
            goto L261
        L260:
            r7 = 0
        L261:
            r5 = r5 | r7
            v5.u r7 = r13.f25302d
            int r15 = r15 - r1
            r7.m13397G(r15)
        L268:
            boolean r15 = r13.f25312n
            int r7 = r13.f25299a
            if (r7 == r2) goto L27b
            if (r15 != 0) goto L27b
            android.util.SparseBooleanArray r7 = r13.f25307i
            boolean r6 = r7.get(r6, r0)
            if (r6 != 0) goto L279
            goto L27b
        L279:
            r6 = 0
            goto L27c
        L27b:
            r6 = 1
        L27c:
            if (r6 == 0) goto L28d
            v5.u r6 = r13.f25302d
            r6.m13395E(r14)
            v5.u r6 = r13.f25302d
            r4.mo13251c(r6, r5)
            v5.u r4 = r13.f25302d
            r4.m13395E(r3)
        L28d:
            int r3 = r13.f25299a
            if (r3 == r2) goto L29f
            if (r15 != 0) goto L29f
            boolean r15 = r13.f25312n
            if (r15 == 0) goto L29f
            r2 = -1
            int r15 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r15 == 0) goto L29f
            r13.f25314p = r1
        L29f:
            v5.u r15 = r13.f25302d
            r15.m13396F(r14)
            return r0
    }

    @Override // p216m4.InterfaceC4364i
    public void release() {
            r0 = this;
            return
    }
}

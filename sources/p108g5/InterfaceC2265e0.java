package p108g5;

/* renamed from: g5.e0 */
/* loaded from: classes.dex */
public interface InterfaceC2265e0 {

    /* renamed from: g5.e0$a */
    public static class a implements p108g5.InterfaceC2265e0 {

        /* renamed from: a */
        public final java.util.Random f10330a;

        /* renamed from: b */
        public final int[] f10331b;

        /* renamed from: c */
        public final int[] f10332c;

        public a(int r2) {
                r1 = this;
                java.util.Random r0 = new java.util.Random
                r0.<init>()
                r1.<init>(r2, r0)
                return
        }

        public a(int r6, java.util.Random r7) {
                r5 = this;
                int[] r0 = new int[r6]
                r1 = 0
            L3:
                if (r1 >= r6) goto L13
                int r2 = r1 + 1
                int r3 = r7.nextInt(r2)
                r4 = r0[r3]
                r0[r1] = r4
                r0[r3] = r1
                r1 = r2
                goto L3
            L13:
                r5.<init>(r0, r7)
                return
        }

        public a(int[] r3, java.util.Random r4) {
                r2 = this;
                r2.<init>()
                r2.f10331b = r3
                r2.f10330a = r4
                int r4 = r3.length
                int[] r4 = new int[r4]
                r2.f10332c = r4
                r4 = 0
            Ld:
                int r0 = r3.length
                if (r4 >= r0) goto L19
                int[] r0 = r2.f10332c
                r1 = r3[r4]
                r0[r1] = r4
                int r4 = r4 + 1
                goto Ld
            L19:
                return
        }

        @Override // p108g5.InterfaceC2265e0
        /* renamed from: a */
        public int mo5996a() {
                r1 = this;
                int[] r0 = r1.f10331b
                int r0 = r0.length
                return r0
        }

        @Override // p108g5.InterfaceC2265e0
        /* renamed from: b */
        public p108g5.InterfaceC2265e0 mo5997b(int r8, int r9) {
                r7 = this;
                int r0 = r9 - r8
                int[] r1 = r7.f10331b
                int r1 = r1.length
                int r1 = r1 - r0
                int[] r1 = new int[r1]
                r2 = 0
                r3 = 0
            La:
                int[] r4 = r7.f10331b
                int r5 = r4.length
                if (r2 >= r5) goto L2b
                r5 = r4[r2]
                if (r5 < r8) goto L1a
                r5 = r4[r2]
                if (r5 >= r9) goto L1a
                int r3 = r3 + 1
                goto L28
            L1a:
                int r5 = r2 - r3
                r6 = r4[r2]
                if (r6 < r8) goto L24
                r4 = r4[r2]
                int r4 = r4 - r0
                goto L26
            L24:
                r4 = r4[r2]
            L26:
                r1[r5] = r4
            L28:
                int r2 = r2 + 1
                goto La
            L2b:
                g5.e0$a r8 = new g5.e0$a
                java.util.Random r9 = new java.util.Random
                java.util.Random r0 = r7.f10330a
                long r2 = r0.nextLong()
                r9.<init>(r2)
                r8.<init>(r1, r9)
                return r8
        }

        @Override // p108g5.InterfaceC2265e0
        /* renamed from: c */
        public int mo5998c(int r3) {
                r2 = this;
                int[] r0 = r2.f10332c
                r3 = r0[r3]
                int r3 = r3 + 1
                int[] r0 = r2.f10331b
                int r1 = r0.length
                if (r3 >= r1) goto Le
                r3 = r0[r3]
                goto Lf
            Le:
                r3 = -1
            Lf:
                return r3
        }

        @Override // p108g5.InterfaceC2265e0
        /* renamed from: d */
        public p108g5.InterfaceC2265e0 mo5999d(int r9, int r10) {
                r8 = this;
                int[] r0 = new int[r10]
                int[] r1 = new int[r10]
                r2 = 0
                r3 = 0
            L6:
                if (r3 >= r10) goto L26
                java.util.Random r4 = r8.f10330a
                int[] r5 = r8.f10331b
                int r5 = r5.length
                int r5 = r5 + 1
                int r4 = r4.nextInt(r5)
                r0[r3] = r4
                java.util.Random r4 = r8.f10330a
                int r5 = r3 + 1
                int r4 = r4.nextInt(r5)
                r6 = r1[r4]
                r1[r3] = r6
                int r3 = r3 + r9
                r1[r4] = r3
                r3 = r5
                goto L6
            L26:
                java.util.Arrays.sort(r0)
                int[] r3 = r8.f10331b
                int r3 = r3.length
                int r3 = r3 + r10
                int[] r3 = new int[r3]
                r4 = 0
                r5 = 0
            L31:
                int[] r6 = r8.f10331b
                int r7 = r6.length
                int r7 = r7 + r10
                if (r2 >= r7) goto L58
                if (r4 >= r10) goto L45
                r7 = r0[r4]
                if (r5 != r7) goto L45
                int r6 = r4 + 1
                r4 = r1[r4]
                r3[r2] = r4
                r4 = r6
                goto L55
            L45:
                int r7 = r5 + 1
                r5 = r6[r5]
                r3[r2] = r5
                r5 = r3[r2]
                if (r5 < r9) goto L54
                r5 = r3[r2]
                int r5 = r5 + r10
                r3[r2] = r5
            L54:
                r5 = r7
            L55:
                int r2 = r2 + 1
                goto L31
            L58:
                g5.e0$a r9 = new g5.e0$a
                java.util.Random r10 = new java.util.Random
                java.util.Random r0 = r8.f10330a
                long r0 = r0.nextLong()
                r10.<init>(r0)
                r9.<init>(r3, r10)
                return r9
        }

        @Override // p108g5.InterfaceC2265e0
        /* renamed from: e */
        public int mo6000e() {
                r2 = this;
                int[] r0 = r2.f10331b
                int r1 = r0.length
                if (r1 <= 0) goto L9
                r1 = 0
                r0 = r0[r1]
                goto La
            L9:
                r0 = -1
            La:
                return r0
        }

        @Override // p108g5.InterfaceC2265e0
        /* renamed from: f */
        public int mo6001f(int r2) {
                r1 = this;
                int[] r0 = r1.f10332c
                r2 = r0[r2]
                r0 = -1
                int r2 = r2 + r0
                if (r2 < 0) goto Lc
                int[] r0 = r1.f10331b
                r0 = r0[r2]
            Lc:
                return r0
        }

        @Override // p108g5.InterfaceC2265e0
        /* renamed from: g */
        public int mo6002g() {
                r2 = this;
                int[] r0 = r2.f10331b
                int r1 = r0.length
                if (r1 <= 0) goto Lb
                int r1 = r0.length
                int r1 = r1 + (-1)
                r0 = r0[r1]
                goto Lc
            Lb:
                r0 = -1
            Lc:
                return r0
        }

        @Override // p108g5.InterfaceC2265e0
        /* renamed from: h */
        public p108g5.InterfaceC2265e0 mo6003h() {
                r4 = this;
                g5.e0$a r0 = new g5.e0$a
                java.util.Random r1 = new java.util.Random
                java.util.Random r2 = r4.f10330a
                long r2 = r2.nextLong()
                r1.<init>(r2)
                r2 = 0
                r0.<init>(r2, r1)
                return r0
        }
    }

    /* renamed from: a */
    int mo5996a();

    /* renamed from: b */
    p108g5.InterfaceC2265e0 mo5997b(int r1, int r2);

    /* renamed from: c */
    int mo5998c(int r1);

    /* renamed from: d */
    p108g5.InterfaceC2265e0 mo5999d(int r1, int r2);

    /* renamed from: e */
    int mo6000e();

    /* renamed from: f */
    int mo6001f(int r1);

    /* renamed from: g */
    int mo6002g();

    /* renamed from: h */
    p108g5.InterfaceC2265e0 mo6003h();
}

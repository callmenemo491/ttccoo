package p121h4;

/* renamed from: h4.a */
/* loaded from: classes.dex */
public final class C2455a {

    /* renamed from: a */
    public static final int[] f10954a = null;

    /* renamed from: b */
    public static final int[] f10955b = null;

    /* renamed from: h4.a$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: h4.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f10956a;

        /* renamed from: b */
        public final int f10957b;

        /* renamed from: c */
        public final java.lang.String f10958c;

        public b(int r1, int r2, java.lang.String r3, p121h4.C2455a.a r4) {
                r0 = this;
                r0.<init>()
                r0.f10956a = r1
                r0.f10957b = r2
                r0.f10958c = r3
                return
        }
    }

    static {
            r0 = 13
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350} // fill-array
            p121h4.C2455a.f10954a = r0
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x0032: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1} // fill-array
            p121h4.C2455a.f10955b = r0
            return
    }

    /* renamed from: a */
    public static int m6234a(p216m4.C4355b0 r2) {
            r0 = 4
            int r0 = r2.m9766k(r0)
            r1 = 15
            if (r0 != r1) goto L10
            r0 = 24
            int r2 = r2.m9766k(r0)
            goto L18
        L10:
            r2 = 13
            if (r0 >= r2) goto L19
            int[] r2 = p121h4.C2455a.f10954a
            r2 = r2[r0]
        L18:
            return r2
        L19:
            r2 = 0
            f4.s0 r2 = p088f4.C2044s0.m5407a(r2, r2)
            throw r2
    }

    /* renamed from: b */
    public static p121h4.C2455a.b m6235b(p216m4.C4355b0 r12, boolean r13) {
            r0 = 5
            int r1 = r12.m9766k(r0)
            r2 = 31
            r3 = 6
            if (r1 != r2) goto L10
            int r1 = r12.m9766k(r3)
            int r1 = r1 + 32
        L10:
            int r4 = m6234a(r12)
            r5 = 4
            int r6 = r12.m9766k(r5)
            r7 = 19
            java.lang.String r8 = "mp4a.40."
            java.lang.String r8 = p064e.C1490d.m4039a(r7, r8, r1)
            r9 = 22
            if (r1 == r0) goto L29
            r10 = 29
            if (r1 != r10) goto L40
        L29:
            int r4 = m6234a(r12)
            int r0 = r12.m9766k(r0)
            if (r0 != r2) goto L39
            int r0 = r12.m9766k(r3)
            int r0 = r0 + 32
        L39:
            r1 = r0
            if (r1 != r9) goto L40
            int r6 = r12.m9766k(r5)
        L40:
            if (r13 == 0) goto Ldc
            r13 = 17
            r0 = 1
            r2 = 3
            r10 = 2
            if (r1 == r0) goto L71
            if (r1 == r10) goto L71
            if (r1 == r2) goto L71
            if (r1 == r5) goto L71
            if (r1 == r3) goto L71
            r5 = 7
            if (r1 == r5) goto L71
            if (r1 == r13) goto L71
            switch(r1) {
                case 19: goto L71;
                case 20: goto L71;
                case 21: goto L71;
                case 22: goto L71;
                case 23: goto L71;
                default: goto L59;
            }
        L59:
            r12 = 42
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            java.lang.String r12 = "Unsupported audio object type: "
            r13.append(r12)
            r13.append(r1)
            java.lang.String r12 = r13.toString()
            f4.s0 r12 = p088f4.C2044s0.m5408b(r12)
            throw r12
        L71:
            boolean r5 = r12.m9765j()
            if (r5 == 0) goto L7e
            java.lang.String r5 = "AacUtil"
            java.lang.String r11 = "Unexpected frameLengthFlag = 1"
            android.util.Log.w(r5, r11)
        L7e:
            boolean r5 = r12.m9765j()
            if (r5 == 0) goto L89
            r5 = 14
            r12.m9775t(r5)
        L89:
            boolean r5 = r12.m9765j()
            if (r6 == 0) goto Ld6
            r11 = 20
            if (r1 == r3) goto L95
            if (r1 != r11) goto L98
        L95:
            r12.m9775t(r2)
        L98:
            if (r5 == 0) goto Lb1
            if (r1 != r9) goto La1
            r3 = 16
            r12.m9775t(r3)
        La1:
            if (r1 == r13) goto Lab
            if (r1 == r7) goto Lab
            if (r1 == r11) goto Lab
            r13 = 23
            if (r1 != r13) goto Lae
        Lab:
            r12.m9775t(r2)
        Lae:
            r12.m9775t(r0)
        Lb1:
            switch(r1) {
                case 17: goto Lb5;
                case 18: goto Lb4;
                case 19: goto Lb5;
                case 20: goto Lb5;
                case 21: goto Lb5;
                case 22: goto Lb5;
                case 23: goto Lb5;
                default: goto Lb4;
            }
        Lb4:
            goto Ldc
        Lb5:
            int r12 = r12.m9766k(r10)
            if (r12 == r10) goto Lbe
            if (r12 == r2) goto Lbe
            goto Ldc
        Lbe:
            r13 = 33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r13)
            java.lang.String r13 = "Unsupported epConfig: "
            r0.append(r13)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            f4.s0 r12 = p088f4.C2044s0.m5408b(r12)
            throw r12
        Ld6:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            r12.<init>()
            throw r12
        Ldc:
            int[] r12 = p121h4.C2455a.f10955b
            r12 = r12[r6]
            r13 = -1
            r0 = 0
            if (r12 == r13) goto Lea
            h4.a$b r13 = new h4.a$b
            r13.<init>(r4, r12, r8, r0)
            return r13
        Lea:
            f4.s0 r12 = p088f4.C2044s0.m5407a(r0, r0)
            throw r12
    }

    /* renamed from: c */
    public static p121h4.C2455a.b m6236c(byte[] r3) {
            m4.b0 r0 = new m4.b0
            r1 = 1
            r2 = 0
            r0.<init>(r3, r1, r2)
            r3 = 0
            h4.a$b r3 = m6235b(r0, r3)
            return r3
    }
}

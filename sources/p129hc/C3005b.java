package p129hc;

/* renamed from: hc.b */
/* loaded from: classes.dex */
public final class C3005b extends p333t1.AbstractC6102f {

    /* renamed from: Y */
    public static final char[] f12126Y = null;

    /* renamed from: Z */
    public static final char[] f12127Z = null;

    /* renamed from: a0 */
    public static final char[] f12128a0 = null;

    /* renamed from: b0 */
    public static final char f12129b0 = 0;

    static {
            r0 = 4
            char[] r1 = new char[r0]
            r1 = {x001c: FILL_ARRAY_DATA , data: [65, 66, 67, 68} // fill-array
            p129hc.C3005b.f12126Y = r1
            char[] r2 = new char[r0]
            r2 = {x0024: FILL_ARRAY_DATA , data: [84, 78, 42, 69} // fill-array
            p129hc.C3005b.f12127Z = r2
            char[] r0 = new char[r0]
            r0 = {x002c: FILL_ARRAY_DATA , data: [47, 58, 43, 46} // fill-array
            p129hc.C3005b.f12128a0 = r0
            r0 = 0
            char r0 = r1[r0]
            p129hc.C3005b.f12129b0 = r0
            return
    }

    public C3005b() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // p333t1.AbstractC6102f
    /* renamed from: b */
    public boolean[] mo7404b(java.lang.String r11) {
            r10 = this;
            int r0 = r11.length()
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 >= r3) goto Lf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L71
        Lf:
            char r0 = r11.charAt(r1)
            char r0 = java.lang.Character.toUpperCase(r0)
            int r3 = r11.length()
            int r3 = r3 - r2
            char r3 = r11.charAt(r3)
            char r3 = java.lang.Character.toUpperCase(r3)
            char[] r4 = p129hc.C3005b.f12126Y
            boolean r5 = p129hc.C3004a.m7400i(r4, r0)
            boolean r4 = p129hc.C3004a.m7400i(r4, r3)
            char[] r6 = p129hc.C3005b.f12127Z
            boolean r0 = p129hc.C3004a.m7400i(r6, r0)
            boolean r3 = p129hc.C3004a.m7400i(r6, r3)
            java.lang.String r6 = "Invalid start/end guards: "
            if (r5 == 0) goto L51
            if (r4 == 0) goto L3f
            goto L80
        L3f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L51:
            if (r0 == 0) goto L68
            if (r3 == 0) goto L56
            goto L80
        L56:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L68:
            if (r4 != 0) goto L151
            if (r3 != 0) goto L151
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L71:
            char r3 = p129hc.C3005b.f12129b0
            r0.append(r3)
            r0.append(r11)
            r0.append(r3)
            java.lang.String r11 = r0.toString()
        L80:
            r0 = 20
            r3 = 1
        L83:
            int r4 = r11.length()
            int r4 = r4 - r2
            if (r3 >= r4) goto Ld6
            char r4 = r11.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto Ld1
            char r4 = r11.charAt(r3)
            r5 = 45
            if (r4 == r5) goto Ld1
            char r4 = r11.charAt(r3)
            r5 = 36
            if (r4 != r5) goto La5
            goto Ld1
        La5:
            char[] r4 = p129hc.C3005b.f12128a0
            char r5 = r11.charAt(r3)
            boolean r4 = p129hc.C3004a.m7400i(r4, r5)
            if (r4 == 0) goto Lb4
            int r0 = r0 + 10
            goto Ld3
        Lb4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot encode : '"
            r1.<init>(r2)
            char r11 = r11.charAt(r3)
            r1.append(r11)
            r11 = 39
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        Ld1:
            int r0 = r0 + 9
        Ld3:
            int r3 = r3 + 1
            goto L83
        Ld6:
            int r3 = r11.length()
            int r3 = r3 - r2
            int r3 = r3 + r0
            boolean[] r0 = new boolean[r3]
            r3 = 0
            r4 = 0
        Le0:
            int r5 = r11.length()
            if (r3 >= r5) goto L150
            char r5 = r11.charAt(r3)
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r3 == 0) goto Lf7
            int r6 = r11.length()
            int r6 = r6 - r2
            if (r3 != r6) goto L113
        Lf7:
            r6 = 42
            if (r5 == r6) goto L111
            r6 = 69
            if (r5 == r6) goto L10e
            r6 = 78
            if (r5 == r6) goto L10b
            r6 = 84
            if (r5 == r6) goto L108
            goto L113
        L108:
            r5 = 65
            goto L113
        L10b:
            r5 = 66
            goto L113
        L10e:
            r5 = 68
            goto L113
        L111:
            r5 = 67
        L113:
            r6 = 0
        L114:
            char[] r7 = p129hc.C3004a.f12120d
            int r8 = r7.length
            if (r6 >= r8) goto L125
            char r7 = r7[r6]
            if (r5 != r7) goto L122
            int[] r5 = p129hc.C3004a.f12121e
            r5 = r5[r6]
            goto L126
        L122:
            int r6 = r6 + 1
            goto L114
        L125:
            r5 = 0
        L126:
            r6 = 0
            r7 = 1
        L128:
            r8 = 0
        L129:
            r9 = 7
            if (r6 >= r9) goto L142
            r0[r4] = r7
            int r4 = r4 + 1
            int r9 = 6 - r6
            int r9 = r5 >> r9
            r9 = r9 & r2
            if (r9 == 0) goto L13d
            if (r8 != r2) goto L13a
            goto L13d
        L13a:
            int r8 = r8 + 1
            goto L129
        L13d:
            r7 = r7 ^ 1
            int r6 = r6 + 1
            goto L128
        L142:
            int r5 = r11.length()
            int r5 = r5 - r2
            if (r3 >= r5) goto L14d
            r0[r4] = r1
            int r4 = r4 + 1
        L14d:
            int r3 = r3 + 1
            goto Le0
        L150:
            return r0
        L151:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
    }
}

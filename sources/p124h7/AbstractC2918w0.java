package p124h7;

/* renamed from: h7.w0 */
/* loaded from: classes.dex */
public abstract class AbstractC2918w0 implements java.util.Iterator {

    /* renamed from: Y */
    public T f11975Y;

    /* renamed from: Z */
    public int f11976Z;

    /* renamed from: a0 */
    public final java.lang.CharSequence f11977a0;

    /* renamed from: b0 */
    public int f11978b0;

    /* renamed from: c0 */
    public int f11979c0;

    public AbstractC2918w0(p124h7.C2661hd r2, java.lang.CharSequence r3) {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.f11976Z = r0
            r0 = 0
            r1.f11978b0 = r0
            h7.id<ResultT, CallbackT> r2 = r2.f11589Z
            h7.z7 r2 = (p124h7.C2979z7) r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.f11979c0 = r2
            r1.f11977a0 = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r13 = this;
            int r0 = r13.f11976Z
            r1 = 4
            if (r0 == r1) goto L109
            int r2 = r0 + (-1)
            r3 = 0
            if (r0 == 0) goto L108
            r0 = 0
            r4 = 1
            if (r2 == 0) goto L106
            r5 = 2
            if (r2 == r5) goto L107
            r13.f11976Z = r1
            int r1 = r13.f11978b0
        L15:
            int r2 = r13.f11978b0
            r6 = 3
            r7 = -1
            if (r2 == r7) goto Lfc
            r8 = r13
            h7.a r8 = (p124h7.C2520a) r8
            int r9 = r8.f11348d0
            switch(r9) {
                case 0: goto L24;
                default: goto L23;
            }
        L23:
            goto L3b
        L24:
            java.lang.Object r9 = r8.f11349e0
            h7.cc r9 = (p124h7.C2570cc) r9
            java.util.regex.Matcher r9 = r9.f11420a
            boolean r2 = r9.find(r2)
            if (r2 == 0) goto L54
            java.lang.Object r2 = r8.f11349e0
            h7.cc r2 = (p124h7.C2570cc) r2
            java.util.regex.Matcher r2 = r2.f11420a
            int r2 = r2.start()
            goto L55
        L3b:
            java.lang.CharSequence r9 = r8.f11977a0
            int r10 = r9.length()
            if (r2 < 0) goto Lbb
            if (r2 <= r10) goto L47
            goto Lbb
        L47:
            if (r2 >= r10) goto L54
            char r11 = r9.charAt(r2)
            r12 = 46
            if (r11 == r12) goto L55
            int r2 = r2 + 1
            goto L47
        L54:
            r2 = -1
        L55:
            if (r2 != r7) goto L61
            java.lang.CharSequence r2 = r13.f11977a0
            int r2 = r2.length()
            r13.f11978b0 = r7
            r8 = -1
            goto L76
        L61:
            int r9 = r8.f11348d0
            switch(r9) {
                case 0: goto L67;
                default: goto L66;
            }
        L66:
            goto L72
        L67:
            java.lang.Object r8 = r8.f11349e0
            h7.cc r8 = (p124h7.C2570cc) r8
            java.util.regex.Matcher r8 = r8.f11420a
            int r8 = r8.end()
            goto L74
        L72:
            int r8 = r2 + 1
        L74:
            r13.f11978b0 = r8
        L76:
            if (r8 != r1) goto L87
            int r8 = r8 + 1
            r13.f11978b0 = r8
            java.lang.CharSequence r2 = r13.f11977a0
            int r2 = r2.length()
            if (r8 <= r2) goto L15
            r13.f11978b0 = r7
            goto L15
        L87:
            if (r1 >= r2) goto L8e
            java.lang.CharSequence r3 = r13.f11977a0
            r3.charAt(r1)
        L8e:
            if (r1 >= r2) goto L97
            java.lang.CharSequence r3 = r13.f11977a0
            int r5 = r2 + (-1)
            r3.charAt(r5)
        L97:
            int r3 = r13.f11979c0
            if (r3 != r4) goto Lad
            java.lang.CharSequence r2 = r13.f11977a0
            int r2 = r2.length()
            r13.f11978b0 = r7
            if (r2 <= r1) goto Lb0
            java.lang.CharSequence r3 = r13.f11977a0
            int r5 = r2 + (-1)
            r3.charAt(r5)
            goto Lb0
        Lad:
            int r3 = r3 + r7
            r13.f11979c0 = r3
        Lb0:
            java.lang.CharSequence r3 = r13.f11977a0
            java.lang.CharSequence r1 = r3.subSequence(r1, r2)
            java.lang.String r3 = r1.toString()
            goto Lfe
        Lbb:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = "index"
            if (r2 < 0) goto Le8
            if (r10 >= 0) goto Ld1
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 26
            java.lang.String r2 = "negative size: "
            java.lang.String r1 = p064e.C1490d.m4039a(r1, r2, r10)
            r0.<init>(r1)
            throw r0
        Ld1:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r0] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r6[r5] = r0
            java.lang.String r0 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r0 = p036c6.C0906q0.m2624l(r0, r6)
            goto Lf8
        Le8:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r0] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5[r4] = r0
            java.lang.String r0 = "%s (%s) must not be negative"
            java.lang.String r0 = p036c6.C0906q0.m2624l(r0, r5)
        Lf8:
            r1.<init>(r0)
            throw r1
        Lfc:
            r13.f11976Z = r6
        Lfe:
            r13.f11975Y = r3
            int r1 = r13.f11976Z
            if (r1 == r6) goto L107
            r13.f11976Z = r4
        L106:
            r0 = 1
        L107:
            return r0
        L108:
            throw r3
        L109:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            r0 = 2
            r2.f11976Z = r0
            T r0 = r2.f11975Y
            r1 = 0
            r2.f11975Y = r1
            return r0
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}

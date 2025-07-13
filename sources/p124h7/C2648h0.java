package p124h7;

/* renamed from: h7.h0 */
/* loaded from: classes.dex */
public final class C2648h0 implements p124h7.InterfaceC2899v {

    /* renamed from: a */
    public final p124h7.InterfaceC2935x f11561a;

    /* renamed from: b */
    public final java.lang.String f11562b;

    /* renamed from: c */
    public final java.lang.Object[] f11563c;

    /* renamed from: d */
    public final int f11564d;

    public C2648h0(p124h7.InterfaceC2935x r5, java.lang.String r6, java.lang.Object[] r7) {
            r4 = this;
            r4.<init>()
            r4.f11561a = r5
            r4.f11562b = r6
            r4.f11563c = r7
            r5 = 1
            r7 = 0
            char r7 = r6.charAt(r7)     // Catch: java.lang.StringIndexOutOfBoundsException -> L10
            goto L36
        L10:
            char[] r6 = r6.toCharArray()
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6)
            char r7 = r0.charAt(r7)     // Catch: java.lang.StringIndexOutOfBoundsException -> L1f
            r6 = r0
            goto L36
        L1f:
            int r1 = r0.length()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5d java.lang.StringIndexOutOfBoundsException -> L5f
            char[] r1 = new char[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5d java.lang.StringIndexOutOfBoundsException -> L5f
            int r2 = r0.length()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5d java.lang.StringIndexOutOfBoundsException -> L5f
            r0.getChars(r7, r2, r1, r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5d java.lang.StringIndexOutOfBoundsException -> L5f
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5d java.lang.StringIndexOutOfBoundsException -> L5f
            r2.<init>(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5d java.lang.StringIndexOutOfBoundsException -> L5f
            char r7 = r2.charAt(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57 java.lang.StringIndexOutOfBoundsException -> L59
            r6 = r2
        L36:
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r7 >= r0) goto L3e
            r4.f11564d = r7
            return
        L3e:
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = 13
        L42:
            int r2 = r5 + 1
            char r5 = r6.charAt(r5)
            if (r5 < r0) goto L52
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r1
            r7 = r7 | r5
            int r1 = r1 + 13
            r5 = r2
            goto L42
        L52:
            int r5 = r5 << r1
            r5 = r5 | r7
            r4.f11564d = r5
            return
        L57:
            r0 = move-exception
            goto L5a
        L59:
            r0 = move-exception
        L5a:
            r1 = r0
            r0 = r2
            goto L60
        L5d:
            r1 = move-exception
            goto L60
        L5f:
            r1 = move-exception
        L60:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r7] = r0
            int r6 = r6.length
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r5] = r6
            java.lang.String r5 = "Failed parsing '%s' with charArray.length of %d"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r2.<init>(r5, r1)
            throw r2
    }

    @Override // p124h7.InterfaceC2899v
    /* renamed from: a */
    public final p124h7.InterfaceC2935x mo6767a() {
            r1 = this;
            h7.x r0 = r1.f11561a
            return r0
    }

    @Override // p124h7.InterfaceC2899v
    /* renamed from: b */
    public final boolean mo6768b() {
            r2 = this;
            int r0 = r2.f11564d
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // p124h7.InterfaceC2899v
    /* renamed from: c */
    public final int mo6769c() {
            r2 = this;
            int r0 = r2.f11564d
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L7
            return r1
        L7:
            r0 = 2
            return r0
    }
}

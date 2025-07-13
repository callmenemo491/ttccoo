package p336t4;

/* renamed from: t4.m */
/* loaded from: classes.dex */
public final class C6168m {

    /* renamed from: a */
    public final boolean f23870a;

    /* renamed from: b */
    public final java.lang.String f23871b;

    /* renamed from: c */
    public final p216m4.InterfaceC4381z.a f23872c;

    /* renamed from: d */
    public final int f23873d;

    /* renamed from: e */
    public final byte[] f23874e;

    public C6168m(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            if (r11 != 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            r2 = r2 ^ r3
            p371v5.C6549a.m13288b(r2)
            r4.f23870a = r5
            r4.f23871b = r6
            r4.f23873d = r7
            r4.f23874e = r11
            m4.z$a r5 = new m4.z$a
            r7 = 2
            if (r6 != 0) goto L21
            goto L7f
        L21:
            int r11 = r6.hashCode()
            r2 = 3
            switch(r11) {
                case 3046605: goto L4b;
                case 3046671: goto L40;
                case 3049879: goto L35;
                case 3049895: goto L2a;
                default: goto L29;
            }
        L29:
            goto L53
        L2a:
            java.lang.String r11 = "cens"
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L33
            goto L53
        L33:
            r0 = 3
            goto L54
        L35:
            java.lang.String r11 = "cenc"
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L3e
            goto L53
        L3e:
            r0 = 2
            goto L54
        L40:
            java.lang.String r11 = "cbcs"
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L49
            goto L53
        L49:
            r0 = 1
            goto L54
        L4b:
            java.lang.String r11 = "cbc1"
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L54
        L53:
            r0 = -1
        L54:
            if (r0 == 0) goto L7e
            if (r0 == r1) goto L7e
            if (r0 == r7) goto L7f
            if (r0 == r2) goto L7f
            int r7 = r6.length()
            int r7 = r7 + 68
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r7)
            java.lang.String r7 = "Unsupported protection scheme type '"
            r11.append(r7)
            r11.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L7f
        L7e:
            r1 = 2
        L7f:
            r5.<init>(r1, r8, r9, r10)
            r4.f23872c = r5
            return
    }
}

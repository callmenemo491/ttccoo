package p232n5;

/* renamed from: n5.b */
/* loaded from: classes.dex */
public final class C4688b {

    /* renamed from: a */
    public final int f18687a;

    /* renamed from: b */
    public final int f18688b;

    /* renamed from: c */
    public final int f18689c;

    /* renamed from: d */
    public final int f18690d;

    /* renamed from: e */
    public final int f18691e;

    public C4688b(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.f18687a = r1
            r0.f18688b = r2
            r0.f18689c = r3
            r0.f18690d = r4
            r0.f18691e = r5
            return
    }

    /* renamed from: a */
    public static p232n5.C4688b m10731a(java.lang.String r12) {
            java.lang.String r0 = "Format:"
            boolean r0 = r12.startsWith(r0)
            p371v5.C6549a.m13288b(r0)
            r0 = 7
            java.lang.String r12 = r12.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r12 = android.text.TextUtils.split(r12, r0)
            r0 = 0
            r1 = -1
            r2 = 0
            r4 = -1
            r5 = -1
            r6 = -1
            r7 = -1
        L1b:
            int r3 = r12.length
            if (r2 >= r3) goto L76
            r3 = r12[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = p185k7.C3836i.m8629n(r3)
            java.util.Objects.requireNonNull(r3)
            int r8 = r3.hashCode()
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r8) {
                case 100571: goto L57;
                case 3556653: goto L4c;
                case 109757538: goto L41;
                case 109780401: goto L36;
                default: goto L35;
            }
        L35:
            goto L62
        L36:
            java.lang.String r8 = "style"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L3f
            goto L62
        L3f:
            r3 = 3
            goto L63
        L41:
            java.lang.String r8 = "start"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L4a
            goto L62
        L4a:
            r3 = 2
            goto L63
        L4c:
            java.lang.String r8 = "text"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L55
            goto L62
        L55:
            r3 = 1
            goto L63
        L57:
            java.lang.String r8 = "end"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L60
            goto L62
        L60:
            r3 = 0
            goto L63
        L62:
            r3 = -1
        L63:
            if (r3 == 0) goto L72
            if (r3 == r11) goto L70
            if (r3 == r10) goto L6e
            if (r3 == r9) goto L6c
            goto L73
        L6c:
            r6 = r2
            goto L73
        L6e:
            r4 = r2
            goto L73
        L70:
            r7 = r2
            goto L73
        L72:
            r5 = r2
        L73:
            int r2 = r2 + 1
            goto L1b
        L76:
            if (r4 == r1) goto L84
            if (r5 == r1) goto L84
            if (r7 == r1) goto L84
            n5.b r0 = new n5.b
            int r8 = r12.length
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L85
        L84:
            r0 = 0
        L85:
            return r0
    }
}

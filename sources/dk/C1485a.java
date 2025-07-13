package dk;

/* renamed from: dk.a */
/* loaded from: classes.dex */
public final class C1485a extends ck.AbstractC0993b {

    /* renamed from: a0 */
    public static java.lang.String f7247a0;

    /* renamed from: b0 */
    public static java.lang.String f7248b0;

    /* renamed from: Z */
    public final transient java.util.logging.Logger f7249Z;

    static {
            java.lang.Class<dk.a> r0 = dk.C1485a.class
            java.lang.String r0 = r0.getName()
            dk.C1485a.f7247a0 = r0
            java.lang.Class<ck.b> r0 = ck.AbstractC0993b.class
            java.lang.String r0 = r0.getName()
            dk.C1485a.f7248b0 = r0
            return
    }

    public C1485a(java.util.logging.Logger r1) {
            r0 = this;
            r0.<init>()
            r0.f7249Z = r1
            java.lang.String r1 = r1.getName()
            r0.f5083Y = r1
            return
    }

    @Override // p015ak.InterfaceC0118b
    /* renamed from: b */
    public void mo178b(java.lang.String r11, java.lang.Object r12) {
            r10 = this;
            java.util.logging.Logger r0 = r10.f7249Z
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L12b
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r12
            r12 = 0
            r3 = r1[r2]
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L1a
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            goto L1b
        L1a:
            r3 = r12
        L1b:
            if (r3 == 0) goto L23
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.System.arraycopy(r1, r2, r4, r2, r2)
            r1 = r4
        L23:
            r4 = -1
            if (r11 != 0) goto L2d
            ck.a r11 = new ck.a
            r11.<init>(r12, r1, r3)
            goto Lc0
        L2d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r5 = r11.length()
            int r5 = r5 + 50
            r12.<init>(r5)
            r5 = 0
            r6 = 0
        L3a:
            int r7 = r1.length
            if (r5 >= r7) goto Lb0
            java.lang.String r7 = "{}"
            int r7 = r11.indexOf(r7, r6)
            if (r7 != r4) goto L60
            if (r6 != 0) goto L4f
            ck.a r12 = new ck.a
            r12.<init>(r11, r1, r3)
            r11 = r12
            goto Lc0
        L4f:
            int r5 = r11.length()
            r12.append(r11, r6, r5)
            ck.a r11 = new ck.a
            java.lang.String r12 = r12.toString()
            r11.<init>(r12, r1, r3)
            goto Lc0
        L60:
            r8 = 92
            if (r7 != 0) goto L65
            goto L6f
        L65:
            int r9 = r7 + (-1)
            char r9 = r11.charAt(r9)
            if (r9 != r8) goto L6f
            r9 = 1
            goto L70
        L6f:
            r9 = 0
        L70:
            if (r9 == 0) goto L9e
            r9 = 2
            if (r7 < r9) goto L7f
            int r9 = r7 + (-2)
            char r9 = r11.charAt(r9)
            if (r9 != r8) goto L7f
            r8 = 1
            goto L80
        L7f:
            r8 = 0
        L80:
            if (r8 != 0) goto L91
            int r5 = r5 + (-1)
            int r8 = r7 + (-1)
            r12.append(r11, r6, r8)
            r6 = 123(0x7b, float:1.72E-43)
            r12.append(r6)
            int r7 = r7 + 1
            goto Lad
        L91:
            int r8 = r7 + (-1)
            r12.append(r11, r6, r8)
            r6 = r1[r5]
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            goto La8
        L9e:
            r12.append(r11, r6, r7)
            r6 = r1[r5]
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
        La8:
            p209lh.C4304a.m9617k(r12, r6, r8)
            int r7 = r7 + 2
        Lad:
            r6 = r7
            int r5 = r5 + r0
            goto L3a
        Lb0:
            int r5 = r11.length()
            r12.append(r11, r6, r5)
            ck.a r11 = new ck.a
            java.lang.String r12 = r12.toString()
            r11.<init>(r12, r1, r3)
        Lc0:
            java.lang.String r12 = dk.C1485a.f7247a0
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            java.lang.String r3 = r11.f5080a
            java.lang.Throwable r11 = r11.f5081b
            java.util.logging.LogRecord r5 = new java.util.logging.LogRecord
            r5.<init>(r1, r3)
            java.lang.String r1 = r10.f5083Y
            r5.setLoggerName(r1)
            r5.setThrown(r11)
            java.lang.Throwable r11 = new java.lang.Throwable
            r11.<init>()
            java.lang.StackTraceElement[] r11 = r11.getStackTrace()
        Lde:
            int r1 = r11.length
            if (r2 >= r1) goto Lf9
            r1 = r11[r2]
            java.lang.String r1 = r1.getClassName()
            boolean r3 = r1.equals(r12)
            if (r3 != 0) goto Lfa
            java.lang.String r3 = dk.C1485a.f7248b0
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lf6
            goto Lfa
        Lf6:
            int r2 = r2 + 1
            goto Lde
        Lf9:
            r2 = -1
        Lfa:
            int r2 = r2 + r0
            int r1 = r11.length
            if (r2 >= r1) goto L113
            r1 = r11[r2]
            java.lang.String r1 = r1.getClassName()
            boolean r3 = r1.equals(r12)
            if (r3 != 0) goto Lfa
            java.lang.String r3 = dk.C1485a.f7248b0
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lfa
            goto L114
        L113:
            r2 = -1
        L114:
            if (r2 == r4) goto L126
            r11 = r11[r2]
            java.lang.String r12 = r11.getClassName()
            r5.setSourceClassName(r12)
            java.lang.String r11 = r11.getMethodName()
            r5.setSourceMethodName(r11)
        L126:
            java.util.logging.Logger r11 = r10.f7249Z
            r11.log(r5)
        L12b:
            return
    }
}

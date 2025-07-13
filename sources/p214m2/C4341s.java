package p214m2;

/* renamed from: m2.s */
/* loaded from: classes.dex */
public final class C4341s extends java.lang.Exception {

    /* renamed from: d0 */
    public static final java.lang.StackTraceElement[] f17799d0 = null;

    /* renamed from: Y */
    public final java.util.List<java.lang.Throwable> f17800Y;

    /* renamed from: Z */
    public p180k2.InterfaceC3671c f17801Z;

    /* renamed from: a0 */
    public com.bumptech.glide.load.EnumC1008a f17802a0;

    /* renamed from: b0 */
    public java.lang.Class<?> f17803b0;

    /* renamed from: c0 */
    public java.lang.String f17804c0;

    /* renamed from: m2.s$a */
    public static final class a implements java.lang.Appendable {

        /* renamed from: Y */
        public final java.lang.Appendable f17805Y;

        /* renamed from: Z */
        public boolean f17806Z;

        public a(java.lang.Appendable r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f17806Z = r0
                r1.f17805Y = r2
                return
        }

        @Override // java.lang.Appendable
        public java.lang.Appendable append(char r4) {
                r3 = this;
                boolean r0 = r3.f17806Z
                r1 = 0
                if (r0 == 0) goto Le
                r3.f17806Z = r1
                java.lang.Appendable r0 = r3.f17805Y
                java.lang.String r2 = "  "
                r0.append(r2)
            Le:
                r0 = 10
                if (r4 != r0) goto L13
                r1 = 1
            L13:
                r3.f17806Z = r1
                java.lang.Appendable r0 = r3.f17805Y
                r0.append(r4)
                return r3
        }

        @Override // java.lang.Appendable
        public java.lang.Appendable append(java.lang.CharSequence r3) {
                r2 = this;
                if (r3 != 0) goto L4
                java.lang.String r3 = ""
            L4:
                r0 = 0
                int r1 = r3.length()
                r2.append(r3, r0, r1)
                return r2
        }

        @Override // java.lang.Appendable
        public java.lang.Appendable append(java.lang.CharSequence r4, int r5, int r6) {
                r3 = this;
                if (r4 != 0) goto L4
                java.lang.String r4 = ""
            L4:
                boolean r0 = r3.f17806Z
                r1 = 0
                if (r0 == 0) goto L12
                r3.f17806Z = r1
                java.lang.Appendable r0 = r3.f17805Y
                java.lang.String r2 = "  "
                r0.append(r2)
            L12:
                int r0 = r4.length()
                if (r0 <= 0) goto L23
                int r0 = r6 + (-1)
                char r0 = r4.charAt(r0)
                r2 = 10
                if (r0 != r2) goto L23
                r1 = 1
            L23:
                r3.f17806Z = r1
                java.lang.Appendable r0 = r3.f17805Y
                r0.append(r4, r5, r6)
                return r3
        }
    }

    static {
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            p214m2.C4341s.f17799d0 = r0
            return
    }

    public C4341s(java.lang.String r2) {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            r1.<init>()
            r1.f17804c0 = r2
            java.lang.StackTraceElement[] r2 = p214m2.C4341s.f17799d0
            r1.setStackTrace(r2)
            r1.f17800Y = r0
            return
    }

    public C4341s(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r0.<init>()
            r0.f17804c0 = r1
            java.lang.StackTraceElement[] r1 = p214m2.C4341s.f17799d0
            r0.setStackTrace(r1)
            r0.f17800Y = r2
            return
    }

    public C4341s(java.lang.String r1, java.util.List<java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>()
            r0.f17804c0 = r1
            java.lang.StackTraceElement[] r1 = p214m2.C4341s.f17799d0
            r0.setStackTrace(r1)
            r0.f17800Y = r2
            return
    }

    /* renamed from: b */
    public static void m9723b(java.util.List<java.lang.Throwable> r0, java.lang.Appendable r1) {
            m9724c(r0, r1)     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: c */
    public static void m9724c(java.util.List<java.lang.Throwable> r5, java.lang.Appendable r6) {
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L3f
            java.lang.String r2 = "Cause ("
            java.lang.Appendable r2 = r6.append(r2)
            int r3 = r1 + 1
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.Appendable r2 = r2.append(r4)
            java.lang.String r4 = " of "
            java.lang.Appendable r2 = r2.append(r4)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.Appendable r2 = r2.append(r4)
            java.lang.String r4 = "): "
            r2.append(r4)
            java.lang.Object r1 = r5.get(r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r2 = r1 instanceof p214m2.C4341s
            if (r2 == 0) goto L3a
            m2.s r1 = (p214m2.C4341s) r1
            r1.m9728f(r6)
            goto L3d
        L3a:
            m9725d(r1, r6)
        L3d:
            r1 = r3
            goto L5
        L3f:
            return
    }

    /* renamed from: d */
    public static void m9725d(java.lang.Throwable r1, java.lang.Appendable r2) {
            java.lang.Class r0 = r1.getClass()     // Catch: java.io.IOException -> L20
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L20
            java.lang.Appendable r2 = r2.append(r0)     // Catch: java.io.IOException -> L20
            java.lang.String r0 = ": "
            java.lang.Appendable r2 = r2.append(r0)     // Catch: java.io.IOException -> L20
            java.lang.String r0 = r1.getMessage()     // Catch: java.io.IOException -> L20
            java.lang.Appendable r2 = r2.append(r0)     // Catch: java.io.IOException -> L20
            r0 = 10
            r2.append(r0)     // Catch: java.io.IOException -> L20
            return
        L20:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    /* renamed from: a */
    public final void m9726a(java.lang.Throwable r2, java.util.List<java.lang.Throwable> r3) {
            r1 = this;
            boolean r0 = r2 instanceof p214m2.C4341s
            if (r0 == 0) goto L1c
            m2.s r2 = (p214m2.C4341s) r2
            java.util.List<java.lang.Throwable> r2 = r2.f17800Y
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.next()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.m9726a(r0, r3)
            goto Lc
        L1c:
            r3.add(r2)
        L1f:
            return
    }

    /* renamed from: e */
    public void m9727e(java.lang.String r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.m9726a(r6, r0)
            int r1 = r0.size()
            r2 = 0
        Ld:
            if (r2 >= r1) goto L36
            java.lang.String r3 = "Root cause ("
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            int r4 = r2 + 1
            r3.append(r4)
            java.lang.String r5 = " of "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = ")"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            android.util.Log.i(r7, r3, r2)
            r2 = r4
            goto Ld
        L36:
            return
    }

    /* renamed from: f */
    public final void m9728f(java.lang.Appendable r3) {
            r2 = this;
            m9725d(r2, r3)
            java.util.List<java.lang.Throwable> r0 = r2.f17800Y
            m2.s$a r1 = new m2.s$a
            r1.<init>(r3)
            m9723b(r0, r1)
            return
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
            r0 = this;
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 71
            r0.<init>(r1)
            java.lang.String r1 = r5.f17804c0
            r0.append(r1)
            java.lang.Class<?> r1 = r5.f17803b0
            java.lang.String r2 = ", "
            java.lang.String r3 = ""
            if (r1 == 0) goto L22
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.Class<?> r4 = r5.f17803b0
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L23
        L22:
            r1 = r3
        L23:
            r0.append(r1)
            com.bumptech.glide.load.a r1 = r5.f17802a0
            if (r1 == 0) goto L38
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r2)
            com.bumptech.glide.load.a r4 = r5.f17802a0
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L39
        L38:
            r1 = r3
        L39:
            r0.append(r1)
            k2.c r1 = r5.f17801Z
            if (r1 == 0) goto L4d
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r2)
            k2.c r2 = r5.f17801Z
            r1.append(r2)
            java.lang.String r3 = r1.toString()
        L4d:
            r0.append(r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.m9726a(r5, r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L63
            java.lang.String r0 = r0.toString()
            return r0
        L63:
            int r2 = r1.size()
            r3 = 1
            if (r2 != r3) goto L6d
            java.lang.String r2 = "\nThere was 1 root cause:"
            goto L7b
        L6d:
            java.lang.String r2 = "\nThere were "
            r0.append(r2)
            int r2 = r1.size()
            r0.append(r2)
            java.lang.String r2 = " root causes:"
        L7b:
            r0.append(r2)
            java.util.Iterator r1 = r1.iterator()
        L82:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb0
            java.lang.Object r2 = r1.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3 = 10
            r0.append(r3)
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            r3 = 40
            r0.append(r3)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            goto L82
        Lb0:
            java.lang.String r1 = "\n call GlideException#logRootCauses(String) for more detail"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
            r1 = this;
            java.io.PrintStream r0 = java.lang.System.err
            r1.m9728f(r0)
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintStream r1) {
            r0 = this;
            r0.m9728f(r1)
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintWriter r1) {
            r0 = this;
            r0.m9728f(r1)
            return
    }
}

package p075ea;

/* renamed from: ea.d */
/* loaded from: classes.dex */
public class C1810d implements p075ea.InterfaceC1807a {

    /* renamed from: d */
    public static final java.nio.charset.Charset f7872d = null;

    /* renamed from: a */
    public final java.io.File f7873a;

    /* renamed from: b */
    public final int f7874b;

    /* renamed from: c */
    public p075ea.C1809c f7875c;

    /* renamed from: ea.d$a */
    public static class a {

        /* renamed from: a */
        public final byte[] f7876a;

        /* renamed from: b */
        public final int f7877b;

        public a(byte[] r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f7876a = r1
                r0.f7877b = r2
                return
        }
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p075ea.C1810d.f7872d = r0
            return
    }

    public C1810d(java.io.File r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f7873a = r1
            r0.f7874b = r2
            return
    }

    @Override // p075ea.InterfaceC1807a
    /* renamed from: a */
    public void mo4545a() {
            r2 = this;
            ea.c r0 = r2.f7875c
            java.lang.String r1 = "There was a problem closing the Crashlytics log file."
            p056da.C1354e.m3857a(r0, r1)
            r0 = 0
            r2.f7875c = r0
            return
    }

    @Override // p075ea.InterfaceC1807a
    /* renamed from: b */
    public java.lang.String mo4546b() {
            r3 = this;
            byte[] r0 = r3.m4563d()
            if (r0 == 0) goto Le
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = p075ea.C1810d.f7872d
            r1.<init>(r0, r2)
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    @Override // p075ea.InterfaceC1807a
    /* renamed from: c */
    public void mo4547c(long r5, java.lang.String r7) {
            r4 = this;
            r4.m4564e()
            java.lang.String r0 = " "
            ea.c r1 = r4.f7875c
            if (r1 != 0) goto La
            goto L7e
        La:
            if (r7 != 0) goto Le
            java.lang.String r7 = "null"
        Le:
            int r1 = r4.f7874b     // Catch: java.io.IOException -> L76
            int r1 = r1 / 4
            int r2 = r7.length()     // Catch: java.io.IOException -> L76
            if (r2 <= r1) goto L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L76
            r2.<init>()     // Catch: java.io.IOException -> L76
            java.lang.String r3 = "..."
            r2.append(r3)     // Catch: java.io.IOException -> L76
            int r3 = r7.length()     // Catch: java.io.IOException -> L76
            int r3 = r3 - r1
            java.lang.String r7 = r7.substring(r3)     // Catch: java.io.IOException -> L76
            r2.append(r7)     // Catch: java.io.IOException -> L76
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L76
        L32:
            java.lang.String r1 = "\r"
            java.lang.String r7 = r7.replaceAll(r1, r0)     // Catch: java.io.IOException -> L76
            java.lang.String r1 = "\n"
            java.lang.String r7 = r7.replaceAll(r1, r0)     // Catch: java.io.IOException -> L76
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.io.IOException -> L76
            java.lang.String r1 = "%d %s%n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.io.IOException -> L76
            r3 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.io.IOException -> L76
            r2[r3] = r5     // Catch: java.io.IOException -> L76
            r5 = 1
            r2[r5] = r7     // Catch: java.io.IOException -> L76
            java.lang.String r5 = java.lang.String.format(r0, r1, r2)     // Catch: java.io.IOException -> L76
            java.nio.charset.Charset r6 = p075ea.C1810d.f7872d     // Catch: java.io.IOException -> L76
            byte[] r5 = r5.getBytes(r6)     // Catch: java.io.IOException -> L76
            ea.c r6 = r4.f7875c     // Catch: java.io.IOException -> L76
            r6.m4559h(r5)     // Catch: java.io.IOException -> L76
        L5e:
            ea.c r5 = r4.f7875c     // Catch: java.io.IOException -> L76
            boolean r5 = r5.m4562n()     // Catch: java.io.IOException -> L76
            if (r5 != 0) goto L7e
            ea.c r5 = r4.f7875c     // Catch: java.io.IOException -> L76
            int r5 = r5.m4556V()     // Catch: java.io.IOException -> L76
            int r6 = r4.f7874b     // Catch: java.io.IOException -> L76
            if (r5 <= r6) goto L7e
            ea.c r5 = r4.f7875c     // Catch: java.io.IOException -> L76
            r5.m4553Q()     // Catch: java.io.IOException -> L76
            goto L5e
        L76:
            r5 = move-exception
            java.lang.String r6 = "FirebaseCrashlytics"
            java.lang.String r7 = "There was a problem writing to the Crashlytics log."
            android.util.Log.e(r6, r7, r5)
        L7e:
            return
    }

    /* renamed from: d */
    public byte[] m4563d() {
            r10 = this;
            java.io.File r0 = r10.f7873a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L6a
        Lc:
            r10.m4564e()
            ea.c r0 = r10.f7875c
            if (r0 != 0) goto L14
            goto La
        L14:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r0 = r0.m4556V()
            byte[] r0 = new byte[r0]
            ea.c r4 = r10.f7875c     // Catch: java.io.IOException -> L5b
            monitor-enter(r4)     // Catch: java.io.IOException -> L5b
            ea.c$b r5 = r4.f7863b0     // Catch: java.lang.Throwable -> L58
            int r5 = r5.f7867a     // Catch: java.lang.Throwable -> L58
            r6 = 0
        L27:
            int r7 = r4.f7862a0     // Catch: java.lang.Throwable -> L58
            if (r6 >= r7) goto L56
            ea.c$b r5 = r4.m4552A(r5)     // Catch: java.lang.Throwable -> L58
            ea.c$c r7 = new ea.c$c     // Catch: java.lang.Throwable -> L58
            r7.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> L58
            int r8 = r5.f7868b     // Catch: java.lang.Throwable -> L58
            r9 = r3[r2]     // Catch: java.lang.Throwable -> L51
            r7.read(r0, r9, r8)     // Catch: java.lang.Throwable -> L51
            r9 = r3[r2]     // Catch: java.lang.Throwable -> L51
            int r9 = r9 + r8
            r3[r2] = r9     // Catch: java.lang.Throwable -> L51
            r7.close()     // Catch: java.lang.Throwable -> L58
            int r7 = r5.f7867a     // Catch: java.lang.Throwable -> L58
            int r7 = r7 + 4
            int r5 = r5.f7868b     // Catch: java.lang.Throwable -> L58
            int r7 = r7 + r5
            int r5 = r4.m4557Z(r7)     // Catch: java.lang.Throwable -> L58
            int r6 = r6 + 1
            goto L27
        L51:
            r5 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L58
            throw r5     // Catch: java.lang.Throwable -> L58
        L56:
            monitor-exit(r4)     // Catch: java.io.IOException -> L5b
            goto L63
        L58:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.io.IOException -> L5b
            throw r5     // Catch: java.io.IOException -> L5b
        L5b:
            r4 = move-exception
            java.lang.String r5 = "A problem occurred while reading the Crashlytics log file."
            java.lang.String r6 = "FirebaseCrashlytics"
            android.util.Log.e(r6, r5, r4)
        L63:
            ea.d$a r4 = new ea.d$a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L6a:
            if (r4 != 0) goto L6d
            return r1
        L6d:
            int r0 = r4.f7877b
            byte[] r1 = new byte[r0]
            byte[] r3 = r4.f7876a
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
    }

    /* renamed from: e */
    public final void m4564e() {
            r3 = this;
            ea.c r0 = r3.f7875c
            if (r0 != 0) goto L23
            ea.c r0 = new ea.c     // Catch: java.io.IOException -> Le
            java.io.File r1 = r3.f7873a     // Catch: java.io.IOException -> Le
            r0.<init>(r1)     // Catch: java.io.IOException -> Le
            r3.f7875c = r0     // Catch: java.io.IOException -> Le
            goto L23
        Le:
            r0 = move-exception
            java.lang.String r1 = "Could not open log file: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.io.File r2 = r3.f7873a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.e(r2, r1, r0)
        L23:
            return
    }
}

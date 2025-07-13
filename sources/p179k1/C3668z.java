package p179k1;

/* renamed from: k1.z */
/* loaded from: classes.dex */
public class C3668z implements p243o1.InterfaceC4873c, p179k1.InterfaceC3656n {

    /* renamed from: Y */
    public final android.content.Context f16236Y;

    /* renamed from: Z */
    public final java.lang.String f16237Z;

    /* renamed from: a0 */
    public final java.io.File f16238a0;

    /* renamed from: b0 */
    public final java.util.concurrent.Callable<java.io.InputStream> f16239b0;

    /* renamed from: c0 */
    public final int f16240c0;

    /* renamed from: d0 */
    public final p243o1.InterfaceC4873c f16241d0;

    /* renamed from: e0 */
    public p179k1.C3655m f16242e0;

    /* renamed from: f0 */
    public boolean f16243f0;

    @Override // p179k1.InterfaceC3656n
    /* renamed from: a */
    public p243o1.InterfaceC4873c mo8082a() {
            r1 = this;
            o1.c r0 = r1.f16241d0
            return r0
    }

    @Override // p243o1.InterfaceC4873c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            o1.c r0 = r1.f16241d0     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            r1.f16243f0 = r0     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // p243o1.InterfaceC4873c
    public java.lang.String getDatabaseName() {
            r1 = this;
            o1.c r0 = r1.f16241d0
            java.lang.String r0 = r0.getDatabaseName()
            return r0
    }

    /* renamed from: h */
    public final void m8126h(java.io.File r10, boolean r11) {
            r9 = this;
            java.lang.String r11 = r9.f16237Z
            if (r11 == 0) goto L11
            android.content.Context r11 = r9.f16236Y
            android.content.res.AssetManager r11 = r11.getAssets()
            java.lang.String r0 = r9.f16237Z
            java.io.InputStream r11 = r11.open(r0)
            goto L2b
        L11:
            java.io.File r11 = r9.f16238a0
            if (r11 == 0) goto L21
            java.io.FileInputStream r11 = new java.io.FileInputStream
            java.io.File r0 = r9.f16238a0
            r11.<init>(r0)
            java.nio.channels.FileChannel r11 = r11.getChannel()
            goto L2f
        L21:
            java.util.concurrent.Callable<java.io.InputStream> r11 = r9.f16239b0
            if (r11 == 0) goto Le6
            java.lang.Object r11 = r11.call()     // Catch: java.lang.Exception -> Ldd
            java.io.InputStream r11 = (java.io.InputStream) r11     // Catch: java.lang.Exception -> Ldd
        L2b:
            java.nio.channels.ReadableByteChannel r11 = java.nio.channels.Channels.newChannel(r11)
        L2f:
            android.content.Context r0 = r9.f16236Y
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r1 = "room-copy-helper"
            java.lang.String r2 = ".tmp"
            java.io.File r6 = java.io.File.createTempFile(r1, r2, r0)
            r6.deleteOnExit()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r6)
            java.nio.channels.FileChannel r7 = r0.getChannel()
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Ld5
            r1 = 23
            r8 = 0
            if (r0 <= r1) goto L5d
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r7
            r1 = r11
            r0.transferFrom(r1, r2, r4)     // Catch: java.lang.Throwable -> Ld5
            goto L73
        L5d:
            java.io.InputStream r0 = java.nio.channels.Channels.newInputStream(r11)     // Catch: java.lang.Throwable -> Ld5
            java.io.OutputStream r1 = java.nio.channels.Channels.newOutputStream(r7)     // Catch: java.lang.Throwable -> Ld5
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> Ld5
        L69:
            int r3 = r0.read(r2)     // Catch: java.lang.Throwable -> Ld5
            if (r3 <= 0) goto L73
            r1.write(r2, r8, r3)     // Catch: java.lang.Throwable -> Ld5
            goto L69
        L73:
            r7.force(r8)     // Catch: java.lang.Throwable -> Ld5
            r11.close()
            r7.close()
            java.io.File r11 = r10.getParentFile()
            if (r11 == 0) goto La6
            boolean r0 = r11.exists()
            if (r0 != 0) goto La6
            boolean r11 = r11.mkdirs()
            if (r11 == 0) goto L8f
            goto La6
        L8f:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r0 = "Failed to create directories for "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r10 = r10.getAbsolutePath()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        La6:
            boolean r11 = r6.renameTo(r10)
            if (r11 == 0) goto Lad
            return
        Lad:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r0 = "Failed to move intermediate file ("
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r6.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = ") to destination ("
            r0.append(r1)
            java.lang.String r10 = r10.getAbsolutePath()
            r0.append(r10)
            java.lang.String r10 = ")."
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        Ld5:
            r10 = move-exception
            r11.close()
            r7.close()
            throw r10
        Ldd:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r0 = "inputStreamCallable exception on call"
            r11.<init>(r0, r10)
            throw r11
        Le6:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "copyFromAssetPath, copyFromFile and copyFromInputStream are all null!"
            r10.<init>(r11)
            throw r10
    }

    /* renamed from: i */
    public final void m8127i(boolean r9) {
            r8 = this;
            java.lang.String r0 = "ROOM"
            java.lang.String r1 = r8.getDatabaseName()
            android.content.Context r2 = r8.f16236Y
            java.io.File r2 = r2.getDatabasePath(r1)
            k1.m r3 = r8.f16242e0
            if (r3 == 0) goto L17
            boolean r3 = r3.f16155j
            if (r3 == 0) goto L15
            goto L17
        L15:
            r3 = 0
            goto L18
        L17:
            r3 = 1
        L18:
            m1.a r4 = new m1.a
            android.content.Context r5 = r8.f16236Y
            java.io.File r5 = r5.getFilesDir()
            r4.<init>(r1, r5, r3)
            java.util.concurrent.locks.Lock r3 = r4.f17587b     // Catch: java.lang.Throwable -> Lb4
            r3.lock()     // Catch: java.lang.Throwable -> Lb4
            boolean r3 = r4.f17588c     // Catch: java.lang.Throwable -> Lb4
            if (r3 == 0) goto L46
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L3d java.lang.Throwable -> Lb4
            java.io.File r5 = r4.f17586a     // Catch: java.io.IOException -> L3d java.lang.Throwable -> Lb4
            r3.<init>(r5)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> Lb4
            java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch: java.io.IOException -> L3d java.lang.Throwable -> Lb4
            r4.f17589d = r3     // Catch: java.io.IOException -> L3d java.lang.Throwable -> Lb4
            r3.lock()     // Catch: java.io.IOException -> L3d java.lang.Throwable -> Lb4
            goto L46
        L3d:
            r9 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = "Unable to grab copy lock."
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> Lb4
            throw r0     // Catch: java.lang.Throwable -> Lb4
        L46:
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = "Unable to copy database file."
            if (r3 != 0) goto L5c
            r8.m8126h(r2, r9)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> Lb4
            r4.m9643a()
            return
        L55:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r5, r9)     // Catch: java.lang.Throwable -> Lb4
            throw r0     // Catch: java.lang.Throwable -> Lb4
        L5c:
            k1.m r3 = r8.f16242e0     // Catch: java.lang.Throwable -> Lb4
            if (r3 != 0) goto L64
            r4.m9643a()
            return
        L64:
            int r3 = p213m1.C4317c.m9646b(r2)     // Catch: java.io.IOException -> Laa java.lang.Throwable -> Lb4
            int r6 = r8.f16240c0     // Catch: java.lang.Throwable -> Lb4
            if (r3 != r6) goto L70
            r4.m9643a()
            return
        L70:
            k1.m r7 = r8.f16242e0     // Catch: java.lang.Throwable -> Lb4
            boolean r3 = r7.m8085a(r3, r6)     // Catch: java.lang.Throwable -> Lb4
            if (r3 == 0) goto L7c
            r4.m9643a()
            return
        L7c:
            android.content.Context r3 = r8.f16236Y     // Catch: java.lang.Throwable -> Lb4
            boolean r3 = r3.deleteDatabase(r1)     // Catch: java.lang.Throwable -> Lb4
            if (r3 == 0) goto L8d
            r8.m8126h(r2, r9)     // Catch: java.io.IOException -> L88 java.lang.Throwable -> Lb4
            goto La6
        L88:
            r9 = move-exception
            android.util.Log.w(r0, r5, r9)     // Catch: java.lang.Throwable -> Lb4
            goto La6
        L8d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r9.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = "Failed to delete database file ("
            r9.append(r2)     // Catch: java.lang.Throwable -> Lb4
            r9.append(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = ") for a copy destructive migration."
            r9.append(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lb4
            android.util.Log.w(r0, r9)     // Catch: java.lang.Throwable -> Lb4
        La6:
            r4.m9643a()
            return
        Laa:
            r9 = move-exception
            java.lang.String r1 = "Unable to read database version."
            android.util.Log.w(r0, r1, r9)     // Catch: java.lang.Throwable -> Lb4
            r4.m9643a()
            return
        Lb4:
            r9 = move-exception
            r4.m9643a()
            throw r9
    }

    @Override // p243o1.InterfaceC4873c
    /* renamed from: o0 */
    public synchronized p243o1.InterfaceC4871a mo8083o0() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f16243f0     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lb
            r0 = 1
            r1.m8127i(r0)     // Catch: java.lang.Throwable -> L13
            r1.f16243f0 = r0     // Catch: java.lang.Throwable -> L13
        Lb:
            o1.c r0 = r1.f16241d0     // Catch: java.lang.Throwable -> L13
            o1.a r0 = r0.mo8083o0()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // p243o1.InterfaceC4873c
    public void setWriteAheadLoggingEnabled(boolean r2) {
            r1 = this;
            o1.c r0 = r1.f16241d0
            r0.setWriteAheadLoggingEnabled(r2)
            return
    }
}

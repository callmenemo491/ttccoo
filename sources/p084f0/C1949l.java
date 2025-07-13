package p084f0;

/* renamed from: f0.l */
/* loaded from: classes.dex */
public class C1949l {
    /* renamed from: a */
    public static boolean m4858a(java.io.File r0, android.content.res.Resources r1, int r2) {
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch: java.lang.Throwable -> L10
            boolean r0 = m4859b(r0, r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Ld
            r1.close()     // Catch: java.io.IOException -> Ld
        Ld:
            return r0
        Le:
            r0 = move-exception
            goto L12
        L10:
            r0 = move-exception
            r1 = 0
        L12:
            if (r1 == 0) goto L17
            r1.close()     // Catch: java.io.IOException -> L17
        L17:
            throw r0
    }

    /* renamed from: b */
    public static boolean m4859b(java.io.File r5, java.io.InputStream r6) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
        Lf:
            int r2 = r6.read(r5)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
            r4 = -1
            if (r2 == r4) goto L1a
            r3.write(r5, r1, r2)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
            goto Lf
        L1a:
            r5 = 1
            r3.close()     // Catch: java.io.IOException -> L1e
        L1e:
            android.os.StrictMode.setThreadPolicy(r0)
            return r5
        L22:
            r5 = move-exception
            r2 = r3
            goto L4e
        L25:
            r5 = move-exception
            r2 = r3
            goto L2b
        L28:
            r5 = move-exception
            goto L4e
        L2a:
            r5 = move-exception
        L2b:
            java.lang.String r6 = "TypefaceCompatUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r3.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "Error copying resource contents to temp file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L28
            r3.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L28
            android.util.Log.e(r6, r5)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.io.IOException -> L4a
        L4a:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L4e:
            if (r2 == 0) goto L53
            r2.close()     // Catch: java.io.IOException -> L53
        L53:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
    }

    /* renamed from: c */
    public static java.io.File m4860c(android.content.Context r5) {
            java.io.File r5 = r5.getCacheDir()
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = ".font"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r2 = android.os.Process.myPid()
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            int r3 = android.os.Process.myTid()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
        L29:
            r3 = 100
            if (r2 >= r3) goto L40
            java.io.File r3 = new java.io.File
            java.lang.String r4 = android.support.v4.media.C0142a.m254a(r1, r2)
            r3.<init>(r5, r4)
            boolean r4 = r3.createNewFile()     // Catch: java.io.IOException -> L3d
            if (r4 == 0) goto L3d
            return r3
        L3d:
            int r2 = r2 + 1
            goto L29
        L40:
            return r0
    }

    /* renamed from: d */
    public static java.nio.ByteBuffer m4861d(android.content.Context r7, android.os.CancellationSignal r8, android.net.Uri r9) {
            android.content.ContentResolver r7 = r7.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = r7.openFileDescriptor(r9, r1, r8)     // Catch: java.io.IOException -> L47
            if (r7 != 0) goto L13
            if (r7 == 0) goto L12
            r7.close()     // Catch: java.io.IOException -> L47
        L12:
            return r0
        L13:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3d
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch: java.lang.Throwable -> L3d
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L3d
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch: java.lang.Throwable -> L33
            long r5 = r1.size()     // Catch: java.lang.Throwable -> L33
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L33
            r3 = 0
            java.nio.MappedByteBuffer r9 = r1.map(r2, r3, r5)     // Catch: java.lang.Throwable -> L33
            r8.close()     // Catch: java.lang.Throwable -> L3d
            r7.close()     // Catch: java.io.IOException -> L47
            return r9
        L33:
            r9 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> L38
            goto L3c
        L38:
            r8 = move-exception
            r9.addSuppressed(r8)     // Catch: java.lang.Throwable -> L3d
        L3c:
            throw r9     // Catch: java.lang.Throwable -> L3d
        L3d:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: java.io.IOException -> L47
        L46:
            throw r8     // Catch: java.io.IOException -> L47
        L47:
            return r0
    }
}

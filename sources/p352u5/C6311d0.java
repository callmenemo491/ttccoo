package p352u5;

/* renamed from: u5.d0 */
/* loaded from: classes.dex */
public final class C6311d0 extends p352u5.AbstractC6310d {

    /* renamed from: e */
    public final android.content.res.Resources f24654e;

    /* renamed from: f */
    public final java.lang.String f24655f;

    /* renamed from: g */
    public android.net.Uri f24656g;

    /* renamed from: h */
    public android.content.res.AssetFileDescriptor f24657h;

    /* renamed from: i */
    public java.io.InputStream f24658i;

    /* renamed from: j */
    public long f24659j;

    /* renamed from: k */
    public boolean f24660k;

    /* renamed from: u5.d0$a */
    public static class a extends p352u5.C6321j {
        public a(java.lang.String r1, java.lang.Throwable r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    public C6311d0(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            android.content.res.Resources r0 = r2.getResources()
            r1.f24654e = r0
            java.lang.String r2 = r2.getPackageName()
            r1.f24655f = r2
            return
    }

    public static android.net.Uri buildRawResourceUri(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 26
            r0.<init>(r1)
            java.lang.String r1 = "rawresource:///"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
    }

    @Override // p352u5.InterfaceC6314f
    /* renamed from: b */
    public int mo6020b(byte[] r10, int r11, int r12) {
            r9 = this;
            if (r12 != 0) goto L4
            r10 = 0
            return r10
        L4:
            long r0 = r9.f24659j
            r2 = 0
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Le
            return r4
        Le:
            r2 = 2000(0x7d0, float:2.803E-42)
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L17
            goto L1d
        L17:
            long r7 = (long) r12
            long r0 = java.lang.Math.min(r0, r7)     // Catch: java.io.IOException -> L49
            int r12 = (int) r0     // Catch: java.io.IOException -> L49
        L1d:
            java.io.InputStream r0 = r9.f24658i     // Catch: java.io.IOException -> L49
            int r1 = p371v5.C6552b0.f25624a     // Catch: java.io.IOException -> L49
            int r10 = r0.read(r10, r11, r12)     // Catch: java.io.IOException -> L49
            if (r10 != r4) goto L3b
            long r10 = r9.f24659j
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 != 0) goto L2e
            return r4
        L2e:
            u5.d0$a r10 = new u5.d0$a
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            java.lang.String r12 = "End of stream reached having not read sufficient data."
            r10.<init>(r12, r11, r2)
            throw r10
        L3b:
            long r11 = r9.f24659j
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 == 0) goto L45
            long r0 = (long) r10
            long r11 = r11 - r0
            r9.f24659j = r11
        L45:
            r9.m12952r(r10)
            return r10
        L49:
            r10 = move-exception
            u5.d0$a r11 = new u5.d0$a
            r12 = 0
            r11.<init>(r12, r10, r2)
            throw r11
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: c */
    public long mo6021c(p352u5.C6323l r18) {
            r17 = this;
            r1 = r17
            r0 = r18
            android.net.Uri r2 = r0.f24704a
            r1.f24656g = r2
            java.lang.String r3 = r2.getScheme()
            java.lang.String r4 = "rawresource"
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            r4 = 2005(0x7d5, float:2.81E-42)
            r5 = 1004(0x3ec, float:1.407E-42)
            r6 = 1
            r7 = 0
            if (r3 != 0) goto La9
            java.lang.String r3 = r2.getScheme()
            java.lang.String r8 = "android.resource"
            boolean r3 = android.text.TextUtils.equals(r8, r3)
            if (r3 == 0) goto L40
            java.util.List r3 = r2.getPathSegments()
            int r3 = r3.size()
            if (r3 != r6) goto L40
            java.lang.String r3 = r2.getLastPathSegment()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r9 = "\\d+"
            boolean r3 = r3.matches(r9)
            if (r3 == 0) goto L40
            goto La9
        L40:
            java.lang.String r3 = r2.getScheme()
            boolean r3 = android.text.TextUtils.equals(r8, r3)
            if (r3 == 0) goto La1
            java.lang.String r3 = r2.getPath()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r5 = "/"
            boolean r5 = r3.startsWith(r5)
            if (r5 == 0) goto L5d
            java.lang.String r3 = r3.substring(r6)
        L5d:
            java.lang.String r5 = r2.getHost()
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 == 0) goto L6a
            java.lang.String r5 = ""
            goto L74
        L6a:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r8 = ":"
            java.lang.String r5 = r5.concat(r8)
        L74:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r8 = r3.length()
            if (r8 == 0) goto L87
            java.lang.String r3 = r5.concat(r3)
            goto L8c
        L87:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5)
        L8c:
            android.content.res.Resources r5 = r1.f24654e
            java.lang.String r8 = r1.f24655f
            java.lang.String r9 = "raw"
            int r3 = r5.getIdentifier(r3, r9, r8)
            if (r3 == 0) goto L99
            goto Lb4
        L99:
            u5.d0$a r0 = new u5.d0$a
            java.lang.String r2 = "Resource not found."
            r0.<init>(r2, r7, r4)
            throw r0
        La1:
            u5.d0$a r0 = new u5.d0$a
            java.lang.String r2 = "URI must either use scheme rawresource or android.resource"
            r0.<init>(r2, r7, r5)
            throw r0
        La9:
            java.lang.String r3 = r2.getLastPathSegment()     // Catch: java.lang.NumberFormatException -> L190
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.NumberFormatException -> L190
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L190
        Lb4:
            r17.m12954t(r18)
            android.content.res.Resources r5 = r1.f24654e     // Catch: android.content.res.Resources.NotFoundException -> L189
            android.content.res.AssetFileDescriptor r3 = r5.openRawResourceFd(r3)     // Catch: android.content.res.Resources.NotFoundException -> L189
            r1.f24657h = r3
            if (r3 == 0) goto L166
            long r8 = r3.getLength()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.FileDescriptor r5 = r3.getFileDescriptor()
            r2.<init>(r5)
            r1.f24658i = r2
            r5 = 2008(0x7d8, float:2.814E-42)
            r10 = -1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto Le5
            long r13 = r0.f24709f     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 > 0) goto Ldf
            goto Le5
        Ldf:
            u5.d0$a r0 = new u5.d0$a     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            r0.<init>(r7, r7, r5)     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            throw r0     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
        Le5:
            long r13 = r3.getStartOffset()     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            long r4 = r0.f24709f     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            long r4 = r4 + r13
            long r4 = r2.skip(r4)     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            long r4 = r4 - r13
            long r13 = r0.f24709f     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            int r16 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r16 != 0) goto L153
            r13 = 0
            if (r12 != 0) goto L122
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            long r4 = r2.size()     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 != 0) goto L10a
            r1.f24659j = r10     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            goto L129
        L10a:
            long r4 = r2.size()     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            long r8 = r2.position()     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            long r4 = r4 - r8
            r1.f24659j = r4     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 < 0) goto L11a
            goto L129
        L11a:
            u5.d0$a r0 = new u5.d0$a     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r7, r7, r2)     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            throw r0     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
        L122:
            long r8 = r8 - r4
            r1.f24659j = r8     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 < 0) goto L14b
        L129:
            long r2 = r0.f24710g
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 == 0) goto L13c
            long r4 = r1.f24659j
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 != 0) goto L136
            goto L13a
        L136:
            long r2 = java.lang.Math.min(r4, r2)
        L13a:
            r1.f24659j = r2
        L13c:
            r1.f24660k = r6
            r17.m12955u(r18)
            long r2 = r0.f24710g
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L148
            goto L14a
        L148:
            long r2 = r1.f24659j
        L14a:
            return r2
        L14b:
            u5.j r0 = new u5.j     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r2)     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            throw r0     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
        L153:
            u5.d0$a r0 = new u5.d0$a     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r7, r7, r2)     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
            throw r0     // Catch: java.io.IOException -> L15b p352u5.C6311d0.a -> L164
        L15b:
            r0 = move-exception
            u5.d0$a r2 = new u5.d0$a
            r3 = 2000(0x7d0, float:2.803E-42)
            r2.<init>(r7, r0, r3)
            throw r2
        L164:
            r0 = move-exception
            throw r0
        L166:
            u5.d0$a r0 = new u5.d0$a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            int r4 = r4 + 24
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Resource is compressed: "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r2, r7, r3)
            throw r0
        L189:
            r0 = move-exception
            u5.d0$a r2 = new u5.d0$a
            r2.<init>(r7, r0, r4)
            throw r2
        L190:
            u5.d0$a r0 = new u5.d0$a
            java.lang.String r2 = "Resource identifier must be an integer."
            r0.<init>(r2, r7, r5)
            throw r0
    }

    @Override // p352u5.InterfaceC6320i
    public void close() {
            r5 = this;
            r0 = 0
            r5.f24656g = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.f24658i     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f24658i = r0
            android.content.res.AssetFileDescriptor r3 = r5.f24657h     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f24657h = r0
            boolean r0 = r5.f24660k
            if (r0 == 0) goto L21
            r5.f24660k = r2
            r5.m12953s()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            u5.d0$a r4 = new u5.d0$a     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f24657h = r0
            boolean r0 = r5.f24660k
            if (r0 == 0) goto L36
            r5.f24660k = r2
            r5.m12953s()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            u5.d0$a r4 = new u5.d0$a     // Catch: java.lang.Throwable -> L37
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f24658i = r0
            android.content.res.AssetFileDescriptor r4 = r5.f24657h     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f24657h = r0
            boolean r0 = r5.f24660k
            if (r0 == 0) goto L54
            r5.f24660k = r2
            r5.m12953s()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            u5.d0$a r4 = new u5.d0$a     // Catch: java.lang.Throwable -> L55
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f24657h = r0
            boolean r0 = r5.f24660k
            if (r0 == 0) goto L69
            r5.f24660k = r2
            r5.m12953s()
        L69:
            throw r1
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: l */
    public android.net.Uri mo6024l() {
            r1 = this;
            android.net.Uri r0 = r1.f24656g
            return r0
    }
}

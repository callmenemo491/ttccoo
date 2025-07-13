package p059dd;

/* renamed from: dd.d */
/* loaded from: classes.dex */
public final class C1430d implements p059dd.InterfaceC1427a {
    public C1430d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p059dd.InterfaceC1427a
    /* renamed from: a */
    public byte[] mo3971a(byte[] r6) {
            r5 = this;
            java.lang.String r0 = "uncompressedBytes"
            p214m2.C4339q.m9707l(r6, r0)
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = 9
            r0.<init>(r1)
            r0.setInput(r6)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            int r2 = r6.length
            r1.<init>(r2)
            r0.finish()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
        L1c:
            boolean r3 = r0.finished()
            if (r3 != 0) goto L2b
            int r3 = r0.deflate(r2)
            r4 = 0
            r1.write(r2, r4, r3)
            goto L1c
        L2b:
            r1.close()     // Catch: java.io.IOException -> L38
            byte[] r6 = r1.toByteArray()
            java.lang.String r0 = "outputStream.toByteArray()"
            p214m2.C4339q.m9703h(r6, r0)
            return r6
        L38:
            r0 = move-exception
            r0.printStackTrace()
            return r6
    }
}

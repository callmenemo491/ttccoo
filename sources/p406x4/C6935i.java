package p406x4;

/* renamed from: x4.i */
/* loaded from: classes.dex */
public final class C6935i implements p406x4.InterfaceC6937k.b {
    public C6935i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p406x4.InterfaceC6937k.b
    /* renamed from: a */
    public p406x4.InterfaceC6937k mo14046a(p406x4.InterfaceC6937k.a r7) {
            r6 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 31
            r2 = 0
            if (r0 < r1) goto L70
            f4.e0 r0 = r7.f27016c
            java.lang.String r0 = r0.f8896j0
            int r0 = p371v5.C6567q.m13377g(r0)
            java.lang.String r1 = "Creating an asynchronous MediaCodec adapter for track type "
            switch(r0) {
                case -2: goto L46;
                case -1: goto L14;
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                default: goto L14;
            }
        L14:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r0 < r3) goto L49
            r3 = 20
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "custom ("
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = ")"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L4b
        L31:
            java.lang.String r3 = "camera motion"
            goto L4b
        L34:
            java.lang.String r3 = "metadata"
            goto L4b
        L37:
            java.lang.String r3 = "image"
            goto L4b
        L3a:
            java.lang.String r3 = "text"
            goto L4b
        L3d:
            java.lang.String r3 = "video"
            goto L4b
        L40:
            java.lang.String r3 = "audio"
            goto L4b
        L43:
            java.lang.String r3 = "default"
            goto L4b
        L46:
            java.lang.String r3 = "none"
            goto L4b
        L49:
            java.lang.String r3 = "?"
        L4b:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L5a
            java.lang.String r1 = r1.concat(r3)
            goto L60
        L5a:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            r1 = r3
        L60:
            java.lang.String r3 = "DefaultMediaCodecAdapterFactory"
            android.util.Log.i(r3, r1)
            x4.b$b r1 = new x4.b$b
            r3 = 1
            r1.<init>(r0, r2, r3)
            x4.b r7 = r1.m14047b(r7)
            return r7
        L70:
            r0 = 0
            x4.m r1 = r7.f27014a     // Catch: java.lang.RuntimeException -> Lc2 java.io.IOException -> Lc4
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.RuntimeException -> Lc2 java.io.IOException -> Lc4
            x4.m r1 = r7.f27014a     // Catch: java.lang.RuntimeException -> Lc2 java.io.IOException -> Lc4
            java.lang.String r1 = r1.f27019a     // Catch: java.lang.RuntimeException -> Lc2 java.io.IOException -> Lc4
            java.lang.String r3 = "createCodec:"
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.RuntimeException -> Lc2 java.io.IOException -> Lc4
            int r5 = r4.length()     // Catch: java.lang.RuntimeException -> Lc2 java.io.IOException -> Lc4
            if (r5 == 0) goto L8b
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.RuntimeException -> Lc2 java.io.IOException -> Lc4
            goto L91
        L8b:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.RuntimeException -> Lc2 java.io.IOException -> Lc4
            r4.<init>(r3)     // Catch: java.lang.RuntimeException -> Lc2 java.io.IOException -> Lc4
            r3 = r4
        L91:
            p371v5.C6549a.m13287a(r3)     // Catch: java.lang.RuntimeException -> Lc2 java.io.IOException -> Lc4
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r1)     // Catch: java.lang.RuntimeException -> Lc2 java.io.IOException -> Lc4
            p371v5.C6549a.m13293g()     // Catch: java.lang.RuntimeException -> Lc2 java.io.IOException -> Lc4
            java.lang.String r3 = "configureCodec"
            p371v5.C6549a.m13287a(r3)     // Catch: java.lang.RuntimeException -> Lbd java.io.IOException -> Lbf
            android.media.MediaFormat r3 = r7.f27015b     // Catch: java.lang.RuntimeException -> Lbd java.io.IOException -> Lbf
            android.view.Surface r4 = r7.f27017d     // Catch: java.lang.RuntimeException -> Lbd java.io.IOException -> Lbf
            android.media.MediaCrypto r7 = r7.f27018e     // Catch: java.lang.RuntimeException -> Lbd java.io.IOException -> Lbf
            r1.configure(r3, r4, r7, r2)     // Catch: java.lang.RuntimeException -> Lbd java.io.IOException -> Lbf
            p371v5.C6549a.m13293g()     // Catch: java.lang.RuntimeException -> Lbd java.io.IOException -> Lbf
            java.lang.String r7 = "startCodec"
            p371v5.C6549a.m13287a(r7)     // Catch: java.lang.RuntimeException -> Lbd java.io.IOException -> Lbf
            r1.start()     // Catch: java.lang.RuntimeException -> Lbd java.io.IOException -> Lbf
            p371v5.C6549a.m13293g()     // Catch: java.lang.RuntimeException -> Lbd java.io.IOException -> Lbf
            x4.s r7 = new x4.s     // Catch: java.lang.RuntimeException -> Lbd java.io.IOException -> Lbf
            r7.<init>(r1, r0, r0)     // Catch: java.lang.RuntimeException -> Lbd java.io.IOException -> Lbf
            return r7
        Lbd:
            r7 = move-exception
            goto Lc0
        Lbf:
            r7 = move-exception
        Lc0:
            r0 = r1
            goto Lc5
        Lc2:
            r7 = move-exception
            goto Lc5
        Lc4:
            r7 = move-exception
        Lc5:
            if (r0 == 0) goto Lca
            r0.release()
        Lca:
            throw r7
    }
}

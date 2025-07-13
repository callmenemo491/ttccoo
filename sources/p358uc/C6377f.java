package p358uc;

/* renamed from: uc.f */
/* loaded from: classes.dex */
public class C6377f {

    /* renamed from: a */
    public p394wc.InterfaceC6830a f24849a;

    /* renamed from: b */
    public p358uc.C6376e f24850b;

    /* renamed from: c */
    public p414xc.C7032g f24851c;

    /* renamed from: d */
    public p394wc.InterfaceC6831b f24852d;

    /* renamed from: e */
    public p414xc.C7038m f24853e;

    /* renamed from: f */
    public java.lang.String f24854f;

    /* renamed from: g */
    public java.util.List<p414xc.C7035j> f24855g;

    static {
            xc.k r0 = new xc.k
            java.lang.String r1 = "............1"
            java.lang.String r2 = "............2"
            r0.<init>(r1, r2)
            return
    }

    public C6377f(p365v.C6476c r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = r2.f25078b0
            k7.h4 r0 = (p185k7.C3827h4) r0
            v.e r0 = r2.f25075Y
            wc.a r0 = (p394wc.InterfaceC6830a) r0
            r1.f24849a = r0
            v.e r2 = r2.f25076Z
            uc.e r2 = (p358uc.C6376e) r2
            r1.f24850b = r2
            xc.g r2 = new xc.g
            xc.f r0 = p414xc.EnumC7031f.EOS
            r2.<init>(r0)
            r1.f24851c = r2
            xc.m r2 = p414xc.C7038m.getDefault()
            r1.f24853e = r2
            java.lang.String r2 = ""
            r1.f24854f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f24855g = r2
            return
    }

    /* renamed from: a */
    public java.lang.String m13020a() {
            r8 = this;
            uc.e r0 = r8.f24850b
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            xc.g r2 = r8.f24851c
            java.util.List r2 = r2.toVariant()
            java.lang.String r3 = "chain_id"
            r1.put(r3, r2)
            wc.b r2 = r8.f24852d
            java.util.List r2 = r2.toVariant()
            java.lang.String r3 = "req"
            r1.put(r3, r2)
            xc.m r2 = r8.f24853e
            byte r2 = r2.getFlagValue()
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            java.lang.String r3 = "flags"
            r1.put(r3, r2)
            java.lang.String r2 = r8.f24854f
            java.lang.String r3 = "callback"
            r1.put(r3, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List<xc.j> r3 = r8.f24855g
            java.util.Iterator r3 = r3.iterator()
        L3e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L52
            java.lang.Object r4 = r3.next()
            xc.j r4 = (p414xc.C7035j) r4
            java.util.Map r4 = r4.toMap()
            r2.add(r4)
            goto L3e
        L52:
            java.lang.String r3 = "info"
            r1.put(r3, r2)
            java.lang.String r1 = p435yc.C7155a.m14270c(r1)
            java.util.Objects.requireNonNull(r0)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "(function() {\nconst textEncoder = {encode: global.encodeFunction}\nconst textDecoder = {decode: global.decodeFunction}\nconst buffer = new Serialize.SerialBuffer({\n    textEncoder,\n    textDecoder\n})\nlet data = %s\nglobal.signingRequestType.serialize(buffer, data)\nreturn buffer.asUint8Array()\n})()"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            com.eclipsesource.v8.V8 r0 = r0.f24847a
            com.eclipsesource.v8.V8Array r0 = r0.executeArrayScript(r1)
            int r1 = r0.length()
            byte[] r0 = r0.getBytes(r4, r1)
            byte[] r1 = new byte[r4]
            r3 = 2
            byte[][] r5 = new byte[r3][]
            r5[r4] = r0
            r5[r2] = r1
            byte[] r0 = p074e9.C1805a.m4519d(r5)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.Deflater r5 = new java.util.zip.Deflater
            r6 = 9
            r5.<init>(r6, r2)
            r5.setInput(r0)
            r5.finish()
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]
        L9b:
            boolean r7 = r5.finished()     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lae
            if (r7 != 0) goto Lae
            int r7 = r5.deflate(r6)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lae
            r1.write(r6, r4, r7)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lae
            goto L9b
        La9:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Exception -> Lad
        Lad:
            throw r0
        Lae:
            r1.close()     // Catch: java.lang.Exception -> Lb2
            goto Lb3
        Lb2:
        Lb3:
            byte[] r1 = r1.toByteArray()
            int r5 = r0.length
            int r6 = r1.length
            if (r5 <= r6) goto Lbf
            r0 = 130(0x82, float:1.82E-43)
            byte r0 = (byte) r0
            goto Lc2
        Lbf:
            r1 = 2
            r1 = r0
            r0 = 2
        Lc2:
            byte[][] r3 = new byte[r3][]
            byte[] r5 = new byte[r2]
            r5[r4] = r0
            r3[r4] = r5
            r3[r2] = r1
            byte[] r0 = p074e9.C1805a.m4519d(r3)
            java.lang.String r1 = "esr://"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            uc.e r3 = r8.f24850b
            com.eclipsesource.v8.V8 r3 = r3.f24847a
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = p435yc.C7155a.m14270c(r0)
            r2[r4] = r0
            java.lang.String r0 = "Uint8Array.from(%s)"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r5[r4] = r0
            java.lang.String r0 = "(function() {\nlet decoded = global.base64u.encode(%s)\nreturn decoded\n})()"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            java.lang.String r0 = r3.executeStringScript(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}

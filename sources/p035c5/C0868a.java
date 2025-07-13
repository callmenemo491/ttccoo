package p035c5;

/* renamed from: c5.a */
/* loaded from: classes.dex */
public final class C0868a extends p427y4.AbstractC7117h {

    /* renamed from: c */
    public static final java.util.regex.Pattern f4700c = null;

    /* renamed from: a */
    public final java.nio.charset.CharsetDecoder f4701a;

    /* renamed from: b */
    public final java.nio.charset.CharsetDecoder f4702b;

    static {
            java.lang.String r0 = "(.+?)='(.*?)';"
            r1 = 32
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            p035c5.C0868a.f4700c = r0
            return
    }

    public C0868a() {
            r1 = this;
            r1.<init>()
            java.nio.charset.Charset r0 = p010a9.C0035c.f82c
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            r1.f4701a = r0
            java.nio.charset.Charset r0 = p010a9.C0035c.f81b
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            r1.f4702b = r0
            return
    }

    @Override // p427y4.AbstractC7117h
    /* renamed from: b */
    public p427y4.C7110a mo33b(p427y4.C7114e r8, java.nio.ByteBuffer r9) {
            r7 = this;
            r8 = 0
            java.nio.charset.CharsetDecoder r0 = r7.f4701a     // Catch: java.lang.Throwable -> Le java.nio.charset.CharacterCodingException -> L18
            java.nio.CharBuffer r0 = r0.decode(r9)     // Catch: java.lang.Throwable -> Le java.nio.charset.CharacterCodingException -> L18
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Le java.nio.charset.CharacterCodingException -> L18
            java.nio.charset.CharsetDecoder r1 = r7.f4701a
            goto L38
        Le:
            r8 = move-exception
            java.nio.charset.CharsetDecoder r0 = r7.f4701a
            r0.reset()
            r9.rewind()
            throw r8
        L18:
            java.nio.charset.CharsetDecoder r0 = r7.f4701a
            r0.reset()
            r9.rewind()
            java.nio.charset.CharsetDecoder r0 = r7.f4702b     // Catch: java.lang.Throwable -> L2b java.nio.charset.CharacterCodingException -> L35
            java.nio.CharBuffer r0 = r0.decode(r9)     // Catch: java.lang.Throwable -> L2b java.nio.charset.CharacterCodingException -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2b java.nio.charset.CharacterCodingException -> L35
            goto L36
        L2b:
            r8 = move-exception
            java.nio.charset.CharsetDecoder r0 = r7.f4702b
            r0.reset()
            r9.rewind()
            throw r8
        L35:
            r0 = r8
        L36:
            java.nio.charset.CharsetDecoder r1 = r7.f4702b
        L38:
            r1.reset()
            r9.rewind()
            int r1 = r9.limit()
            byte[] r1 = new byte[r1]
            r9.get(r1)
            r9 = 1
            r2 = 0
            if (r0 != 0) goto L5a
            y4.a r0 = new y4.a
            y4.a$b[] r9 = new p427y4.C7110a.b[r9]
            c5.c r3 = new c5.c
            r3.<init>(r1, r8, r8)
            r9[r2] = r3
            r0.<init>(r9)
            return r0
        L5a:
            java.util.regex.Pattern r3 = p035c5.C0868a.f4700c
            java.util.regex.Matcher r0 = r3.matcher(r0)
            r3 = r8
            r4 = 0
        L62:
            boolean r4 = r0.find(r4)
            if (r4 == 0) goto L93
            java.lang.String r4 = r0.group(r9)
            r5 = 2
            java.lang.String r5 = r0.group(r5)
            if (r4 == 0) goto L8e
            java.lang.String r4 = p185k7.C3836i.m8629n(r4)
            java.util.Objects.requireNonNull(r4)
            java.lang.String r6 = "streamurl"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L8d
            java.lang.String r6 = "streamtitle"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L8b
            goto L8e
        L8b:
            r8 = r5
            goto L8e
        L8d:
            r3 = r5
        L8e:
            int r4 = r0.end()
            goto L62
        L93:
            y4.a r0 = new y4.a
            y4.a$b[] r9 = new p427y4.C7110a.b[r9]
            c5.c r4 = new c5.c
            r4.<init>(r1, r8, r3)
            r9[r2] = r4
            r0.<init>(r9)
            return r0
    }
}

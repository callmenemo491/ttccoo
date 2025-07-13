package p162j4;

/* renamed from: j4.u */
/* loaded from: classes.dex */
public final class C3416u implements p162j4.InterfaceC3412q {

    /* renamed from: d */
    public static final /* synthetic */ int f14762d = 0;

    /* renamed from: a */
    public final java.util.UUID f14763a;

    /* renamed from: b */
    public final android.media.MediaDrm f14764b;

    /* renamed from: c */
    public int f14765c;

    /* renamed from: j4.u$a */
    public static class a {
        /* renamed from: a */
        public static boolean m7853a(android.media.MediaDrm r0, java.lang.String r1) {
                boolean r0 = r0.requiresSecureDecoder(r1)
                return r0
        }
    }

    public C3416u(java.util.UUID r6) {
            r5 = this;
            r5.<init>()
            java.util.Objects.requireNonNull(r6)
            java.util.UUID r0 = p088f4.C2017j.f8965b
            boolean r1 = r0.equals(r6)
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Use C.CLEARKEY_UUID instead"
            p371v5.C6549a.m13289c(r1, r3)
            r5.f14763a = r6
            android.media.MediaDrm r1 = new android.media.MediaDrm
            int r3 = p371v5.C6552b0.f25624a
            r4 = 27
            if (r3 >= r4) goto L26
            java.util.UUID r3 = p088f4.C2017j.f8966c
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L26
            goto L27
        L26:
            r0 = r6
        L27:
            r1.<init>(r0)
            r5.f14764b = r1
            r5.f14765c = r2
            java.util.UUID r0 = p088f4.C2017j.f8967d
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L47
            java.lang.String r6 = p371v5.C6552b0.f25627d
            java.lang.String r0 = "ASUS_Z00AD"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L47
            java.lang.String r6 = "securityLevel"
            java.lang.String r0 = "L3"
            r1.setPropertyString(r6, r0)
        L47:
            return
    }

    @Override // p162j4.InterfaceC3412q
    /* renamed from: a */
    public void mo7840a(p162j4.InterfaceC3412q.b r3) {
            r2 = this;
            android.media.MediaDrm r0 = r2.f14764b
            j4.s r1 = new j4.s
            r1.<init>(r2, r3)
            r0.setOnEventListener(r1)
            return
    }

    @Override // p162j4.InterfaceC3412q
    /* renamed from: b */
    public boolean mo7841b(byte[] r3, java.lang.String r4) {
            r2 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 31
            if (r0 < r1) goto Ld
            android.media.MediaDrm r3 = r2.f14764b
            boolean r3 = p162j4.C3416u.a.m7853a(r3, r4)
            return r3
        Ld:
            android.media.MediaCrypto r0 = new android.media.MediaCrypto     // Catch: android.media.MediaCryptoException -> L21
            java.util.UUID r1 = r2.f14763a     // Catch: android.media.MediaCryptoException -> L21
            r0.<init>(r1, r3)     // Catch: android.media.MediaCryptoException -> L21
            boolean r3 = r0.requiresSecureDecoderComponent(r4)     // Catch: java.lang.Throwable -> L1c
            r0.release()
            return r3
        L1c:
            r3 = move-exception
            r0.release()
            throw r3
        L21:
            r3 = 1
            return r3
    }

    @Override // p162j4.InterfaceC3412q
    /* renamed from: c */
    public void mo7842c(byte[] r2, byte[] r3) {
            r1 = this;
            android.media.MediaDrm r0 = r1.f14764b
            r0.restoreKeys(r2, r3)
            return
    }

    @Override // p162j4.InterfaceC3412q
    /* renamed from: d */
    public java.util.Map<java.lang.String, java.lang.String> mo7843d(byte[] r2) {
            r1 = this;
            android.media.MediaDrm r0 = r1.f14764b
            java.util.HashMap r2 = r0.queryKeyStatus(r2)
            return r2
    }

    @Override // p162j4.InterfaceC3412q
    /* renamed from: e */
    public void mo7844e(byte[] r2) {
            r1 = this;
            android.media.MediaDrm r0 = r1.f14764b
            r0.closeSession(r2)
            return
    }

    @Override // p162j4.InterfaceC3412q
    /* renamed from: f */
    public byte[] mo7845f(byte[] r10, byte[] r11) {
            r9 = this;
            java.util.UUID r0 = p088f4.C2017j.f8966c
            java.util.UUID r1 = r9.f14763a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Laf
            int r0 = p371v5.C6552b0.f25624a
            r1 = 27
            if (r0 < r1) goto L12
            goto Laf
        L12:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L92
            java.lang.String r1 = p371v5.C6552b0.m13319l(r11)     // Catch: org.json.JSONException -> L92
            r0.<init>(r1)     // Catch: org.json.JSONException -> L92
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L92
            java.lang.String r2 = "{\"keys\":["
            r1.<init>(r2)     // Catch: org.json.JSONException -> L92
            java.lang.String r2 = "keys"
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch: org.json.JSONException -> L92
            r2 = 0
        L29:
            int r3 = r0.length()     // Catch: org.json.JSONException -> L92
            if (r2 >= r3) goto L84
            if (r2 == 0) goto L36
            java.lang.String r3 = ","
            r1.append(r3)     // Catch: org.json.JSONException -> L92
        L36:
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch: org.json.JSONException -> L92
            java.lang.String r4 = "{\"k\":\""
            r1.append(r4)     // Catch: org.json.JSONException -> L92
            java.lang.String r4 = "k"
            java.lang.String r4 = r3.getString(r4)     // Catch: org.json.JSONException -> L92
            r5 = 43
            r6 = 45
            java.lang.String r4 = r4.replace(r6, r5)     // Catch: org.json.JSONException -> L92
            r7 = 47
            r8 = 95
            java.lang.String r4 = r4.replace(r8, r7)     // Catch: org.json.JSONException -> L92
            r1.append(r4)     // Catch: org.json.JSONException -> L92
            java.lang.String r4 = "\",\"kid\":\""
            r1.append(r4)     // Catch: org.json.JSONException -> L92
            java.lang.String r4 = "kid"
            java.lang.String r4 = r3.getString(r4)     // Catch: org.json.JSONException -> L92
            java.lang.String r4 = r4.replace(r6, r5)     // Catch: org.json.JSONException -> L92
            java.lang.String r4 = r4.replace(r8, r7)     // Catch: org.json.JSONException -> L92
            r1.append(r4)     // Catch: org.json.JSONException -> L92
            java.lang.String r4 = "\",\"kty\":\""
            r1.append(r4)     // Catch: org.json.JSONException -> L92
            java.lang.String r4 = "kty"
            java.lang.String r3 = r3.getString(r4)     // Catch: org.json.JSONException -> L92
            r1.append(r3)     // Catch: org.json.JSONException -> L92
            java.lang.String r3 = "\"}"
            r1.append(r3)     // Catch: org.json.JSONException -> L92
            int r2 = r2 + 1
            goto L29
        L84:
            java.lang.String r0 = "]}"
            r1.append(r0)     // Catch: org.json.JSONException -> L92
            java.lang.String r0 = r1.toString()     // Catch: org.json.JSONException -> L92
            byte[] r11 = p371v5.C6552b0.m13329v(r0)     // Catch: org.json.JSONException -> L92
            goto Laf
        L92:
            r0 = move-exception
            java.lang.String r1 = "Failed to adjust response data: "
            java.lang.String r2 = p371v5.C6552b0.m13319l(r11)
            int r3 = r2.length()
            if (r3 == 0) goto La4
            java.lang.String r1 = r1.concat(r2)
            goto Laa
        La4:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        Laa:
            java.lang.String r2 = "ClearKeyUtil"
            p371v5.C6565o.m13369b(r2, r1, r0)
        Laf:
            android.media.MediaDrm r0 = r9.f14764b
            byte[] r10 = r0.provideKeyResponse(r10, r11)
            return r10
    }

    @Override // p162j4.InterfaceC3412q
    /* renamed from: g */
    public p162j4.InterfaceC3412q.d mo7846g() {
            r3 = this;
            android.media.MediaDrm r0 = r3.f14764b
            android.media.MediaDrm$ProvisionRequest r0 = r0.getProvisionRequest()
            j4.q$d r1 = new j4.q$d
            byte[] r2 = r0.getData()
            java.lang.String r0 = r0.getDefaultUrl()
            r1.<init>(r2, r0)
            return r1
    }

    @Override // p162j4.InterfaceC3412q
    /* renamed from: h */
    public void mo7847h(byte[] r2) {
            r1 = this;
            android.media.MediaDrm r0 = r1.f14764b
            r0.provideProvisionResponse(r2)
            return
    }

    @Override // p162j4.InterfaceC3412q
    @android.annotation.SuppressLint({"WrongConstant"})
    /* renamed from: i */
    public p162j4.InterfaceC3412q.a mo7848i(byte[] r17, java.util.List<p162j4.C3399d.b> r18, int r19, java.util.HashMap<java.lang.String, java.lang.String> r20) {
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = 23
            r3 = 0
            if (r1 == 0) goto L22d
            java.util.UUID r3 = r0.f14763a
            java.util.UUID r4 = p088f4.C2017j.f8967d
            boolean r3 = r4.equals(r3)
            r4 = -1
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L18
            goto Lbb
        L18:
            int r3 = p371v5.C6552b0.f25624a
            r7 = 28
            if (r3 < r7) goto L8f
            int r3 = r18.size()
            if (r3 <= r5) goto L8f
            java.lang.Object r3 = r1.get(r6)
            j4.d$b r3 = (p162j4.C3399d.b) r3
            r7 = 0
            r8 = 0
        L2c:
            int r9 = r18.size()
            if (r7 >= r9) goto L63
            java.lang.Object r9 = r1.get(r7)
            j4.d$b r9 = (p162j4.C3399d.b) r9
            byte[] r10 = r9.f14734c0
            java.util.Objects.requireNonNull(r10)
            java.lang.String r11 = r9.f14733b0
            java.lang.String r12 = r3.f14733b0
            boolean r11 = p371v5.C6552b0.m13308a(r11, r12)
            if (r11 == 0) goto L61
            java.lang.String r9 = r9.f14732a0
            java.lang.String r11 = r3.f14732a0
            boolean r9 = p371v5.C6552b0.m13308a(r9, r11)
            if (r9 == 0) goto L61
            t4.i$a r9 = p336t4.C6164i.m12730a(r10)
            if (r9 == 0) goto L59
            r9 = 1
            goto L5a
        L59:
            r9 = 0
        L5a:
            if (r9 == 0) goto L61
            int r9 = r10.length
            int r8 = r8 + r9
            int r7 = r7 + 1
            goto L2c
        L61:
            r7 = 0
            goto L64
        L63:
            r7 = 1
        L64:
            if (r7 == 0) goto L8f
            byte[] r2 = new byte[r8]
            r7 = 0
            r8 = 0
        L6a:
            int r9 = r18.size()
            if (r7 >= r9) goto L83
            java.lang.Object r9 = r1.get(r7)
            j4.d$b r9 = (p162j4.C3399d.b) r9
            byte[] r9 = r9.f14734c0
            java.util.Objects.requireNonNull(r9)
            int r10 = r9.length
            java.lang.System.arraycopy(r9, r6, r2, r8, r10)
            int r8 = r8 + r10
            int r7 = r7 + 1
            goto L6a
        L83:
            j4.d$b r1 = new j4.d$b
            java.util.UUID r7 = r3.f14731Z
            java.lang.String r8 = r3.f14732a0
            java.lang.String r3 = r3.f14733b0
            r1.<init>(r7, r8, r3, r2)
            goto Lc1
        L8f:
            r3 = 0
        L90:
            int r7 = r18.size()
            if (r3 >= r7) goto Lbb
            java.lang.Object r7 = r1.get(r3)
            j4.d$b r7 = (p162j4.C3399d.b) r7
            byte[] r8 = r7.f14734c0
            java.util.Objects.requireNonNull(r8)
            t4.i$a r8 = p336t4.C6164i.m12730a(r8)
            if (r8 != 0) goto La9
            r8 = -1
            goto Lab
        La9:
            int r8 = r8.f23849b
        Lab:
            int r9 = p371v5.C6552b0.f25624a
            if (r9 >= r2) goto Lb2
            if (r8 != 0) goto Lb2
            goto Lb6
        Lb2:
            if (r9 < r2) goto Lb8
            if (r8 != r5) goto Lb8
        Lb6:
            r3 = r7
            goto Lc2
        Lb8:
            int r3 = r3 + 1
            goto L90
        Lbb:
            java.lang.Object r1 = r1.get(r6)
            j4.d$b r1 = (p162j4.C3399d.b) r1
        Lc1:
            r3 = r1
        Lc2:
            java.util.UUID r1 = r0.f14763a
            byte[] r2 = r3.f14734c0
            java.util.Objects.requireNonNull(r2)
            java.util.UUID r7 = p088f4.C2017j.f8968e
            boolean r8 = r7.equals(r1)
            r9 = 26
            if (r8 == 0) goto L1c0
            byte[] r8 = p336t4.C6164i.m12731b(r2, r1)
            if (r8 != 0) goto Lda
            goto Ldb
        Lda:
            r2 = r8
        Ldb:
            r8 = r2[r6]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r10 = r2[r5]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 8
            int r10 = r10 << r11
            r8 = r8 | r10
            r10 = 3
            r12 = 2
            r12 = r2[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 16
            r8 = r8 | r12
            r12 = 4
            r10 = r2[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 24
            r8 = r8 | r10
            r10 = 5
            r12 = r2[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r13 = 6
            r10 = r2[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << r11
            r10 = r10 | r12
            short r10 = (short) r10
            r12 = 7
            r13 = r2[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r12 = r2[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << r11
            r12 = r12 | r13
            short r12 = (short) r12
            java.lang.String r13 = "FrameworkMediaDrm"
            if (r10 != r5) goto L186
            if (r12 == r5) goto L118
            goto L186
        L118:
            r5 = 9
            r14 = r2[r11]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 10
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r11
            r5 = r5 | r14
            short r5 = (short) r5
            java.nio.charset.Charset r11 = p010a9.C0035c.f83d
            java.lang.String r14 = new java.lang.String
            r14.<init>(r2, r15, r5, r11)
            java.lang.String r5 = "<LA_URL>"
            boolean r5 = r14.contains(r5)
            if (r5 == 0) goto L137
            goto L18b
        L137:
            java.lang.String r2 = "</DATA>"
            int r2 = r14.indexOf(r2)
            if (r2 != r4) goto L144
            java.lang.String r4 = "Could not find the </DATA> tag. Skipping LA_URL workaround."
            android.util.Log.w(r13, r4)
        L144:
            java.lang.String r4 = r14.substring(r6, r2)
            java.lang.String r2 = r14.substring(r2)
            int r5 = p064e.C1489c.m4038a(r4, r9)
            int r5 = p064e.C1489c.m4038a(r2, r5)
            java.lang.String r13 = "<LA_URL>https://x</LA_URL>"
            java.lang.String r2 = p088f4.C2035p.m5377a(r5, r4, r13, r2)
            int r8 = r8 + 52
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            r4.order(r5)
            r4.putInt(r8)
            short r5 = (short) r10
            r4.putShort(r5)
            short r5 = (short) r12
            r4.putShort(r5)
            int r5 = r2.length()
            int r5 = r5 * 2
            short r5 = (short) r5
            r4.putShort(r5)
            byte[] r2 = r2.getBytes(r11)
            r4.put(r2)
            byte[] r2 = r4.array()
            goto L18b
        L186:
            java.lang.String r4 = "Unexpected record count or type. Skipping LA_URL workaround."
            android.util.Log.i(r13, r4)
        L18b:
            if (r2 == 0) goto L18f
            int r4 = r2.length
            goto L190
        L18f:
            r4 = 0
        L190:
            int r4 = r4 + 32
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r4)
            r5.putInt(r4)
            r4 = 1886614376(0x70737368, float:3.013775E29)
            r5.putInt(r4)
            r5.putInt(r6)
            long r10 = r7.getMostSignificantBits()
            r5.putLong(r10)
            long r10 = r7.getLeastSignificantBits()
            r5.putLong(r10)
            if (r2 == 0) goto L1bc
            int r4 = r2.length
            if (r4 == 0) goto L1bc
            int r4 = r2.length
            r5.putInt(r4)
            r5.put(r2)
        L1bc:
            byte[] r2 = r5.array()
        L1c0:
            int r4 = p371v5.C6552b0.f25624a
            r5 = 23
            if (r4 >= r5) goto L1ce
            java.util.UUID r5 = p088f4.C2017j.f8967d
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L200
        L1ce:
            boolean r5 = r7.equals(r1)
            if (r5 == 0) goto L207
            java.lang.String r5 = p371v5.C6552b0.f25626c
            java.lang.String r6 = "Amazon"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L207
            java.lang.String r5 = p371v5.C6552b0.f25627d
            java.lang.String r6 = "AFTB"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L200
            java.lang.String r6 = "AFTS"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L200
            java.lang.String r6 = "AFTM"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L200
            java.lang.String r6 = "AFTT"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L207
        L200:
            byte[] r1 = p336t4.C6164i.m12731b(r2, r1)
            if (r1 == 0) goto L207
            goto L208
        L207:
            r1 = r2
        L208:
            java.util.UUID r2 = r0.f14763a
            java.lang.String r5 = r3.f14733b0
            if (r4 >= r9) goto L229
            java.util.UUID r4 = p088f4.C2017j.f8966c
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L229
            java.lang.String r2 = "video/mp4"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L226
            java.lang.String r2 = "audio/mp4"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L229
        L226:
            java.lang.String r2 = "cenc"
            goto L22a
        L229:
            r2 = r5
        L22a:
            r6 = r1
            r7 = r2
            goto L22f
        L22d:
            r6 = r3
            r7 = r6
        L22f:
            android.media.MediaDrm r4 = r0.f14764b
            r5 = r17
            r8 = r19
            r9 = r20
            android.media.MediaDrm$KeyRequest r1 = r4.getKeyRequest(r5, r6, r7, r8, r9)
            java.util.UUID r2 = r0.f14763a
            byte[] r4 = r1.getData()
            java.util.UUID r5 = p088f4.C2017j.f8966c
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L268
            int r2 = p371v5.C6552b0.f25624a
            r5 = 27
            if (r2 < r5) goto L250
            goto L268
        L250:
            java.lang.String r2 = p371v5.C6552b0.m13319l(r4)
            r4 = 43
            r5 = 45
            java.lang.String r2 = r2.replace(r4, r5)
            r4 = 47
            r5 = 95
            java.lang.String r2 = r2.replace(r4, r5)
            byte[] r4 = p371v5.C6552b0.m13329v(r2)
        L268:
            java.lang.String r2 = r1.getDefaultUrl()
            java.lang.String r5 = "https://x"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L276
            java.lang.String r2 = ""
        L276:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L288
            if (r3 == 0) goto L288
            java.lang.String r5 = r3.f14732a0
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L288
            java.lang.String r2 = r3.f14732a0
        L288:
            int r3 = p371v5.C6552b0.f25624a
            r5 = 23
            if (r3 < r5) goto L293
            int r1 = r1.getRequestType()
            goto L295
        L293:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L295:
            j4.q$a r3 = new j4.q$a
            r3.<init>(r4, r2, r1)
            return r3
    }

    @Override // p162j4.InterfaceC3412q
    /* renamed from: j */
    public int mo7849j() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // p162j4.InterfaceC3412q
    /* renamed from: k */
    public p142i4.InterfaceC3068b mo7850k(byte[] r6) {
            r5 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 21
            if (r0 >= r1) goto L22
            java.util.UUID r1 = p088f4.C2017j.f8967d
            java.util.UUID r2 = r5.f14763a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L22
            android.media.MediaDrm r1 = r5.f14764b
            java.lang.String r2 = "securityLevel"
            java.lang.String r1 = r1.getPropertyString(r2)
            java.lang.String r2 = "L3"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            j4.r r2 = new j4.r
            java.util.UUID r3 = r5.f14763a
            r4 = 27
            if (r0 >= r4) goto L35
            java.util.UUID r0 = p088f4.C2017j.f8966c
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L35
            java.util.UUID r3 = p088f4.C2017j.f8965b
        L35:
            r2.<init>(r3, r6, r1)
            return r2
    }

    @Override // p162j4.InterfaceC3412q
    /* renamed from: l */
    public byte[] mo7851l() {
            r1 = this;
            android.media.MediaDrm r0 = r1.f14764b
            byte[] r0 = r0.openSession()
            return r0
    }

    @Override // p162j4.InterfaceC3412q
    public synchronized void release() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f14765c     // Catch: java.lang.Throwable -> L10
            int r0 = r0 + (-1)
            r1.f14765c = r0     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Le
            android.media.MediaDrm r0 = r1.f14764b     // Catch: java.lang.Throwable -> L10
            r0.release()     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r1)
            return
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}

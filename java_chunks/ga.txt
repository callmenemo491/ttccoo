package ga;

/* renamed from: ga.a */
/* loaded from: classes.dex */
public class C2310a {

    /* renamed from: a */
    public static final qa.InterfaceC5604a f10530a = null;

    /* renamed from: ga.a$a */
    public interface a<T> {
        /* renamed from: d */
        T mo2145d(android.util.JsonReader r1);
    }

    static {
            sa.e r0 = new sa.e
            r0.<init>()
            ra.a r1 = p094fa.C2102a.f9530a
            fa.a r1 = (p094fa.C2102a) r1
            r1.m5555a(r0)
            r1 = 1
            r0.f23143d = r1
            sa.d r1 = new sa.d
            r1.<init>(r0)
            ga.C2310a.f10530a = r1
            return
    }

    public C2310a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a m6067a(android.util.JsonReader r4) {
            fa.r$b r0 = new fa.r$b
            r0.<init>()
            r4.beginObject()
        L8:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L90
            java.lang.String r1 = r4.nextName()
            java.util.Objects.requireNonNull(r1)
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1019779949: goto L4a;
                case -887523944: goto L3f;
                case 3571: goto L34;
                case 3143036: goto L29;
                case 2125650548: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L54
        L1e:
            java.lang.String r3 = "importance"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L27
            goto L54
        L27:
            r2 = 4
            goto L54
        L29:
            java.lang.String r3 = "file"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L32
            goto L54
        L32:
            r2 = 3
            goto L54
        L34:
            java.lang.String r3 = "pc"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3d
            goto L54
        L3d:
            r2 = 2
            goto L54
        L3f:
            java.lang.String r3 = "symbol"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L48
            goto L54
        L48:
            r2 = 1
            goto L54
        L4a:
            java.lang.String r3 = "offset"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L53
            goto L54
        L53:
            r2 = 0
        L54:
            switch(r2) {
                case 0: goto L84;
                case 1: goto L78;
                case 2: goto L6d;
                case 3: goto L66;
                case 4: goto L5b;
                default: goto L57;
            }
        L57:
            r4.skipValue()
            goto L8
        L5b:
            int r1 = r4.nextInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f9785e = r1
            goto L8
        L66:
            java.lang.String r1 = r4.nextString()
            r0.f9783c = r1
            goto L8
        L6d:
            long r1 = r4.nextLong()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.f9781a = r1
            goto L8
        L78:
            java.lang.String r1 = r4.nextString()
            java.lang.String r2 = "Null symbol"
            java.util.Objects.requireNonNull(r1, r2)
            r0.f9782b = r1
            goto L8
        L84:
            long r1 = r4.nextLong()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.f9784d = r1
            goto L8
        L90:
            r4.endObject()
            fa.a0$e$d$a$b$d$a r4 = r0.m5689a()
            return r4
    }

    /* renamed from: b */
    public static p094fa.AbstractC2103a0.c m6068b(android.util.JsonReader r5) {
            r5.beginObject()
            r0 = 0
            r1 = r0
            r2 = r1
        L6:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L3b
            java.lang.String r3 = r5.nextName()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = "key"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L31
            java.lang.String r4 = "value"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L27
            r5.skipValue()
            goto L6
        L27:
            java.lang.String r2 = r5.nextString()
            java.lang.String r3 = "Null value"
            java.util.Objects.requireNonNull(r2, r3)
            goto L6
        L31:
            java.lang.String r1 = r5.nextString()
            java.lang.String r3 = "Null key"
            java.util.Objects.requireNonNull(r1, r3)
            goto L6
        L3b:
            r5.endObject()
            if (r1 != 0) goto L43
            java.lang.String r5 = " key"
            goto L45
        L43:
            java.lang.String r5 = ""
        L45:
            if (r2 != 0) goto L4d
            java.lang.String r3 = " value"
            java.lang.String r5 = p064e.C1493g.m4049a(r5, r3)
        L4d:
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L59
            fa.d r5 = new fa.d
            r5.<init>(r1, r2, r0)
            return r5
        L59:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties:"
            java.lang.String r5 = p064e.C1493g.m4049a(r1, r5)
            r0.<init>(r5)
            throw r0
    }

    /* renamed from: c */
    public static <T> p094fa.C2105b0<T> m6069c(android.util.JsonReader r2, ga.C2310a.a<T> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.beginArray()
        L8:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r3.mo2145d(r2)
            r0.add(r1)
            goto L8
        L16:
            r2.endArray()
            fa.b0 r2 = new fa.b0
            r2.<init>(r0)
            return r2
    }

    /* renamed from: d */
    public static p094fa.AbstractC2103a0.e.d m6070d(android.util.JsonReader r29) {
            r0 = r29
            fa.k$b r1 = new fa.k$b
            r1.<init>()
            r29.beginObject()
        La:
            boolean r2 = r29.hasNext()
            if (r2 == 0) goto L486
            java.lang.String r2 = r29.nextName()
            java.util.Objects.requireNonNull(r2)
            int r3 = r2.hashCode()
            java.lang.String r4 = "timestamp"
            r5 = 3
            r6 = 4
            r7 = 1
            r8 = 2
            switch(r3) {
                case -1335157162: goto L4f;
                case 96801: goto L44;
                case 107332: goto L39;
                case 3575610: goto L2e;
                case 55126294: goto L25;
                default: goto L24;
            }
        L24:
            goto L5a
        L25:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L2c
            goto L5a
        L2c:
            r2 = 4
            goto L5b
        L2e:
            java.lang.String r3 = "type"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
            goto L5a
        L37:
            r2 = 3
            goto L5b
        L39:
            java.lang.String r3 = "log"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
            goto L5a
        L42:
            r2 = 2
            goto L5b
        L44:
            java.lang.String r3 = "app"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
            goto L5a
        L4d:
            r2 = 1
            goto L5b
        L4f:
            java.lang.String r3 = "device"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L58
            goto L5a
        L58:
            r2 = 0
            goto L5b
        L5a:
            r2 = -1
        L5b:
            java.lang.String r3 = ""
            java.lang.String r9 = "Missing required properties:"
            r10 = 0
            r11 = 5
            if (r2 == 0) goto L3c2
            if (r2 == r7) goto Lc6
            if (r2 == r8) goto L7f
            if (r2 == r5) goto L77
            if (r2 == r6) goto L6f
            r29.skipValue()
            goto La
        L6f:
            long r2 = r29.nextLong()
            r1.m5686b(r2)
            goto La
        L77:
            java.lang.String r2 = r29.nextString()
            r1.m5687c(r2)
            goto La
        L7f:
            r29.beginObject()
            r2 = r10
        L83:
            boolean r4 = r29.hasNext()
            if (r4 == 0) goto La6
            java.lang.String r4 = r29.nextName()
            java.util.Objects.requireNonNull(r4)
            java.lang.String r5 = "content"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L9c
            r29.skipValue()
            goto L83
        L9c:
            java.lang.String r2 = r29.nextString()
            java.lang.String r4 = "Null content"
            java.util.Objects.requireNonNull(r2, r4)
            goto L83
        La6:
            r29.endObject()
            if (r2 != 0) goto Lad
            java.lang.String r3 = " content"
        Lad:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto Lbc
            fa.t r3 = new fa.t
            r3.<init>(r2, r10)
            r1.f9745e = r3
            goto La
        Lbc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p064e.C1493g.m4049a(r9, r3)
            r0.<init>(r1)
            throw r0
        Lc6:
            r29.beginObject()
            r2 = r10
            r11 = r2
            r12 = r11
            r13 = r12
            r14 = r13
        Lce:
            boolean r15 = r29.hasNext()
            if (r15 == 0) goto L390
            java.lang.String r15 = r29.nextName()
            java.util.Objects.requireNonNull(r15)
            int r16 = r15.hashCode()
            switch(r16) {
                case -1332194002: goto L10f;
                case -1090974952: goto L104;
                case -80231855: goto Lf9;
                case 555169704: goto Lee;
                case 928737948: goto Le3;
                default: goto Le2;
            }
        Le2:
            goto L11a
        Le3:
            java.lang.String r6 = "uiOrientation"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto Lec
            goto L11a
        Lec:
            r6 = 4
            goto L11b
        Lee:
            java.lang.String r6 = "customAttributes"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto Lf7
            goto L11a
        Lf7:
            r6 = 3
            goto L11b
        Lf9:
            java.lang.String r6 = "internalKeys"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L102
            goto L11a
        L102:
            r6 = 2
            goto L11b
        L104:
            java.lang.String r6 = "execution"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L10d
            goto L11a
        L10d:
            r6 = 1
            goto L11b
        L10f:
            java.lang.String r6 = "background"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L118
            goto L11a
        L118:
            r6 = 0
            goto L11b
        L11a:
            r6 = -1
        L11b:
            if (r6 == 0) goto L383
            if (r6 == r7) goto L145
            if (r6 == r8) goto L13d
            if (r6 == r5) goto L135
            r15 = 4
            if (r6 == r15) goto L12b
            r29.skipValue()
            goto L38d
        L12b:
            int r2 = r29.nextInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L38d
        L135:
            k1.b r6 = p179k1.C3642b.f16068q0
            fa.b0 r11 = m6069c(r0, r6)
            goto L38d
        L13d:
            androidx.room.a r6 = androidx.room.C0618a.f3666p0
            fa.b0 r12 = m6069c(r0, r6)
            goto L38d
        L145:
            r29.beginObject()
            r18 = r14
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
        L152:
            boolean r6 = r29.hasNext()
            if (r6 == 0) goto L357
            java.lang.String r6 = r29.nextName()
            java.util.Objects.requireNonNull(r6)
            int r10 = r6.hashCode()
            switch(r10) {
                case -1375141843: goto L193;
                case -1337936983: goto L188;
                case -902467928: goto L17d;
                case 937615455: goto L172;
                case 1481625679: goto L167;
                default: goto L166;
            }
        L166:
            goto L19e
        L167:
            java.lang.String r10 = "exception"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L170
            goto L19e
        L170:
            r6 = 4
            goto L19f
        L172:
            java.lang.String r10 = "binaries"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L17b
            goto L19e
        L17b:
            r6 = 3
            goto L19f
        L17d:
            java.lang.String r10 = "signal"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L186
            goto L19e
        L186:
            r6 = 2
            goto L19f
        L188:
            java.lang.String r10 = "threads"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L191
            goto L19e
        L191:
            r6 = 1
            goto L19f
        L193:
            java.lang.String r10 = "appExitInfo"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L19c
            goto L19e
        L19c:
            r6 = 0
            goto L19f
        L19e:
            r6 = -1
        L19f:
            if (r6 == 0) goto L273
            if (r6 == r7) goto L269
            if (r6 == r8) goto L1ba
            if (r6 == r5) goto L1b3
            r10 = 4
            if (r6 == r10) goto L1ae
            r29.skipValue()
            goto L152
        L1ae:
            fa.a0$e$d$a$b$b r19 = m6071e(r29)
            goto L152
        L1b3:
            androidx.room.a r6 = androidx.room.C0618a.f3667q0
            fa.b0 r22 = m6069c(r0, r6)
            goto L152
        L1ba:
            r29.beginObject()
            r24 = r14
            r25 = r24
        L1c1:
            boolean r6 = r29.hasNext()
            if (r6 == 0) goto L22f
            java.lang.String r6 = r29.nextName()
            java.util.Objects.requireNonNull(r6)
            int r10 = r6.hashCode()
            r15 = -1147692044(0xffffffffbb979bf4, float:-0.0046267454)
            if (r10 == r15) goto L1f8
            r15 = 3059181(0x2eaded, float:4.286826E-39)
            if (r10 == r15) goto L1ed
            r15 = 3373707(0x337a8b, float:4.72757E-39)
            if (r10 == r15) goto L1e2
            goto L200
        L1e2:
            java.lang.String r10 = "name"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L1eb
            goto L200
        L1eb:
            r6 = 2
            goto L203
        L1ed:
            java.lang.String r10 = "code"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L1f6
            goto L200
        L1f6:
            r6 = 1
            goto L203
        L1f8:
            java.lang.String r10 = "address"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L202
        L200:
            r6 = -1
            goto L203
        L202:
            r6 = 0
        L203:
            if (r6 == 0) goto L225
            if (r6 == r7) goto L219
            if (r6 == r8) goto L20d
            r29.skipValue()
            goto L1c1
        L20d:
            java.lang.String r6 = r29.nextString()
            java.lang.String r10 = "Null name"
            java.util.Objects.requireNonNull(r6, r10)
            r24 = r6
            goto L1c1
        L219:
            java.lang.String r6 = r29.nextString()
            java.lang.String r10 = "Null code"
            java.util.Objects.requireNonNull(r6, r10)
            r25 = r6
            goto L1c1
        L225:
            long r14 = r29.nextLong()
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r14 = r6
            goto L1c1
        L22f:
            r29.endObject()
            if (r24 != 0) goto L237
            java.lang.String r6 = " name"
            goto L238
        L237:
            r6 = r3
        L238:
            if (r25 != 0) goto L240
            java.lang.String r10 = " code"
            java.lang.String r6 = p064e.C1493g.m4049a(r6, r10)
        L240:
            if (r14 != 0) goto L248
            java.lang.String r10 = " address"
            java.lang.String r6 = p064e.C1493g.m4049a(r6, r10)
        L248:
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L25f
            fa.p r6 = new fa.p
            long r26 = r14.longValue()
            r28 = 0
            r23 = r6
            r23.<init>(r24, r25, r26, r28)
            r21 = r6
            goto L354
        L25f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p064e.C1493g.m4049a(r9, r6)
            r0.<init>(r1)
            throw r0
        L269:
            k1.b r6 = p179k1.C3642b.f16069r0
            fa.b0 r6 = m6069c(r0, r6)
            r18 = r6
            goto L354
        L273:
            fa.c$b r6 = new fa.c$b
            r6.<init>()
            r29.beginObject()
        L27b:
            boolean r10 = r29.hasNext()
            if (r10 == 0) goto L34b
            java.lang.String r10 = r29.nextName()
            java.util.Objects.requireNonNull(r10)
            int r14 = r10.hashCode()
            switch(r14) {
                case 110987: goto L2dc;
                case 111312: goto L2d1;
                case 113234: goto L2c6;
                case 55126294: goto L2bd;
                case 202325402: goto L2b2;
                case 722137681: goto L2a7;
                case 723857505: goto L29c;
                case 2125650548: goto L291;
                default: goto L28f;
            }
        L28f:
            goto L2e7
        L291:
            java.lang.String r14 = "importance"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L29a
            goto L2e7
        L29a:
            r10 = 7
            goto L2e8
        L29c:
            java.lang.String r14 = "traceFile"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L2a5
            goto L2e7
        L2a5:
            r10 = 6
            goto L2e8
        L2a7:
            java.lang.String r14 = "reasonCode"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L2b0
            goto L2e7
        L2b0:
            r10 = 5
            goto L2e8
        L2b2:
            java.lang.String r14 = "processName"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L2bb
            goto L2e7
        L2bb:
            r10 = 4
            goto L2e8
        L2bd:
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto L2c4
            goto L2e7
        L2c4:
            r10 = 3
            goto L2e8
        L2c6:
            java.lang.String r14 = "rss"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L2cf
            goto L2e7
        L2cf:
            r10 = 2
            goto L2e8
        L2d1:
            java.lang.String r14 = "pss"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L2da
            goto L2e7
        L2da:
            r10 = 1
            goto L2e8
        L2dc:
            java.lang.String r14 = "pid"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L2e5
            goto L2e7
        L2e5:
            r10 = 0
            goto L2e8
        L2e7:
            r10 = -1
        L2e8:
            switch(r10) {
                case 0: goto L33f;
                case 1: goto L333;
                case 2: goto L327;
                case 3: goto L31b;
                case 4: goto L30e;
                case 5: goto L302;
                case 6: goto L2fa;
                case 7: goto L2ef;
                default: goto L2eb;
            }
        L2eb:
            r29.skipValue()
            goto L27b
        L2ef:
            int r10 = r29.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.f9678d = r10
            goto L27b
        L2fa:
            java.lang.String r10 = r29.nextString()
            r6.f9682h = r10
            goto L27b
        L302:
            int r10 = r29.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.f9677c = r10
            goto L27b
        L30e:
            java.lang.String r10 = r29.nextString()
            java.lang.String r14 = "Null processName"
            java.util.Objects.requireNonNull(r10, r14)
            r6.f9676b = r10
            goto L27b
        L31b:
            long r14 = r29.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r6.f9681g = r10
            goto L27b
        L327:
            long r14 = r29.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r6.f9680f = r10
            goto L27b
        L333:
            long r14 = r29.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r6.f9679e = r10
            goto L27b
        L33f:
            int r10 = r29.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.f9675a = r10
            goto L27b
        L34b:
            r29.endObject()
            fa.a0$a r6 = r6.m5662a()
            r20 = r6
        L354:
            r14 = 0
            goto L152
        L357:
            r29.endObject()
            if (r21 != 0) goto L35f
            java.lang.String r6 = " signal"
            goto L360
        L35f:
            r6 = r3
        L360:
            if (r22 != 0) goto L368
            java.lang.String r10 = " binaries"
            java.lang.String r6 = p064e.C1493g.m4049a(r6, r10)
        L368:
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L379
            fa.m r6 = new fa.m
            r23 = 0
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r10 = r6
            goto L38c
        L379:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p064e.C1493g.m4049a(r9, r6)
            r0.<init>(r1)
            throw r0
        L383:
            boolean r6 = r29.nextBoolean()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r13 = r6
        L38c:
            r14 = 0
        L38d:
            r6 = 4
            goto Lce
        L390:
            r29.endObject()
            if (r10 != 0) goto L397
            java.lang.String r3 = " execution"
        L397:
            if (r2 != 0) goto L39f
            java.lang.String r4 = " uiOrientation"
            java.lang.String r3 = p064e.C1493g.m4049a(r3, r4)
        L39f:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L3b8
            fa.l r9 = new fa.l
            int r7 = r2.intValue()
            r8 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.f9743c = r9
            goto La
        L3b8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p064e.C1493g.m4049a(r9, r3)
            r0.<init>(r1)
            throw r0
        L3c2:
            fa.s$b r2 = new fa.s$b
            r2.<init>()
            r29.beginObject()
        L3ca:
            boolean r3 = r29.hasNext()
            if (r3 == 0) goto L47b
            java.lang.String r3 = r29.nextName()
            java.util.Objects.requireNonNull(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1708606089: goto L416;
                case -1455558134: goto L40b;
                case -1439500848: goto L400;
                case 279795450: goto L3f5;
                case 976541947: goto L3ea;
                case 1516795582: goto L3df;
                default: goto L3de;
            }
        L3de:
            goto L421
        L3df:
            java.lang.String r4 = "proximityOn"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3e8
            goto L421
        L3e8:
            r3 = 5
            goto L422
        L3ea:
            java.lang.String r4 = "ramUsed"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3f3
            goto L421
        L3f3:
            r3 = 4
            goto L422
        L3f5:
            java.lang.String r4 = "diskUsed"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3fe
            goto L421
        L3fe:
            r3 = 3
            goto L422
        L400:
            java.lang.String r4 = "orientation"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L409
            goto L421
        L409:
            r3 = 2
            goto L422
        L40b:
            java.lang.String r4 = "batteryVelocity"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L414
            goto L421
        L414:
            r3 = 1
            goto L422
        L416:
            java.lang.String r4 = "batteryLevel"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L41f
            goto L421
        L41f:
            r3 = 0
            goto L422
        L421:
            r3 = -1
        L422:
            if (r3 == 0) goto L46e
            if (r3 == r7) goto L461
            r4 = 4
            if (r3 == r8) goto L455
            if (r3 == r5) goto L449
            if (r3 == r4) goto L43e
            if (r3 == r11) goto L433
            r29.skipValue()
            goto L3ca
        L433:
            boolean r3 = r29.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.f9794c = r3
            goto L3ca
        L43e:
            long r9 = r29.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r2.f9796e = r3
            goto L3ca
        L449:
            long r9 = r29.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r2.f9797f = r3
            goto L3ca
        L455:
            int r3 = r29.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f9795d = r3
            goto L3ca
        L461:
            r4 = 4
            int r3 = r29.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f9793b = r3
            goto L3ca
        L46e:
            r4 = 4
            double r9 = r29.nextDouble()
            java.lang.Double r3 = java.lang.Double.valueOf(r9)
            r2.f9792a = r3
            goto L3ca
        L47b:
            r29.endObject()
            fa.a0$e$d$c r2 = r2.m5690a()
            r1.f9744d = r2
            goto La
        L486:
            r29.endObject()
            fa.a0$e$d r0 = r1.mo5649a()
            return r0
    }

    /* renamed from: e */
    public static p094fa.AbstractC2103a0.e.d.a.b.AbstractC7385b m6071e(android.util.JsonReader r8) {
            r8.beginObject()
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
        L8:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L82
            java.lang.String r1 = r8.nextName()
            java.util.Objects.requireNonNull(r1)
            r1.hashCode()
            r6 = -1
            int r7 = r1.hashCode()
            switch(r7) {
                case -1266514778: goto L4d;
                case -934964668: goto L42;
                case 3575610: goto L37;
                case 91997906: goto L2c;
                case 581754413: goto L21;
                default: goto L20;
            }
        L20:
            goto L57
        L21:
            java.lang.String r7 = "overflowCount"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L2a
            goto L57
        L2a:
            r6 = 4
            goto L57
        L2c:
            java.lang.String r7 = "causedBy"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L35
            goto L57
        L35:
            r6 = 3
            goto L57
        L37:
            java.lang.String r7 = "type"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L40
            goto L57
        L40:
            r6 = 2
            goto L57
        L42:
            java.lang.String r7 = "reason"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L4b
            goto L57
        L4b:
            r6 = 1
            goto L57
        L4d:
            java.lang.String r7 = "frames"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L56
            goto L57
        L56:
            r6 = 0
        L57:
            switch(r6) {
                case 0: goto L7b;
                case 1: goto L76;
                case 2: goto L6c;
                case 3: goto L67;
                case 4: goto L5e;
                default: goto L5a;
            }
        L5a:
            r8.skipValue()
            goto L8
        L5e:
            int r0 = r8.nextInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L8
        L67:
            fa.a0$e$d$a$b$b r5 = m6071e(r8)
            goto L8
        L6c:
            java.lang.String r2 = r8.nextString()
            java.lang.String r1 = "Null type"
            java.util.Objects.requireNonNull(r2, r1)
            goto L8
        L76:
            java.lang.String r3 = r8.nextString()
            goto L8
        L7b:
            k1.d r1 = p179k1.C3646d.f16128q0
            fa.b0 r4 = m6069c(r8, r1)
            goto L8
        L82:
            r8.endObject()
            if (r2 != 0) goto L8a
            java.lang.String r8 = " type"
            goto L8c
        L8a:
            java.lang.String r8 = ""
        L8c:
            if (r4 != 0) goto L94
            java.lang.String r1 = " frames"
            java.lang.String r8 = p064e.C1493g.m4049a(r8, r1)
        L94:
            if (r0 != 0) goto L9c
            java.lang.String r1 = " overflowCount"
            java.lang.String r8 = p064e.C1493g.m4049a(r8, r1)
        L9c:
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto Lae
            fa.o r8 = new fa.o
            int r6 = r0.intValue()
            r7 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
        Lae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties:"
            java.lang.String r8 = p064e.C1493g.m4049a(r1, r8)
            r0.<init>(r8)
            throw r0
    }

    /* renamed from: f */
    public static p094fa.AbstractC2103a0 m6072f(android.util.JsonReader r31) {
            r0 = r31
            java.nio.charset.Charset r1 = p094fa.AbstractC2103a0.f9649a
            fa.b$b r1 = new fa.b$b
            r1.<init>()
            r31.beginObject()
        Lc:
            boolean r2 = r31.hasNext()
            if (r2 == 0) goto L54b
            java.lang.String r2 = r31.nextName()
            java.util.Objects.requireNonNull(r2)
            int r3 = r2.hashCode()
            java.lang.String r4 = "displayVersion"
            java.lang.String r5 = "platform"
            java.lang.String r6 = "installationUuid"
            java.lang.String r7 = "buildVersion"
            r8 = 0
            switch(r3) {
                case -2118372775: goto L6f;
                case -1962630338: goto L64;
                case -911706486: goto L5b;
                case 344431858: goto L50;
                case 719853845: goto L47;
                case 1874684019: goto L3e;
                case 1975623094: goto L35;
                case 1984987798: goto L2a;
                default: goto L29;
            }
        L29:
            goto L7a
        L2a:
            java.lang.String r3 = "session"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L33
            goto L7a
        L33:
            r2 = 7
            goto L7b
        L35:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L3c
            goto L7a
        L3c:
            r2 = 6
            goto L7b
        L3e:
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L45
            goto L7a
        L45:
            r2 = 5
            goto L7b
        L47:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L4e
            goto L7a
        L4e:
            r2 = 4
            goto L7b
        L50:
            java.lang.String r3 = "gmpAppId"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L59
            goto L7a
        L59:
            r2 = 3
            goto L7b
        L5b:
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L62
            goto L7a
        L62:
            r2 = 2
            goto L7b
        L64:
            java.lang.String r3 = "sdkVersion"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6d
            goto L7a
        L6d:
            r2 = 1
            goto L7b
        L6f:
            java.lang.String r3 = "ndkPayload"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L78
            goto L7a
        L78:
            r2 = 0
            goto L7b
        L7a:
            r2 = -1
        L7b:
            java.lang.String r3 = ""
            java.lang.String r9 = "Missing required properties:"
            java.lang.String r10 = "Null buildVersion"
            switch(r2) {
                case 0: goto L4f3;
                case 1: goto L4e6;
                case 2: goto L4db;
                case 3: goto L4ce;
                case 4: goto L4c1;
                case 5: goto L4b5;
                case 6: goto L4a8;
                case 7: goto L88;
                default: goto L84;
            }
        L84:
            r31.skipValue()
            goto Lc
        L88:
            fa.g$b r2 = new fa.g$b
            r2.<init>()
            r2.m5684b(r8)
            r31.beginObject()
        L93:
            boolean r8 = r31.hasNext()
            if (r8 == 0) goto L49d
            java.lang.String r8 = r31.nextName()
            java.util.Objects.requireNonNull(r8)
            int r11 = r8.hashCode()
            java.lang.String r12 = "identifier"
            switch(r11) {
                case -2128794476: goto L120;
                case -1618432855: goto L117;
                case -1606742899: goto L10c;
                case -1335157162: goto L101;
                case -1291329255: goto Lf6;
                case 3556: goto Leb;
                case 96801: goto Le0;
                case 3599307: goto Ld5;
                case 286956243: goto Lc7;
                case 1025385094: goto Lb9;
                case 2047016109: goto Lab;
                default: goto La9;
            }
        La9:
            goto L12b
        Lab:
            java.lang.String r11 = "generatorType"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto Lb5
            goto L12b
        Lb5:
            r8 = 10
            goto L12c
        Lb9:
            java.lang.String r11 = "crashed"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto Lc3
            goto L12b
        Lc3:
            r8 = 9
            goto L12c
        Lc7:
            java.lang.String r11 = "generator"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto Ld1
            goto L12b
        Ld1:
            r8 = 8
            goto L12c
        Ld5:
            java.lang.String r11 = "user"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto Lde
            goto L12b
        Lde:
            r8 = 7
            goto L12c
        Le0:
            java.lang.String r11 = "app"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto Le9
            goto L12b
        Le9:
            r8 = 6
            goto L12c
        Leb:
            java.lang.String r11 = "os"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto Lf4
            goto L12b
        Lf4:
            r8 = 5
            goto L12c
        Lf6:
            java.lang.String r11 = "events"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto Lff
            goto L12b
        Lff:
            r8 = 4
            goto L12c
        L101:
            java.lang.String r11 = "device"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L10a
            goto L12b
        L10a:
            r8 = 3
            goto L12c
        L10c:
            java.lang.String r11 = "endedAt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L115
            goto L12b
        L115:
            r8 = 2
            goto L12c
        L117:
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L11e
            goto L12b
        L11e:
            r8 = 1
            goto L12c
        L120:
            java.lang.String r11 = "startedAt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L129
            goto L12b
        L129:
            r8 = 0
            goto L12c
        L12b:
            r8 = -1
        L12c:
            java.lang.String r11 = "Null version"
            java.lang.String r13 = " version"
            java.lang.String r14 = "version"
            java.lang.String r15 = "Null identifier"
            java.lang.String r16 = " identifier"
            switch(r8) {
                case 0: goto L48d;
                case 1: goto L478;
                case 2: goto L46b;
                case 3: goto L363;
                case 4: goto L357;
                case 5: goto L294;
                case 6: goto L1a7;
                case 7: goto L15f;
                case 8: goto L153;
                case 9: goto L14b;
                case 10: goto L140;
                default: goto L139;
            }
        L139:
            r17 = r3
            r31.skipValue()
            goto L499
        L140:
            int r8 = r31.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2.f9710k = r8
            goto L199
        L14b:
            boolean r8 = r31.nextBoolean()
            r2.m5684b(r8)
            goto L199
        L153:
            java.lang.String r8 = r31.nextString()
            java.lang.String r11 = "Null generator"
            java.util.Objects.requireNonNull(r8, r11)
            r2.f9700a = r8
            goto L199
        L15f:
            r31.beginObject()
            r8 = 0
        L163:
            boolean r11 = r31.hasNext()
            if (r11 == 0) goto L182
            java.lang.String r11 = r31.nextName()
            java.util.Objects.requireNonNull(r11)
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L17a
            r31.skipValue()
            goto L163
        L17a:
            java.lang.String r8 = r31.nextString()
            java.util.Objects.requireNonNull(r8, r15)
            goto L163
        L182:
            r31.endObject()
            if (r8 != 0) goto L18a
            r11 = r16
            goto L18b
        L18a:
            r11 = r3
        L18b:
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L19d
            fa.v r11 = new fa.v
            r12 = 0
            r11.<init>(r8, r12)
            r2.f9706g = r11
        L199:
            r17 = r3
            goto L499
        L19d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p064e.C1493g.m4049a(r9, r11)
            r0.<init>(r1)
            throw r0
        L1a7:
            r31.beginObject()
            r8 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = r8
            r24 = r17
            r25 = r18
            r27 = r19
            r28 = r20
            r29 = r21
        L1c1:
            boolean r8 = r31.hasNext()
            if (r8 == 0) goto L263
            java.lang.String r8 = r31.nextName()
            java.util.Objects.requireNonNull(r8)
            int r17 = r8.hashCode()
            switch(r17) {
                case -1618432855: goto L20f;
                case -519438642: goto L202;
                case 213652010: goto L1f5;
                case 351608024: goto L1ea;
                case 719853845: goto L1e1;
                case 1975623094: goto L1d8;
                default: goto L1d5;
            }
        L1d5:
            r17 = r3
            goto L21a
        L1d8:
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L1df
            goto L1d5
        L1df:
            r8 = 5
            goto L1f2
        L1e1:
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L1e8
            goto L1d5
        L1e8:
            r8 = 4
            goto L1f2
        L1ea:
            boolean r8 = r8.equals(r14)
            if (r8 != 0) goto L1f1
            goto L1d5
        L1f1:
            r8 = 3
        L1f2:
            r17 = r3
            goto L21b
        L1f5:
            r17 = r3
            java.lang.String r3 = "developmentPlatformVersion"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L200
            goto L21a
        L200:
            r8 = 2
            goto L21b
        L202:
            r17 = r3
            java.lang.String r3 = "developmentPlatform"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L20d
            goto L21a
        L20d:
            r8 = 1
            goto L21b
        L20f:
            r17 = r3
            boolean r3 = r8.equals(r12)
            if (r3 != 0) goto L218
            goto L21a
        L218:
            r8 = 0
            goto L21b
        L21a:
            r8 = -1
        L21b:
            if (r8 == 0) goto L256
            r3 = 1
            if (r8 == r3) goto L24f
            r3 = 2
            if (r8 == r3) goto L248
            r3 = 3
            if (r8 == r3) goto L23e
            r3 = 4
            if (r8 == r3) goto L237
            r3 = 5
            if (r8 == r3) goto L230
            r31.skipValue()
            goto L25f
        L230:
            java.lang.String r3 = r31.nextString()
            r25 = r3
            goto L25f
        L237:
            java.lang.String r3 = r31.nextString()
            r27 = r3
            goto L25f
        L23e:
            java.lang.String r3 = r31.nextString()
            java.util.Objects.requireNonNull(r3, r11)
            r24 = r3
            goto L25f
        L248:
            java.lang.String r3 = r31.nextString()
            r29 = r3
            goto L25f
        L24f:
            java.lang.String r3 = r31.nextString()
            r28 = r3
            goto L25f
        L256:
            java.lang.String r3 = r31.nextString()
            java.util.Objects.requireNonNull(r3, r15)
            r23 = r3
        L25f:
            r3 = r17
            goto L1c1
        L263:
            r17 = r3
            r31.endObject()
            if (r23 != 0) goto L26d
            r3 = r16
            goto L26f
        L26d:
            r3 = r17
        L26f:
            if (r24 != 0) goto L275
            java.lang.String r3 = p064e.C1493g.m4049a(r3, r13)
        L275:
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L28a
            fa.h r3 = new fa.h
            r26 = 0
            r30 = 0
            r22 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            r2.f9705f = r3
            goto L499
        L28a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p064e.C1493g.m4049a(r9, r3)
            r0.<init>(r1)
            throw r0
        L294:
            r17 = r3
            r31.beginObject()
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r20 = r12
            r21 = r15
        L2a1:
            boolean r12 = r31.hasNext()
            if (r12 == 0) goto L312
            java.lang.String r12 = r31.nextName()
            java.util.Objects.requireNonNull(r12)
            int r15 = r12.hashCode()
            switch(r15) {
                case -911706486: goto L2d3;
                case -293026577: goto L2c8;
                case 351608024: goto L2bf;
                case 1874684019: goto L2b6;
                default: goto L2b5;
            }
        L2b5:
            goto L2dc
        L2b6:
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L2bd
            goto L2dc
        L2bd:
            r12 = 3
            goto L2dd
        L2bf:
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L2c6
            goto L2dc
        L2c6:
            r12 = 2
            goto L2dd
        L2c8:
            java.lang.String r15 = "jailbroken"
            boolean r12 = r12.equals(r15)
            if (r12 != 0) goto L2d1
            goto L2dc
        L2d1:
            r12 = 1
            goto L2dd
        L2d3:
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L2da
            goto L2dc
        L2da:
            r12 = 0
            goto L2dd
        L2dc:
            r12 = -1
        L2dd:
            if (r12 == 0) goto L308
            r15 = 1
            if (r12 == r15) goto L2ff
            r15 = 2
            if (r12 == r15) goto L2f5
            r15 = 3
            if (r12 == r15) goto L2ec
            r31.skipValue()
            goto L2a1
        L2ec:
            int r8 = r31.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L2a1
        L2f5:
            java.lang.String r12 = r31.nextString()
            java.util.Objects.requireNonNull(r12, r11)
            r20 = r12
            goto L2a1
        L2ff:
            boolean r3 = r31.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L2a1
        L308:
            java.lang.String r12 = r31.nextString()
            java.util.Objects.requireNonNull(r12, r10)
            r21 = r12
            goto L2a1
        L312:
            r31.endObject()
            if (r8 != 0) goto L31a
            java.lang.String r11 = " platform"
            goto L31c
        L31a:
            r11 = r17
        L31c:
            if (r20 != 0) goto L322
            java.lang.String r11 = p064e.C1493g.m4049a(r11, r13)
        L322:
            if (r21 != 0) goto L32a
            java.lang.String r12 = " buildVersion"
            java.lang.String r11 = p064e.C1493g.m4049a(r11, r12)
        L32a:
            if (r3 != 0) goto L332
            java.lang.String r12 = " jailbroken"
            java.lang.String r11 = p064e.C1493g.m4049a(r11, r12)
        L332:
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L34d
            fa.u r11 = new fa.u
            int r19 = r8.intValue()
            boolean r22 = r3.booleanValue()
            r23 = 0
            r18 = r11
            r18.<init>(r19, r20, r21, r22, r23)
            r2.f9707h = r11
            goto L499
        L34d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p064e.C1493g.m4049a(r9, r11)
            r0.<init>(r1)
            throw r0
        L357:
            r17 = r3
            k1.d r3 = p179k1.C3646d.f16127p0
            fa.b0 r3 = m6069c(r0, r3)
            r2.f9709j = r3
            goto L499
        L363:
            r17 = r3
            fa.j$b r3 = new fa.j$b
            r3.<init>()
            r31.beginObject()
        L36d:
            boolean r8 = r31.hasNext()
            if (r8 == 0) goto L461
            java.lang.String r8 = r31.nextName()
            java.util.Objects.requireNonNull(r8)
            int r11 = r8.hashCode()
            switch(r11) {
                case -1981332476: goto L3de;
                case -1969347631: goto L3d3;
                case 112670: goto L3c8;
                case 3002454: goto L3bd;
                case 81784169: goto L3b2;
                case 94848180: goto L3a7;
                case 104069929: goto L39c;
                case 109757585: goto L391;
                case 2078953423: goto L383;
                default: goto L381;
            }
        L381:
            goto L3e9
        L383:
            java.lang.String r11 = "modelClass"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L38d
            goto L3e9
        L38d:
            r8 = 8
            goto L3ea
        L391:
            java.lang.String r11 = "state"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L39a
            goto L3e9
        L39a:
            r8 = 7
            goto L3ea
        L39c:
            java.lang.String r11 = "model"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L3a5
            goto L3e9
        L3a5:
            r8 = 6
            goto L3ea
        L3a7:
            java.lang.String r11 = "cores"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L3b0
            goto L3e9
        L3b0:
            r8 = 5
            goto L3ea
        L3b2:
            java.lang.String r11 = "diskSpace"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L3bb
            goto L3e9
        L3bb:
            r8 = 4
            goto L3ea
        L3bd:
            java.lang.String r11 = "arch"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L3c6
            goto L3e9
        L3c6:
            r8 = 3
            goto L3ea
        L3c8:
            java.lang.String r11 = "ram"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L3d1
            goto L3e9
        L3d1:
            r8 = 2
            goto L3ea
        L3d3:
            java.lang.String r11 = "manufacturer"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L3dc
            goto L3e9
        L3dc:
            r8 = 1
            goto L3ea
        L3de:
            java.lang.String r11 = "simulator"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L3e7
            goto L3e9
        L3e7:
            r8 = 0
            goto L3ea
        L3e9:
            r8 = -1
        L3ea:
            switch(r8) {
                case 0: goto L455;
                case 1: goto L448;
                case 2: goto L43c;
                case 3: goto L430;
                case 4: goto L424;
                case 5: goto L418;
                case 6: goto L40b;
                case 7: goto L3ff;
                case 8: goto L3f2;
                default: goto L3ed;
            }
        L3ed:
            r31.skipValue()
            goto L36d
        L3f2:
            java.lang.String r8 = r31.nextString()
            java.lang.String r11 = "Null modelClass"
            java.util.Objects.requireNonNull(r8, r11)
            r3.f9735i = r8
            goto L36d
        L3ff:
            int r8 = r31.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.f9733g = r8
            goto L36d
        L40b:
            java.lang.String r8 = r31.nextString()
            java.lang.String r11 = "Null model"
            java.util.Objects.requireNonNull(r8, r11)
            r3.f9728b = r8
            goto L36d
        L418:
            int r8 = r31.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.f9729c = r8
            goto L36d
        L424:
            long r11 = r31.nextLong()
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            r3.f9731e = r8
            goto L36d
        L430:
            int r8 = r31.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.f9727a = r8
            goto L36d
        L43c:
            long r11 = r31.nextLong()
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            r3.f9730d = r8
            goto L36d
        L448:
            java.lang.String r8 = r31.nextString()
            java.lang.String r11 = "Null manufacturer"
            java.util.Objects.requireNonNull(r8, r11)
            r3.f9734h = r8
            goto L36d
        L455:
            boolean r8 = r31.nextBoolean()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r3.f9732f = r8
            goto L36d
        L461:
            r31.endObject()
            fa.a0$e$c r3 = r3.m5685a()
            r2.f9708i = r3
            goto L499
        L46b:
            r17 = r3
            long r11 = r31.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r2.f9703d = r3
            goto L499
        L478:
            r17 = r3
            java.lang.String r3 = r31.nextString()
            r8 = 2
            byte[] r3 = android.util.Base64.decode(r3, r8)
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r11 = p094fa.AbstractC2103a0.f9649a
            r8.<init>(r3, r11)
            r2.f9701b = r8
            goto L499
        L48d:
            r17 = r3
            long r11 = r31.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r2.f9702c = r3
        L499:
            r3 = r17
            goto L93
        L49d:
            r31.endObject()
            fa.a0$e r2 = r2.mo5602a()
            r1.f9664g = r2
            goto Lc
        L4a8:
            java.lang.String r2 = r31.nextString()
            java.lang.String r3 = "Null displayVersion"
            java.util.Objects.requireNonNull(r2, r3)
            r1.f9663f = r2
            goto Lc
        L4b5:
            int r2 = r31.nextInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.f9660c = r2
            goto Lc
        L4c1:
            java.lang.String r2 = r31.nextString()
            java.lang.String r3 = "Null installationUuid"
            java.util.Objects.requireNonNull(r2, r3)
            r1.f9661d = r2
            goto Lc
        L4ce:
            java.lang.String r2 = r31.nextString()
            java.lang.String r3 = "Null gmpAppId"
            java.util.Objects.requireNonNull(r2, r3)
            r1.f9659b = r2
            goto Lc
        L4db:
            java.lang.String r2 = r31.nextString()
            java.util.Objects.requireNonNull(r2, r10)
            r1.f9662e = r2
            goto Lc
        L4e6:
            java.lang.String r2 = r31.nextString()
            java.lang.String r3 = "Null sdkVersion"
            java.util.Objects.requireNonNull(r2, r3)
            r1.f9658a = r2
            goto Lc
        L4f3:
            r17 = r3
            r31.beginObject()
            r2 = 0
            r3 = 0
        L4fa:
            boolean r4 = r31.hasNext()
            if (r4 == 0) goto L527
            java.lang.String r4 = r31.nextName()
            java.util.Objects.requireNonNull(r4)
            java.lang.String r5 = "files"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L520
            java.lang.String r5 = "orgId"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L51b
            r31.skipValue()
            goto L4fa
        L51b:
            java.lang.String r2 = r31.nextString()
            goto L4fa
        L520:
            k1.c r3 = p179k1.C3644c.f16097s0
            fa.b0 r3 = m6069c(r0, r3)
            goto L4fa
        L527:
            r31.endObject()
            if (r3 != 0) goto L52f
            java.lang.String r4 = " files"
            goto L531
        L52f:
            r4 = r17
        L531:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L541
            fa.e r4 = new fa.e
            r5 = 0
            r4.<init>(r3, r2, r5)
            r1.f9665h = r4
            goto Lc
        L541:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p064e.C1493g.m4049a(r9, r4)
            r0.<init>(r1)
            throw r0
        L54b:
            r31.endObject()
            fa.a0 r0 = r1.mo5575a()
            return r0
    }

    /* renamed from: g */
    public p094fa.AbstractC2103a0 m6073g(java.lang.String r3) {
            r2 = this;
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch: java.lang.IllegalStateException -> L1c
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.lang.IllegalStateException -> L1c
            r1.<init>(r3)     // Catch: java.lang.IllegalStateException -> L1c
            r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> L1c
            fa.a0 r3 = m6072f(r0)     // Catch: java.lang.Throwable -> L12
            r0.close()     // Catch: java.lang.IllegalStateException -> L1c
            return r3
        L12:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L1c
        L1b:
            throw r3     // Catch: java.lang.IllegalStateException -> L1c
        L1c:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: h */
    public java.lang.String m6074h(p094fa.AbstractC2103a0 r3) {
            r2 = this;
            qa.a r0 = ga.C2310a.f10530a
            sa.d r0 = (sa.C6004d) r0
            java.util.Objects.requireNonNull(r0)
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            r0.m12485a(r3, r1)     // Catch: java.io.IOException -> Lf
        Lf:
            java.lang.String r3 = r1.toString()
            return r3
    }
}

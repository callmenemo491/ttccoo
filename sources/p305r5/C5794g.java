package p305r5;

/* renamed from: r5.g */
/* loaded from: classes.dex */
public final class C5794g extends p143i5.AbstractC3081e {

    /* renamed from: n */
    public final p371v5.C6571u f22474n;

    /* renamed from: o */
    public final p305r5.C5789b f22475o;

    public C5794g() {
            r1 = this;
            java.lang.String r0 = "WebvttDecoder"
            r1.<init>(r0)
            v5.u r0 = new v5.u
            r0.<init>()
            r1.f22474n = r0
            r5.b r0 = new r5.b
            r0.<init>()
            r1.f22475o = r0
            return
    }

    @Override // p143i5.AbstractC3081e
    /* renamed from: j */
    public p143i5.InterfaceC3082f mo7541j(byte[] r21, int r22, boolean r23) {
            r20 = this;
            r1 = r20
            v5.u r0 = r1.f22474n
            r2 = r21
            r0.f25710a = r2
            r2 = r22
            r0.f25712c = r2
            r2 = 0
            r0.f25711b = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            v5.u r3 = r1.f22474n     // Catch: p088f4.C2044s0 -> L3f8
            p305r5.C5795h.m12159c(r3)     // Catch: p088f4.C2044s0 -> L3f8
        L19:
            v5.u r3 = r1.f22474n
            java.lang.String r3 = r3.m13404g()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L26
            goto L19
        L26:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L2b:
            v5.u r4 = r1.f22474n
            r6 = 2
            r7 = -1
            r8 = 1
            r9 = -1
            r10 = 0
        L32:
            if (r9 != r7) goto L54
            int r10 = r4.f25711b
            java.lang.String r9 = r4.m13404g()
            if (r9 != 0) goto L3e
            r9 = 0
            goto L32
        L3e:
            java.lang.String r11 = "STYLE"
            boolean r11 = r11.equals(r9)
            if (r11 == 0) goto L48
            r9 = 2
            goto L32
        L48:
            java.lang.String r11 = "NOTE"
            boolean r9 = r9.startsWith(r11)
            if (r9 == 0) goto L52
            r9 = 1
            goto L32
        L52:
            r9 = 3
            goto L32
        L54:
            r4.m13396F(r10)
            if (r9 == 0) goto L3f2
            if (r9 != r8) goto L68
            v5.u r4 = r1.f22474n
        L5d:
            java.lang.String r5 = r4.m13404g()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L2b
            goto L5d
        L68:
            if (r9 != r6) goto L3ae
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L3a6
            v5.u r9 = r1.f22474n
            r9.m13404g()
            r5.b r9 = r1.f22475o
            v5.u r10 = r1.f22474n
            java.lang.StringBuilder r11 = r9.f22426b
            r11.setLength(r2)
            int r11 = r10.f25711b
        L80:
            java.lang.String r12 = r10.m13404g()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L80
            v5.u r12 = r9.f22425a
            byte[] r13 = r10.f25710a
            int r10 = r10.f25711b
            r12.m13394D(r13, r10)
            v5.u r10 = r9.f22425a
            r10.m13396F(r11)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L9d:
            v5.u r11 = r9.f22425a
            java.lang.StringBuilder r12 = r9.f22426b
            p305r5.C5789b.m12145c(r11)
            int r13 = r11.m13398a()
            r14 = 5
            java.lang.String r15 = "{"
            java.lang.String r4 = ""
            if (r13 >= r14) goto Lb0
            goto L111
        Lb0:
            java.lang.String r13 = r11.m13415r(r14)
            java.lang.String r14 = "::cue"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto Lbd
            goto L111
        Lbd:
            int r13 = r11.f25711b
            java.lang.String r14 = p305r5.C5789b.m12144b(r11, r12)
            if (r14 != 0) goto Lc6
            goto L111
        Lc6:
            boolean r16 = r15.equals(r14)
            if (r16 == 0) goto Ld1
            r11.m13396F(r13)
            r5 = r4
            goto L112
        Ld1:
            java.lang.String r13 = "("
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L104
            int r13 = r11.f25711b
            int r14 = r11.f25712c
            r16 = 0
        Ldf:
            if (r13 >= r14) goto Lf6
            if (r16 != 0) goto Lf6
            byte[] r5 = r11.f25710a
            int r16 = r13 + 1
            r5 = r5[r13]
            char r5 = (char) r5
            r13 = 41
            if (r5 != r13) goto Lf0
            r5 = 1
            goto Lf1
        Lf0:
            r5 = 0
        Lf1:
            r13 = r16
            r16 = r5
            goto Ldf
        Lf6:
            int r13 = r13 + (-1)
            int r5 = r11.f25711b
            int r13 = r13 - r5
            java.lang.String r5 = r11.m13415r(r13)
            java.lang.String r5 = r5.trim()
            goto L105
        L104:
            r5 = 0
        L105:
            java.lang.String r11 = p305r5.C5789b.m12144b(r11, r12)
            java.lang.String r12 = ")"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L112
        L111:
            r5 = 0
        L112:
            if (r5 == 0) goto L3a2
            v5.u r11 = r9.f22425a
            java.lang.StringBuilder r12 = r9.f22426b
            java.lang.String r11 = p305r5.C5789b.m12144b(r11, r12)
            boolean r11 = r15.equals(r11)
            if (r11 != 0) goto L124
            goto L3a2
        L124:
            r5.c r11 = new r5.c
            r11.<init>()
            boolean r12 = r4.equals(r5)
            if (r12 == 0) goto L130
            goto L197
        L130:
            r12 = 91
            int r12 = r5.indexOf(r12)
            if (r12 == r7) goto L155
            java.util.regex.Pattern r13 = p305r5.C5789b.f22423c
            java.lang.String r14 = r5.substring(r12)
            java.util.regex.Matcher r13 = r13.matcher(r14)
            boolean r14 = r13.matches()
            if (r14 == 0) goto L151
            java.lang.String r13 = r13.group(r8)
            java.util.Objects.requireNonNull(r13)
            r11.f22430d = r13
        L151:
            java.lang.String r5 = r5.substring(r2, r12)
        L155:
            java.lang.String r12 = "\\."
            java.lang.String[] r5 = p371v5.C6552b0.m13303G(r5, r12)
            r12 = r5[r2]
            r13 = 35
            int r13 = r12.indexOf(r13)
            if (r13 == r7) goto L174
            java.lang.String r14 = r12.substring(r2, r13)
            r11.f22428b = r14
            int r13 = r13 + 1
            java.lang.String r12 = r12.substring(r13)
            r11.f22427a = r12
            goto L176
        L174:
            r11.f22428b = r12
        L176:
            int r12 = r5.length
            if (r12 <= r8) goto L197
            int r12 = r5.length
            p371v5.C6549a.m13288b(r8)
            int r13 = r5.length
            if (r12 > r13) goto L182
            r13 = 1
            goto L183
        L182:
            r13 = 0
        L183:
            p371v5.C6549a.m13288b(r13)
            java.lang.Object[] r5 = java.util.Arrays.copyOfRange(r5, r8, r12)
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.util.HashSet r12 = new java.util.HashSet
            java.util.List r5 = java.util.Arrays.asList(r5)
            r12.<init>(r5)
            r11.f22429c = r12
        L197:
            r5 = 0
            r12 = 0
        L199:
            java.lang.String r13 = "}"
            if (r5 != 0) goto L391
            v5.u r5 = r9.f22425a
            int r12 = r5.f25711b
            java.lang.StringBuilder r14 = r9.f22426b
            java.lang.String r5 = p305r5.C5789b.m12144b(r5, r14)
            if (r5 == 0) goto L1b2
            boolean r14 = r13.equals(r5)
            if (r14 == 0) goto L1b0
            goto L1b2
        L1b0:
            r14 = 0
            goto L1b3
        L1b2:
            r14 = 1
        L1b3:
            if (r14 != 0) goto L384
            v5.u r15 = r9.f22425a
            r15.m13396F(r12)
            v5.u r12 = r9.f22425a
            java.lang.StringBuilder r15 = r9.f22426b
            p305r5.C5789b.m12145c(r12)
            java.lang.String r2 = p305r5.C5789b.m12143a(r12, r15)
            boolean r16 = r4.equals(r2)
            if (r16 == 0) goto L1cd
            goto L384
        L1cd:
            java.lang.String r7 = p305r5.C5789b.m12144b(r12, r15)
            java.lang.String r6 = ":"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L1db
            goto L384
        L1db:
            p305r5.C5789b.m12145c(r12)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 0
        L1e4:
            java.lang.String r8 = ";"
            r17 = r5
            if (r7 != 0) goto L212
            int r5 = r12.f25711b
            r18 = r7
            java.lang.String r7 = p305r5.C5789b.m12144b(r12, r15)
            if (r7 != 0) goto L1f6
            r5 = 0
            goto L216
        L1f6:
            boolean r19 = r13.equals(r7)
            if (r19 != 0) goto L20b
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L203
            goto L20b
        L203:
            r6.append(r7)
            r5 = r17
            r7 = r18
            goto L1e4
        L20b:
            r12.m13396F(r5)
            r5 = r17
            r7 = 1
            goto L1e4
        L212:
            java.lang.String r5 = r6.toString()
        L216:
            if (r5 == 0) goto L386
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L220
            goto L386
        L220:
            int r6 = r12.f25711b
            java.lang.String r7 = p305r5.C5789b.m12144b(r12, r15)
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L22d
            goto L236
        L22d:
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L386
            r12.m13396F(r6)
        L236:
            java.lang.String r6 = "color"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L249
            r6 = 1
            int r2 = p371v5.C6556f.m13341a(r5, r6)
            r11.f22432f = r2
            r11.f22433g = r6
            goto L386
        L249:
            r6 = 1
            java.lang.String r7 = "background-color"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L25c
            int r2 = p371v5.C6556f.m13341a(r5, r6)
            r11.f22434h = r2
            r11.f22435i = r6
            goto L386
        L25c:
            java.lang.String r7 = "ruby-position"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L27d
            java.lang.String r2 = "over"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L270
            r11.f22442p = r6
            goto L386
        L270:
            java.lang.String r2 = "under"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L386
            r2 = 2
            r11.f22442p = r2
            goto L386
        L27d:
            java.lang.String r6 = "text-combine-upright"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L29d
            java.lang.String r2 = "all"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L298
            java.lang.String r2 = "digits"
            boolean r2 = r5.startsWith(r2)
            if (r2 == 0) goto L296
            goto L298
        L296:
            r2 = 0
            goto L299
        L298:
            r2 = 1
        L299:
            r11.f22443q = r2
            goto L386
        L29d:
            java.lang.String r6 = "text-decoration"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L2b2
            java.lang.String r2 = "underline"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L386
            r2 = 1
            r11.f22437k = r2
            goto L386
        L2b2:
            java.lang.String r6 = "font-family"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L2c2
            java.lang.String r2 = p185k7.C3836i.m8629n(r5)
            r11.f22431e = r2
            goto L386
        L2c2:
            java.lang.String r6 = "font-weight"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L2d7
            java.lang.String r2 = "bold"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L386
            r6 = 1
            r11.f22438l = r6
            goto L386
        L2d7:
            r6 = 1
            java.lang.String r7 = "font-style"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L2ec
            java.lang.String r2 = "italic"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L386
            r11.f22439m = r6
            goto L386
        L2ec:
            java.lang.String r6 = "font-size"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L386
            java.util.regex.Pattern r2 = p305r5.C5789b.f22424d
            java.lang.String r6 = p185k7.C3836i.m8629n(r5)
            java.util.regex.Matcher r2 = r2.matcher(r6)
            boolean r6 = r2.matches()
            if (r6 != 0) goto L326
            int r2 = r5.length()
            int r2 = r2 + 22
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            java.lang.String r2 = "Invalid font-size: '"
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = "'."
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r5 = "WebvttCssParser"
            android.util.Log.w(r5, r2)
            goto L386
        L326:
            r5 = 2
            java.lang.String r6 = r2.group(r5)
            java.util.Objects.requireNonNull(r6)
            int r5 = r6.hashCode()
            r7 = 37
            if (r5 == r7) goto L355
            r7 = 3240(0xca8, float:4.54E-42)
            if (r5 == r7) goto L34a
            r7 = 3592(0xe08, float:5.033E-42)
            if (r5 == r7) goto L33f
            goto L35d
        L33f:
            java.lang.String r5 = "px"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L348
            goto L35d
        L348:
            r6 = 2
            goto L360
        L34a:
            java.lang.String r5 = "em"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L353
            goto L35d
        L353:
            r6 = 1
            goto L360
        L355:
            java.lang.String r5 = "%"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L35f
        L35d:
            r6 = -1
            goto L360
        L35f:
            r6 = 0
        L360:
            r5 = 1
            r7 = 2
            if (r6 == 0) goto L373
            if (r6 == r5) goto L371
            if (r6 != r7) goto L36b
            r11.f22440n = r5
            goto L376
        L36b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L371:
            r6 = 2
            goto L374
        L373:
            r6 = 3
        L374:
            r11.f22440n = r6
        L376:
            java.lang.String r2 = r2.group(r5)
            java.util.Objects.requireNonNull(r2)
            float r2 = java.lang.Float.parseFloat(r2)
            r11.f22441o = r2
            goto L388
        L384:
            r17 = r5
        L386:
            r5 = 1
            r7 = 2
        L388:
            r5 = r14
            r12 = r17
            r2 = 0
            r6 = 2
            r7 = -1
            r8 = 1
            goto L199
        L391:
            r5 = 1
            r7 = 2
            boolean r2 = r13.equals(r12)
            if (r2 == 0) goto L39c
            r10.add(r11)
        L39c:
            r2 = 0
            r6 = 2
            r7 = -1
            r8 = 1
            goto L9d
        L3a2:
            r0.addAll(r10)
            goto L3ef
        L3a6:
            i5.h r0 = new i5.h
            java.lang.String r2 = "A style block was found after the first cue."
            r0.<init>(r2)
            throw r0
        L3ae:
            r2 = 3
            if (r9 != r2) goto L3ef
            v5.u r2 = r1.f22474n
            java.util.regex.Pattern r4 = p305r5.C5792e.f22447a
            java.lang.String r4 = r2.m13404g()
            if (r4 != 0) goto L3bd
            r4 = 0
            goto L3ea
        L3bd:
            java.util.regex.Pattern r5 = p305r5.C5792e.f22447a
            java.util.regex.Matcher r6 = r5.matcher(r4)
            boolean r7 = r6.matches()
            if (r7 == 0) goto L3cf
            r7 = 0
            r5.d r4 = p305r5.C5792e.m12151d(r7, r6, r2, r0)
            goto L3ea
        L3cf:
            r7 = 0
            java.lang.String r6 = r2.m13404g()
            if (r6 != 0) goto L3d8
        L3d6:
            r4 = r7
            goto L3ea
        L3d8:
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.matches()
            if (r6 == 0) goto L3d6
            java.lang.String r4 = r4.trim()
            r5.d r4 = p305r5.C5792e.m12151d(r4, r5, r2, r0)
        L3ea:
            if (r4 == 0) goto L3ef
            r3.add(r4)
        L3ef:
            r2 = 0
            goto L2b
        L3f2:
            r5.i r0 = new r5.i
            r0.<init>(r3)
            return r0
        L3f8:
            r0 = move-exception
            i5.h r2 = new i5.h
            r2.<init>(r0)
            throw r2
    }
}

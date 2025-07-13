package ng;

/* renamed from: ng.a */
/* loaded from: classes.dex */
public final class C4819a {
    /* renamed from: a */
    public static final android.text.SpannableStringBuilder m10846a(ng.EnumC4820b r12, mg.C4607e r13) {
            java.lang.String r0 = "transactionType"
            p214m2.C4339q.m9706k(r12, r0)
            int r12 = r12.ordinal()
            java.lang.String r0 = "asset IDs: "
            java.lang.String r1 = "from: "
            java.lang.String r2 = "memo: "
            java.lang.String r3 = "append('\\n')"
            r4 = 10
            java.lang.String r5 = ""
            r6 = -1
            r7 = 17
            r8 = 1
            if (r12 == 0) goto L23e
            java.lang.String r9 = "to: "
            if (r12 == r8) goto L195
            r0 = 2
            if (r12 == r0) goto L11d
            r1 = 3
            if (r12 == r1) goto Lb0
            r1 = 4
            if (r12 != r1) goto Laa
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            mg.b r13 = r13.getActionTrace()
            mg.a r13 = r13.getAct()
            java.util.Map r13 = r13.getData()
            if (r13 != 0) goto L3c
            return r12
        L3c:
            java.util.List r13 = p062dh.C1480p.m4015t(r13)
            r0 = 0
            java.util.Iterator r13 = r13.iterator()
        L45:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r13.next()
            int r2 = r0 + 1
            if (r0 < 0) goto La4
            ch.e r1 = (ch.C0978e) r1
            if (r0 == 0) goto L5e
            java.lang.Appendable r0 = r12.append(r4)
            p214m2.C4339q.m9705j(r0, r3)
        L5e:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r8)
            int r9 = r12.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            A r11 = r1.f5050Y
            java.lang.String r11 = (java.lang.String) r11
            r10.append(r11)
            java.lang.String r11 = ": "
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r12.append(r10)
            int r10 = r12.length()
            r12.setSpan(r0, r9, r10, r7)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r6)
            int r9 = r12.length()
            B r1 = r1.f5051Z
            if (r1 != 0) goto L94
            r1 = r5
        L94:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r12.append(r1)
            int r1 = r12.length()
            r12.setSpan(r0, r9, r1, r7)
            r0 = r2
            goto L45
        La4:
            p074e9.C1805a.m4539x()
            r12 = 0
            throw r12
        La9:
            return r12
        Laa:
            e7.y7 r12 = new e7.y7
            r12.<init>(r0)
            throw r12
        Lb0:
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r8)
            int r1 = r12.length()
            r12.append(r9)
            int r9 = r12.length()
            r12.setSpan(r0, r1, r9, r7)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r6)
            int r1 = r12.length()
            mg.b r9 = r13.getActionTrace()
            mg.a r9 = r9.getAct()
            java.lang.String r9 = r9.getTo()
            if (r9 != 0) goto Le0
            r9 = r5
        Le0:
            r12.append(r9)
            int r9 = r12.length()
            r12.setSpan(r0, r1, r9, r7)
            java.lang.Appendable r0 = r12.append(r4)
            p214m2.C4339q.m9705j(r0, r3)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r8)
            int r1 = r12.length()
            r12.append(r2)
            int r2 = r12.length()
            r12.setSpan(r0, r1, r2, r7)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r6)
            int r1 = r12.length()
            mg.b r13 = r13.getActionTrace()
            mg.a r13 = r13.getAct()
            java.lang.String r13 = r13.getMemo()
            if (r13 != 0) goto L2e6
            goto L2e7
        L11d:
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r8)
            int r9 = r12.length()
            r12.append(r1)
            int r1 = r12.length()
            r12.setSpan(r0, r9, r1, r7)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r6)
            int r1 = r12.length()
            mg.b r9 = r13.getActionTrace()
            mg.a r9 = r9.getAct()
            java.lang.String r9 = r9.getFrom()
            if (r9 != 0) goto L14d
            r9 = r5
        L14d:
            r12.append(r9)
            int r9 = r12.length()
            r12.setSpan(r0, r1, r9, r7)
            java.lang.Appendable r0 = r12.append(r4)
            p214m2.C4339q.m9705j(r0, r3)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r8)
            int r1 = r12.length()
            r12.append(r2)
            int r2 = r12.length()
            r12.setSpan(r0, r1, r2, r7)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r6)
            int r1 = r12.length()
            mg.b r13 = r13.getActionTrace()
            mg.a r13 = r13.getAct()
            java.lang.String r13 = r13.getMemo()
            if (r13 != 0) goto L189
            goto L18a
        L189:
            r5 = r13
        L18a:
            r12.append(r5)
            int r13 = r12.length()
            r12.setSpan(r0, r1, r13, r7)
            return r12
        L195:
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r8)
            int r10 = r12.length()
            r12.append(r9)
            int r9 = r12.length()
            r12.setSpan(r1, r10, r9, r7)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r6)
            int r9 = r12.length()
            mg.b r10 = r13.getActionTrace()
            mg.a r10 = r10.getAct()
            java.lang.String r10 = r10.getTo()
            if (r10 != 0) goto L1c5
            r10 = r5
        L1c5:
            r12.append(r10)
            int r10 = r12.length()
            r12.setSpan(r1, r9, r10, r7)
            java.lang.Appendable r1 = r12.append(r4)
            p214m2.C4339q.m9705j(r1, r3)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r8)
            int r9 = r12.length()
            r12.append(r0)
            int r0 = r12.length()
            r12.setSpan(r1, r9, r0, r7)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r6)
            int r1 = r12.length()
            mg.b r9 = r13.getActionTrace()
            mg.a r9 = r9.getAct()
            java.lang.String r9 = r9.getAssets()
            if (r9 != 0) goto L201
            r9 = r5
        L201:
            r12.append(r9)
            int r9 = r12.length()
            r12.setSpan(r0, r1, r9, r7)
            java.lang.Appendable r0 = r12.append(r4)
            p214m2.C4339q.m9705j(r0, r3)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r8)
            int r1 = r12.length()
            r12.append(r2)
            int r2 = r12.length()
            r12.setSpan(r0, r1, r2, r7)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r6)
            int r1 = r12.length()
            mg.b r13 = r13.getActionTrace()
            mg.a r13 = r13.getAct()
            java.lang.String r13 = r13.getMemo()
            if (r13 != 0) goto L2e6
            goto L2e7
        L23e:
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            android.text.style.StyleSpan r9 = new android.text.style.StyleSpan
            r9.<init>(r8)
            int r10 = r12.length()
            r12.append(r1)
            int r1 = r12.length()
            r12.setSpan(r9, r10, r1, r7)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r6)
            int r9 = r12.length()
            mg.b r10 = r13.getActionTrace()
            mg.a r10 = r10.getAct()
            java.lang.String r10 = r10.getFrom()
            if (r10 != 0) goto L26e
            r10 = r5
        L26e:
            r12.append(r10)
            int r10 = r12.length()
            r12.setSpan(r1, r9, r10, r7)
            java.lang.Appendable r1 = r12.append(r4)
            p214m2.C4339q.m9705j(r1, r3)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r8)
            int r9 = r12.length()
            r12.append(r0)
            int r0 = r12.length()
            r12.setSpan(r1, r9, r0, r7)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r6)
            int r1 = r12.length()
            mg.b r9 = r13.getActionTrace()
            mg.a r9 = r9.getAct()
            java.lang.String r9 = r9.getAssets()
            if (r9 != 0) goto L2aa
            r9 = r5
        L2aa:
            r12.append(r9)
            int r9 = r12.length()
            r12.setSpan(r0, r1, r9, r7)
            java.lang.Appendable r0 = r12.append(r4)
            p214m2.C4339q.m9705j(r0, r3)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r8)
            int r1 = r12.length()
            r12.append(r2)
            int r2 = r12.length()
            r12.setSpan(r0, r1, r2, r7)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r6)
            int r1 = r12.length()
            mg.b r13 = r13.getActionTrace()
            mg.a r13 = r13.getAct()
            java.lang.String r13 = r13.getMemo()
            if (r13 != 0) goto L2e6
            goto L2e7
        L2e6:
            r5 = r13
        L2e7:
            r12.append(r5)
            int r13 = r12.length()
            r12.setSpan(r0, r1, r13, r7)
            return r12
    }
}

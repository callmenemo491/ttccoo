package p030c0;

/* renamed from: c0.o */
/* loaded from: classes.dex */
public class C0828o implements p030c0.InterfaceC0822i {

    /* renamed from: a */
    public final android.content.Context f4488a;

    /* renamed from: b */
    public final android.app.Notification.Builder f4489b;

    /* renamed from: c */
    public final p030c0.C0826m f4490c;

    /* renamed from: d */
    public final java.util.List<android.os.Bundle> f4491d;

    /* renamed from: e */
    public final android.os.Bundle f4492e;

    public C0828o(p030c0.C0826m r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            r16.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f4491d = r2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r0.f4492e = r2
            r0.f4490c = r1
            android.content.Context r2 = r1.f4461a
            r0.f4488a = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L2b
            android.app.Notification$Builder r2 = new android.app.Notification$Builder
            android.content.Context r4 = r1.f4461a
            java.lang.String r5 = r1.f4482v
            r2.<init>(r4, r5)
            goto L32
        L2b:
            android.app.Notification$Builder r2 = new android.app.Notification$Builder
            android.content.Context r4 = r1.f4461a
            r2.<init>(r4)
        L32:
            r0.f4489b = r2
            android.app.Notification r4 = r1.f4485y
            long r5 = r4.when
            android.app.Notification$Builder r5 = r2.setWhen(r5)
            int r6 = r4.icon
            int r7 = r4.iconLevel
            android.app.Notification$Builder r5 = r5.setSmallIcon(r6, r7)
            android.widget.RemoteViews r6 = r4.contentView
            android.app.Notification$Builder r5 = r5.setContent(r6)
            java.lang.CharSequence r6 = r4.tickerText
            r7 = 0
            android.app.Notification$Builder r5 = r5.setTicker(r6, r7)
            long[] r6 = r4.vibrate
            android.app.Notification$Builder r5 = r5.setVibrate(r6)
            int r6 = r4.ledARGB
            int r8 = r4.ledOnMS
            int r9 = r4.ledOffMS
            android.app.Notification$Builder r5 = r5.setLights(r6, r8, r9)
            int r6 = r4.flags
            r6 = r6 & 2
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L6b
            r6 = 1
            goto L6c
        L6b:
            r6 = 0
        L6c:
            android.app.Notification$Builder r5 = r5.setOngoing(r6)
            int r6 = r4.flags
            r6 = r6 & 8
            if (r6 == 0) goto L78
            r6 = 1
            goto L79
        L78:
            r6 = 0
        L79:
            android.app.Notification$Builder r5 = r5.setOnlyAlertOnce(r6)
            int r6 = r4.flags
            r6 = r6 & 16
            if (r6 == 0) goto L85
            r6 = 1
            goto L86
        L85:
            r6 = 0
        L86:
            android.app.Notification$Builder r5 = r5.setAutoCancel(r6)
            int r6 = r4.defaults
            android.app.Notification$Builder r5 = r5.setDefaults(r6)
            java.lang.CharSequence r6 = r1.f4465e
            android.app.Notification$Builder r5 = r5.setContentTitle(r6)
            java.lang.CharSequence r6 = r1.f4466f
            android.app.Notification$Builder r5 = r5.setContentText(r6)
            android.app.Notification$Builder r5 = r5.setContentInfo(r7)
            android.app.PendingIntent r6 = r1.f4467g
            android.app.Notification$Builder r5 = r5.setContentIntent(r6)
            android.app.PendingIntent r6 = r4.deleteIntent
            android.app.Notification$Builder r5 = r5.setDeleteIntent(r6)
            int r6 = r4.flags
            r6 = r6 & 128(0x80, float:1.8E-43)
            if (r6 == 0) goto Lb3
            goto Lb4
        Lb3:
            r8 = 0
        Lb4:
            android.app.Notification$Builder r5 = r5.setFullScreenIntent(r7, r8)
            android.graphics.Bitmap r6 = r1.f4468h
            android.app.Notification$Builder r5 = r5.setLargeIcon(r6)
            int r6 = r1.f4469i
            android.app.Notification$Builder r5 = r5.setNumber(r6)
            r5.setProgress(r9, r9, r9)
            java.lang.CharSequence r5 = r1.f4474n
            android.app.Notification$Builder r2 = r2.setSubText(r5)
            boolean r5 = r1.f4472l
            android.app.Notification$Builder r2 = r2.setUsesChronometer(r5)
            int r5 = r1.f4470j
            r2.setPriority(r5)
            java.util.ArrayList<c0.j> r2 = r1.f4462b
            java.util.Iterator r2 = r2.iterator()
        Lde:
            boolean r5 = r2.hasNext()
            java.lang.String r8 = "android.support.allowGeneratedReplies"
            r10 = 23
            r11 = 29
            if (r5 == 0) goto L1aa
            java.lang.Object r5 = r2.next()
            c0.j r5 = (p030c0.C0823j) r5
            int r13 = android.os.Build.VERSION.SDK_INT
            androidx.core.graphics.drawable.IconCompat r14 = r5.m2474a()
            if (r13 < r10) goto L10a
            android.app.Notification$Action$Builder r10 = new android.app.Notification$Action$Builder
            if (r14 == 0) goto L101
            android.graphics.drawable.Icon r13 = r14.m1014h()
            goto L102
        L101:
            r13 = r7
        L102:
            java.lang.CharSequence r14 = r5.f4455j
            android.app.PendingIntent r15 = r5.f4456k
            r10.<init>(r13, r14, r15)
            goto L11b
        L10a:
            android.app.Notification$Action$Builder r10 = new android.app.Notification$Action$Builder
            if (r14 == 0) goto L113
            int r13 = r14.m1009c()
            goto L114
        L113:
            r13 = 0
        L114:
            java.lang.CharSequence r14 = r5.f4455j
            android.app.PendingIntent r15 = r5.f4456k
            r10.<init>(r13, r14, r15)
        L11b:
            c0.s[] r13 = r5.f4448c
            if (r13 == 0) goto L15b
            int r14 = r13.length
            android.app.RemoteInput[] r15 = new android.app.RemoteInput[r14]
            r3 = 0
        L123:
            int r12 = r13.length
            if (r3 >= r12) goto L150
            r12 = r13[r3]
            android.app.RemoteInput$Builder r6 = new android.app.RemoteInput$Builder
            java.util.Objects.requireNonNull(r12)
            r6.<init>(r7)
            android.app.RemoteInput$Builder r6 = r6.setLabel(r7)
            android.app.RemoteInput$Builder r6 = r6.setChoices(r7)
            android.app.RemoteInput$Builder r6 = r6.setAllowFreeFormInput(r9)
            android.app.RemoteInput$Builder r6 = r6.addExtras(r7)
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r11) goto L147
            r6.setEditChoicesBeforeSending(r9)
        L147:
            android.app.RemoteInput r6 = r6.build()
            r15[r3] = r6
            int r3 = r3 + 1
            goto L123
        L150:
            r3 = 0
        L151:
            if (r3 >= r14) goto L15b
            r6 = r15[r3]
            r10.addRemoteInput(r6)
            int r3 = r3 + 1
            goto L151
        L15b:
            android.os.Bundle r3 = r5.f4446a
            if (r3 == 0) goto L167
            android.os.Bundle r3 = new android.os.Bundle
            android.os.Bundle r6 = r5.f4446a
            r3.<init>(r6)
            goto L16c
        L167:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        L16c:
            boolean r6 = r5.f4450e
            r3.putBoolean(r8, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r6 < r8) goto L17c
            boolean r8 = r5.f4450e
            r10.setAllowGeneratedReplies(r8)
        L17c:
            int r8 = r5.f4452g
            java.lang.String r12 = "android.support.action.semanticAction"
            r3.putInt(r12, r8)
            r8 = 28
            if (r6 < r8) goto L18c
            int r8 = r5.f4452g
            r10.setSemanticAction(r8)
        L18c:
            if (r6 < r11) goto L193
            boolean r6 = r5.f4453h
            r10.setContextual(r6)
        L193:
            boolean r5 = r5.f4451f
            java.lang.String r6 = "android.support.action.showsUserInterface"
            r3.putBoolean(r6, r5)
            r10.addExtras(r3)
            android.app.Notification$Builder r3 = r0.f4489b
            android.app.Notification$Action r5 = r10.build()
            r3.addAction(r5)
            r3 = 26
            goto Lde
        L1aa:
            android.os.Bundle r2 = r1.f4479s
            if (r2 == 0) goto L1b3
            android.os.Bundle r3 = r0.f4492e
            r3.putAll(r2)
        L1b3:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.app.Notification$Builder r3 = r0.f4489b
            boolean r5 = r1.f4471k
            r3.setShowWhen(r5)
            android.app.Notification$Builder r3 = r0.f4489b
            boolean r5 = r1.f4476p
            android.app.Notification$Builder r3 = r3.setLocalOnly(r5)
            java.lang.String r5 = r1.f4475o
            android.app.Notification$Builder r3 = r3.setGroup(r5)
            android.app.Notification$Builder r3 = r3.setGroupSummary(r9)
            r3.setSortKey(r7)
            android.app.Notification$Builder r3 = r0.f4489b
            android.app.Notification$Builder r3 = r3.setCategory(r7)
            int r5 = r1.f4480t
            android.app.Notification$Builder r3 = r3.setColor(r5)
            int r5 = r1.f4481u
            android.app.Notification$Builder r3 = r3.setVisibility(r5)
            android.app.Notification$Builder r3 = r3.setPublicVersion(r7)
            android.net.Uri r5 = r4.sound
            android.media.AudioAttributes r4 = r4.audioAttributes
            r3.setSound(r5, r4)
            r3 = 28
            if (r2 >= r3) goto L1ff
            java.util.ArrayList<c0.r> r2 = r1.f4463c
            java.util.List r2 = m2493b(r2)
            java.util.ArrayList<java.lang.String> r3 = r1.f4486z
            java.util.List r2 = m2492a(r2, r3)
            goto L201
        L1ff:
            java.util.ArrayList<java.lang.String> r2 = r1.f4486z
        L201:
            if (r2 == 0) goto L21f
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L21f
            java.util.Iterator r2 = r2.iterator()
        L20d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.app.Notification$Builder r4 = r0.f4489b
            r4.addPerson(r3)
            goto L20d
        L21f:
            java.util.ArrayList<c0.j> r2 = r1.f4464d
            int r2 = r2.size()
            if (r2 <= 0) goto L2dd
            android.os.Bundle r2 = r1.f4479s
            if (r2 != 0) goto L232
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r1.f4479s = r2
        L232:
            android.os.Bundle r2 = r1.f4479s
            java.lang.String r3 = "android.car.EXTENSIONS"
            android.os.Bundle r2 = r2.getBundle(r3)
            if (r2 != 0) goto L241
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L241:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r2)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r6 = 0
        L24c:
            java.util.ArrayList<c0.j> r10 = r1.f4464d
            int r10 = r10.size()
            if (r6 >= r10) goto L2c0
            java.lang.String r10 = java.lang.Integer.toString(r6)
            java.util.ArrayList<c0.j> r12 = r1.f4464d
            java.lang.Object r12 = r12.get(r6)
            c0.j r12 = (p030c0.C0823j) r12
            java.lang.Object r13 = p030c0.C0829p.f4493a
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            androidx.core.graphics.drawable.IconCompat r14 = r12.m2474a()
            if (r14 == 0) goto L272
            int r14 = r14.m1009c()
            goto L273
        L272:
            r14 = 0
        L273:
            java.lang.String r15 = "icon"
            r13.putInt(r15, r14)
            java.lang.CharSequence r14 = r12.f4455j
            java.lang.String r15 = "title"
            r13.putCharSequence(r15, r14)
            android.app.PendingIntent r14 = r12.f4456k
            java.lang.String r15 = "actionIntent"
            r13.putParcelable(r15, r14)
            android.os.Bundle r14 = r12.f4446a
            if (r14 == 0) goto L292
            android.os.Bundle r14 = new android.os.Bundle
            android.os.Bundle r15 = r12.f4446a
            r14.<init>(r15)
            goto L297
        L292:
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
        L297:
            boolean r15 = r12.f4450e
            r14.putBoolean(r8, r15)
            java.lang.String r15 = "extras"
            r13.putBundle(r15, r14)
            c0.s[] r14 = r12.f4448c
            android.os.Bundle[] r14 = p030c0.C0829p.m2494a(r14)
            java.lang.String r15 = "remoteInputs"
            r13.putParcelableArray(r15, r14)
            boolean r14 = r12.f4451f
            java.lang.String r15 = "showsUserInterface"
            r13.putBoolean(r15, r14)
            int r12 = r12.f4452g
            java.lang.String r14 = "semanticAction"
            r13.putInt(r14, r12)
            r5.putBundle(r10, r13)
            int r6 = r6 + 1
            goto L24c
        L2c0:
            java.lang.String r6 = "invisible_actions"
            r2.putBundle(r6, r5)
            r4.putBundle(r6, r5)
            android.os.Bundle r5 = r1.f4479s
            if (r5 != 0) goto L2d3
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r1.f4479s = r5
        L2d3:
            android.os.Bundle r5 = r1.f4479s
            r5.putBundle(r3, r2)
            android.os.Bundle r2 = r0.f4492e
            r2.putBundle(r3, r4)
        L2dd:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L2ee
            android.app.Notification$Builder r3 = r0.f4489b
            android.os.Bundle r4 = r1.f4479s
            android.app.Notification$Builder r3 = r3.setExtras(r4)
            r3.setRemoteInputHistory(r7)
        L2ee:
            r3 = 26
            if (r2 < r3) goto L32f
            android.app.Notification$Builder r3 = r0.f4489b
            int r4 = r1.f4483w
            android.app.Notification$Builder r3 = r3.setBadgeIconType(r4)
            android.app.Notification$Builder r3 = r3.setSettingsText(r7)
            android.app.Notification$Builder r3 = r3.setShortcutId(r7)
            r4 = 0
            android.app.Notification$Builder r3 = r3.setTimeoutAfter(r4)
            r3.setGroupAlertBehavior(r9)
            boolean r3 = r1.f4478r
            if (r3 == 0) goto L316
            android.app.Notification$Builder r3 = r0.f4489b
            boolean r4 = r1.f4477q
            r3.setColorized(r4)
        L316:
            java.lang.String r3 = r1.f4482v
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L32f
            android.app.Notification$Builder r3 = r0.f4489b
            android.app.Notification$Builder r3 = r3.setSound(r7)
            android.app.Notification$Builder r3 = r3.setDefaults(r9)
            android.app.Notification$Builder r3 = r3.setLights(r9, r9, r9)
            r3.setVibrate(r7)
        L32f:
            r3 = 28
            if (r2 < r3) goto L36f
            java.util.ArrayList<c0.r> r2 = r1.f4463c
            java.util.Iterator r2 = r2.iterator()
        L339:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L36f
            java.lang.Object r3 = r2.next()
            c0.r r3 = (p030c0.C0831r) r3
            android.app.Notification$Builder r4 = r0.f4489b
            java.util.Objects.requireNonNull(r3)
            android.app.Person$Builder r3 = new android.app.Person$Builder
            r3.<init>()
            android.app.Person$Builder r3 = r3.setName(r7)
            android.app.Person$Builder r3 = r3.setIcon(r7)
            android.app.Person$Builder r3 = r3.setUri(r7)
            android.app.Person$Builder r3 = r3.setKey(r7)
            android.app.Person$Builder r3 = r3.setBot(r9)
            android.app.Person$Builder r3 = r3.setImportant(r9)
            android.app.Person r3 = r3.build()
            r4.addPerson(r3)
            goto L339
        L36f:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r11) goto L37f
            android.app.Notification$Builder r2 = r0.f4489b
            boolean r1 = r1.f4484x
            r2.setAllowSystemGeneratedContextualActions(r1)
            android.app.Notification$Builder r1 = r0.f4489b
            r1.setBubbleMetadata(r7)
        L37f:
            p158j0.C3379a.m7754a()
            return
    }

    /* renamed from: a */
    public static java.util.List<java.lang.String> m2492a(java.util.List<java.lang.String> r3, java.util.List<java.lang.String> r4) {
            if (r3 != 0) goto L3
            return r4
        L3:
            if (r4 != 0) goto L6
            return r3
        L6:
            s.c r0 = new s.c
            int r1 = r3.size()
            int r2 = r4.size()
            int r2 = r2 + r1
            r0.<init>(r2)
            r0.addAll(r3)
            r0.addAll(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            return r3
    }

    /* renamed from: b */
    public static java.util.List<java.lang.String> m2493b(java.util.List<p030c0.C0831r> r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r2.next()
            c0.r r1 = (p030c0.C0831r) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = ""
            r0.add(r1)
            goto L11
        L26:
            return r0
    }
}

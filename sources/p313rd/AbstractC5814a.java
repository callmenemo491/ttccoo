package p313rd;

/* renamed from: rd.a */
/* loaded from: classes.dex */
public abstract class AbstractC5814a implements p313rd.InterfaceC5816c {

    /* renamed from: Y */
    public int f22533Y;

    /* renamed from: Z */
    public final java.util.List<mh.InterfaceC4620l<java.lang.Boolean, ch.C0985l>> f22534Z;

    /* renamed from: a0 */
    public final java.util.List<mh.InterfaceC4620l<java.lang.Boolean, ch.C0985l>> f22535a0;

    public AbstractC5814a() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f22533Y = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f22534Z = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f22535a0 = r0
            return
    }

    /* renamed from: a */
    public final void m12189a(int r5) {
            r4 = this;
            r0 = 3
            if (r5 == r0) goto L9
            r1 = 4
            if (r5 == r1) goto L9
            r4.f22533Y = r5
            goto L30
        L9:
            java.util.List<mh.l<java.lang.Boolean, ch.l>> r1 = r4.f22534Z
            monitor-enter(r1)
            r4.f22533Y = r5     // Catch: java.lang.Throwable -> L31
            java.util.List<mh.l<java.lang.Boolean, ch.l>> r5 = r4.f22534Z     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L31
        L14:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L31
            mh.l r2 = (mh.InterfaceC4620l) r2     // Catch: java.lang.Throwable -> L31
            int r3 = r4.f22533Y     // Catch: java.lang.Throwable -> L31
            if (r3 != r0) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L31
            r2.mo107b(r3)     // Catch: java.lang.Throwable -> L31
            goto L14
        L2f:
            monitor-exit(r1)
        L30:
            return
        L31:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
    }

    /* renamed from: e */
    public boolean m12190e(mh.InterfaceC4620l<? super java.lang.Boolean, ch.C0985l> r2) {
            r1 = this;
            java.util.List<mh.l<java.lang.Boolean, ch.l>> r0 = r1.f22535a0
            r0.add(r2)
            r2 = 1
            return r2
    }

    @Override // p313rd.InterfaceC5816c
    /* renamed from: o */
    public boolean mo12191o(mh.InterfaceC4620l<? super java.lang.Boolean, ch.C0985l> r5) {
            r4 = this;
            int r0 = r4.f22533Y
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L16
            r3 = 4
            if (r0 == r3) goto Ld
            r1 = 1
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.mo107b(r0)
            r1 = 1
            goto L1b
        L16:
            java.util.List<mh.l<java.lang.Boolean, ch.l>> r0 = r4.f22534Z
            r0.add(r5)
        L1b:
            return r1
    }

    @Override // p313rd.InterfaceC5816c
    /* renamed from: y */
    public java.util.List<android.support.v4.media.MediaMetadataCompat> mo12192y(java.lang.String r17, android.os.Bundle r18) {
            r16 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "query"
            p214m2.C4339q.m9706k(r0, r2)
            java.lang.String r2 = "android.intent.extra.focus"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r3 = "vnd.android.cursor.item/genre"
            boolean r3 = p214m2.C4339q.m9702c(r2, r3)
            java.lang.String r4 = "android.media.metadata.TITLE"
            java.lang.String r5 = "android.media.metadata.GENRE"
            java.lang.String r6 = "MusicSource"
            r7 = 39
            r9 = 1
            if (r3 == 0) goto L65
            java.lang.String r2 = "android.intent.extra.genre"
            java.lang.Object r1 = r1.get(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Focused genre search: '"
            r2.append(r3)
            r2.append(r1)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r6, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r16
            cg.d r3 = (cg.C0962d) r3
            java.util.Iterator r3 = r3.iterator()
        L4a:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L1c3
            java.lang.Object r10 = r3.next()
            r11 = r10
            android.support.v4.media.MediaMetadataCompat r11 = (android.support.v4.media.MediaMetadataCompat) r11
            java.lang.String r11 = r11.m231e(r5)
            boolean r11 = p214m2.C4339q.m9702c(r11, r1)
            if (r11 == 0) goto L4a
            r2.add(r10)
            goto L4a
        L65:
            java.lang.String r3 = "vnd.android.cursor.item/artist"
            boolean r3 = p214m2.C4339q.m9702c(r2, r3)
            java.lang.String r10 = "android.media.metadata.ALBUM_ARTIST"
            java.lang.String r11 = "android.media.metadata.ARTIST"
            java.lang.String r12 = "android.intent.extra.artist"
            if (r3 == 0) goto Lc6
            java.lang.Object r1 = r1.get(r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Focused artist search: '"
            r2.append(r3)
            r2.append(r1)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r6, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r16
            cg.d r3 = (cg.C0962d) r3
            java.util.Iterator r3 = r3.iterator()
        L9b:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L1c3
            java.lang.Object r12 = r3.next()
            r13 = r12
            android.support.v4.media.MediaMetadataCompat r13 = (android.support.v4.media.MediaMetadataCompat) r13
            java.lang.String r14 = r13.m231e(r11)
            boolean r14 = p214m2.C4339q.m9702c(r14, r1)
            if (r14 != 0) goto Lbf
            java.lang.String r13 = r13.m231e(r10)
            boolean r13 = p214m2.C4339q.m9702c(r13, r1)
            if (r13 == 0) goto Lbd
            goto Lbf
        Lbd:
            r13 = 0
            goto Lc0
        Lbf:
            r13 = 1
        Lc0:
            if (r13 == 0) goto L9b
            r2.add(r12)
            goto L9b
        Lc6:
            java.lang.String r3 = "vnd.android.cursor.item/album"
            boolean r3 = p214m2.C4339q.m9702c(r2, r3)
            java.lang.String r13 = "android.media.metadata.ALBUM"
            java.lang.String r14 = "' artist='"
            java.lang.String r15 = "android.intent.extra.album"
            if (r3 == 0) goto L13a
            java.lang.Object r2 = r1.get(r12)
            java.lang.Object r1 = r1.get(r15)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = "Focused album search: album='"
            r3.append(r12)
            r3.append(r1)
            r3.append(r14)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r6, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r12 = r16
            cg.d r12 = (cg.C0962d) r12
            java.util.Iterator r12 = r12.iterator()
        L103:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L137
            java.lang.Object r14 = r12.next()
            r15 = r14
            android.support.v4.media.MediaMetadataCompat r15 = (android.support.v4.media.MediaMetadataCompat) r15
            java.lang.String r8 = r15.m231e(r11)
            boolean r8 = p214m2.C4339q.m9702c(r8, r2)
            if (r8 != 0) goto L124
            java.lang.String r8 = r15.m231e(r10)
            boolean r8 = p214m2.C4339q.m9702c(r8, r2)
            if (r8 == 0) goto L130
        L124:
            java.lang.String r8 = r15.m231e(r13)
            boolean r8 = p214m2.C4339q.m9702c(r8, r1)
            if (r8 == 0) goto L130
            r8 = 1
            goto L131
        L130:
            r8 = 0
        L131:
            if (r8 == 0) goto L103
            r3.add(r14)
            goto L103
        L137:
            r2 = r3
            goto L1c3
        L13a:
            java.lang.String r3 = "vnd.android.cursor.item/audio"
            boolean r2 = p214m2.C4339q.m9702c(r2, r3)
            if (r2 == 0) goto L1c1
            java.lang.String r2 = "android.intent.extra.title"
            java.lang.Object r2 = r1.get(r2)
            java.lang.Object r3 = r1.get(r15)
            java.lang.Object r1 = r1.get(r12)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "Focused media search: title='"
            r8.append(r12)
            r8.append(r2)
            java.lang.String r12 = "' album='"
            r8.append(r12)
            r8.append(r3)
            r8.append(r14)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r6, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r12 = r16
            cg.d r12 = (cg.C0962d) r12
            java.util.Iterator r12 = r12.iterator()
        L17f:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L1bf
            java.lang.Object r14 = r12.next()
            r15 = r14
            android.support.v4.media.MediaMetadataCompat r15 = (android.support.v4.media.MediaMetadataCompat) r15
            java.lang.String r7 = r15.m231e(r11)
            boolean r7 = p214m2.C4339q.m9702c(r7, r1)
            if (r7 != 0) goto L1a0
            java.lang.String r7 = r15.m231e(r10)
            boolean r7 = p214m2.C4339q.m9702c(r7, r1)
            if (r7 == 0) goto L1b6
        L1a0:
            java.lang.String r7 = r15.m231e(r13)
            boolean r7 = p214m2.C4339q.m9702c(r7, r3)
            if (r7 == 0) goto L1b6
            java.lang.String r7 = r15.m231e(r4)
            boolean r7 = p214m2.C4339q.m9702c(r7, r2)
            if (r7 == 0) goto L1b6
            r7 = 1
            goto L1b7
        L1b6:
            r7 = 0
        L1b7:
            if (r7 == 0) goto L1bc
            r8.add(r14)
        L1bc:
            r7 = 39
            goto L17f
        L1bf:
            r2 = r8
            goto L1c3
        L1c1:
            dh.k r2 = p062dh.C1475k.f7237Y
        L1c3:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L22f
            boolean r1 = p362uh.C6463i.m13054K(r17)
            r1 = r1 ^ r9
            if (r1 == 0) goto L222
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unfocused search for '"
            r1.append(r2)
            r1.append(r0)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r6, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r16
            cg.d r2 = (cg.C0962d) r2
            java.util.Iterator r2 = r2.iterator()
        L1f6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L221
            java.lang.Object r3 = r2.next()
            r6 = r3
            android.support.v4.media.MediaMetadataCompat r6 = (android.support.v4.media.MediaMetadataCompat) r6
            java.lang.String r7 = r6.m231e(r4)
            boolean r7 = p185k7.C3828h5.m8590e(r7, r0)
            if (r7 != 0) goto L21a
            java.lang.String r6 = r6.m231e(r5)
            boolean r6 = p185k7.C3828h5.m8590e(r6, r0)
            if (r6 == 0) goto L218
            goto L21a
        L218:
            r6 = 0
            goto L21b
        L21a:
            r6 = 1
        L21b:
            if (r6 == 0) goto L1f6
            r1.add(r3)
            goto L1f6
        L221:
            return r1
        L222:
            java.lang.String r0 = "Unfocused search without keyword"
            android.util.Log.d(r6, r0)
            java.util.List r0 = p062dh.C1473i.m4008T(r16)
            java.util.Collections.shuffle(r0)
            return r0
        L22f:
            return r2
    }
}

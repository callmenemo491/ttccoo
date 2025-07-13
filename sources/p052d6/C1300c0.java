package p052d6;

/* renamed from: d6.c0 */
/* loaded from: classes.dex */
public final class C1300c0 implements android.os.Parcelable.Creator<p052d6.C1297b> {
    public C1300c0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p052d6.C1297b createFromParcel(android.os.Parcel r20) {
            r19 = this;
            r0 = r20
            int r1 = p270p6.C5368b.m11710t(r20)
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = r2
            r8 = r7
            r10 = r8
            r12 = r10
            r14 = r4
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L18:
            int r2 = r20.dataPosition()
            if (r2 >= r1) goto L7a
            int r2 = r20.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto L74;
                case 3: goto L6e;
                case 4: goto L68;
                case 5: goto L5e;
                case 6: goto L58;
                case 7: goto L4e;
                case 8: goto L48;
                case 9: goto L42;
                case 10: goto L3b;
                case 11: goto L34;
                case 12: goto L2d;
                default: goto L29;
            }
        L29:
            p270p6.C5368b.m11709s(r0, r2)
            goto L18
        L2d:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r18 = r2
            goto L18
        L34:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r17 = r2
            goto L18
        L3b:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r16 = r2
            goto L18
        L42:
            double r2 = p270p6.C5368b.m11702l(r0, r2)
            r14 = r2
            goto L18
        L48:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r13 = r2
            goto L18
        L4e:
            android.os.Parcelable$Creator<e6.a> r3 = p071e6.C1521a.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            e6.a r2 = (p071e6.C1521a) r2
            r12 = r2
            goto L18
        L58:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r11 = r2
            goto L18
        L5e:
            android.os.Parcelable$Creator<c6.h> r3 = p036c6.C0887h.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            c6.h r2 = (p036c6.C0887h) r2
            r10 = r2
            goto L18
        L68:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r9 = r2
            goto L18
        L6e:
            java.util.ArrayList r2 = p270p6.C5368b.m11696f(r0, r2)
            r8 = r2
            goto L18
        L74:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r7 = r2
            goto L18
        L7a:
            p270p6.C5368b.m11699i(r0, r1)
            d6.b r0 = new d6.b
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p052d6.C1297b[] newArray(int r1) {
            r0 = this;
            d6.b[] r1 = new p052d6.C1297b[r1]
            return r1
    }
}

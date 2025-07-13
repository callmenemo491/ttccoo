package p036c6;

/* renamed from: c6.r0 */
/* loaded from: classes.dex */
public final class C0908r0 implements android.os.Parcelable.Creator<p036c6.C0897m> {
    public C0908r0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0897m createFromParcel(android.os.Parcel r18) {
            r17 = this;
            r0 = r18
            int r1 = p270p6.C5368b.m11710t(r18)
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = r3
            r8 = r7
            r10 = r8
            r11 = r10
            r13 = r11
            r15 = r4
            r9 = 0
            r12 = 0
            r14 = 0
        L13:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L64
            int r2 = r18.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto L5e;
                case 3: goto L58;
                case 4: goto L52;
                case 5: goto L4c;
                case 6: goto L42;
                case 7: goto L3c;
                case 8: goto L34;
                case 9: goto L2e;
                case 10: goto L28;
                default: goto L24;
            }
        L24:
            p270p6.C5368b.m11709s(r0, r2)
            goto L13
        L28:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r15 = r2
            goto L13
        L2e:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r14 = r2
            goto L13
        L34:
            android.os.Parcelable$Creator<c6.n> r3 = p036c6.C0899n.CREATOR
            java.util.ArrayList r2 = p270p6.C5368b.m11698h(r0, r2, r3)
            r13 = r2
            goto L13
        L3c:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r12 = r2
            goto L13
        L42:
            android.os.Parcelable$Creator<c6.l> r3 = p036c6.C0895l.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            c6.l r2 = (p036c6.C0895l) r2
            r11 = r2
            goto L13
        L4c:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r10 = r2
            goto L13
        L52:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r9 = r2
            goto L13
        L58:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r8 = r2
            goto L13
        L5e:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r7 = r2
            goto L13
        L64:
            p270p6.C5368b.m11699i(r0, r1)
            c6.m r0 = new c6.m
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0897m[] newArray(int r1) {
            r0 = this;
            c6.m[] r1 = new p036c6.C0897m[r1]
            return r1
    }
}
